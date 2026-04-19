package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 * DTO paziente condiviso tra tutti i moduli QTM.
 * Usare questa classe per la comunicazione tra moduli e verso l'esterno.
 */
@Getter
@Setter
@NoArgsConstructor
public class PatientDto {
    private Long id;
    private String assistedId;
    private String firstName;
    private String lastName;
    private String fiscalCode;
    private String email;
    private String primaryPhone;
    private String secondaryPhone;
    private Long regionId;
    private String region;
    private Long provinceId;
    private String province;
    private Long cityId;
    private String city;
    private String deliveryAddress;
    private String secondaryAddresses;
    private String communicationChannels;
    private String identificationDocumentReference;
    private Boolean dataProcessingConsent;
    private LocalDateTime dataProcessingConsentDateTime;
    private String dataProcessingConsentRevocationLog;
    private String additionalConsents;
    private String therapyStatus;
    private String prescribingSpecialist;
    private String referenceHospitalStructure;
    private String referencePharmacy;
    private String preferredPickupPharmacy;
    private String deliveryMode;
    private Boolean reminderEnabled;
    private String caregiverFullName;
    private String caregiverPhone;
    private String preferredContact;
    private Long structureId;
    /**
     * Data di nascita del paziente.
     */
    private LocalDate birthDate;

    /**
     * Sesso del paziente ('M'=maschio, 'F'=femmina).
     */
    private String gender;
}
