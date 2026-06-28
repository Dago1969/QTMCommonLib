package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO utente centralizzato per QTM.
 * Unificato da TENAPP e QTMDB.
 */
@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private boolean enabled;
    private String roleId;
    private Long projectId;
    /**
     * Client applicativo richiesto in fase di provisioning su Keycloak.
     */
    private String clientId;
    private Long structureId;
    /**
     * Email dell'utente (univoca, usata per login e comunicazioni).
     */
    private String email;
    /**
     * Password generata e assegnata (solo provisioning, non serializzata in output pubblico).
     */
    private String password;

    /**
     * Indica se la password assegnata deve essere temporanea e obbligare il cambio al primo accesso.
     */
    private boolean temporaryPassword;

    /**
     * Numero di telefono dell'utente.
     */
    private String telefono;

    /**
     * Codice fiscale dell'utente.
     */
    private String codiceFiscale;

    /**
     * Data fine validità password.
     */
    private java.time.LocalDate dataFineValiditaPassword;

    /**
     * Canale OTP preferito.
     */
    private String canaleOtp;

    /**
     * Flag per disabilitare l'invio automatico della mail di onboarding (usato quando un client esterno gestisce l'invio).
     * Default: false (invia sempre)
     */
    private boolean skipOnboardingMail = false;

    public boolean isSkipOnboardingMail() {
        return skipOnboardingMail;
    }

    public void setSkipOnboardingMail(boolean skipOnboardingMail) {
        this.skipOnboardingMail = skipOnboardingMail;
    }
}
