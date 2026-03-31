import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { PatientApiService, PatientDto } from './core/patient-api.service';
import { NgIf, NgFor, NgClass } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { I18nPropertiesService } from './core/i18n-properties.service';
import { NotificationService } from '../../TENANTS-APP/frontend/src/app/shared/notification.service';

@Component({
  selector: 'app-patients-tester',
  standalone: true,
  templateUrl: './patients-tester.component.html',
  styleUrls: ['./patients-tester.component.css'],
  providers: [PatientApiService],
  imports: [CommonModule, ReactiveFormsModule, FormsModule, NgIf, NgFor, NgClass],
})
export class PatientsTesterComponent implements OnInit {
  searchForm: FormGroup;
  patients: PatientDto[] = [];
  selectedPatient: PatientDto | null = null;
  loading = false;
  translations: Record<string, string> = {};

  constructor(
    private fb: FormBuilder,
    private patientApi: PatientApiService,
    private readonly i18nPropertiesService: I18nPropertiesService,
    private readonly notificationService: NotificationService
  ) {
    this.searchForm = this.fb.group({
      firstName: [''],
      lastName: [''],
      fiscalCode: ['']
    });
  }

  ngOnInit(): void {
    this.i18nPropertiesService.loadTranslations(navigator.language).subscribe({
      next: (translationMap) => {
        this.translations = translationMap;
      }
    });
  }

  t(key: string): string {
    return this.translations[key] ?? key;
  }

  search() {
    this.loading = true;
    this.patientApi.searchPatients(this.searchForm.value).subscribe({
      next: (res: PatientDto[]) => {
        this.patients = res;
        this.loading = false;
        this.notificationService.showSuccess(this.t('patientsTester.success.search'));
      },
      error: (err: any) => {
        this.loading = false;
        this.notificationService.showError(err?.message || this.t('patientsTester.error.generic'));
      }
    });
  }

  selectPatient(p: PatientDto) {
    this.selectedPatient = { ...p };
  }

  startNewPatient() {
    this.selectedPatient = {
      firstName: '',
      lastName: '',
      fiscalCode: '',
      email: '',
      assistedId: '',
      primaryPhone: '',
      secondaryPhone: '',
      region: '',
      province: ''
    };
  }

  clearSelection() {
    this.selectedPatient = null;
  }

  savePatient() {
    if (!this.selectedPatient) return;
    const op = this.selectedPatient.id
      ? this.patientApi.updatePatient(this.selectedPatient.id, this.selectedPatient)
      : this.patientApi.createPatient(this.selectedPatient);
    this.loading = true;
    op.subscribe({
      next: () => {
        this.search();
        this.clearSelection();
        this.notificationService.showSuccess(this.t('patientsTester.success.save'));
        this.loading = false;
      },
      error: (err: any) => {
        this.loading = false;
        this.notificationService.showError(err?.message || this.t('patientsTester.error.generic'));
      }
    });
  }

  deletePatient(id: number) {
    if (!confirm(this.t('patientsTester.confirm.delete'))) return;
    this.loading = true;
    this.patientApi.deletePatient(id).subscribe({
      next: () => {
        this.search();
        this.notificationService.showSuccess(this.t('patientsTester.success.delete'));
        this.loading = false;
      },
      error: (err: any) => {
        this.loading = false;
        this.notificationService.showError(err?.message || this.t('patientsTester.error.generic'));
      }
    });
  }
}
