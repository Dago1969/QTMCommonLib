package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Shared DTO per Doctor usato da moduli tenants.
 */
@Getter
@Setter
@NoArgsConstructor
public class DoctorDto {

    private Long id;
    private String doctorFlyerId;
    private String doctorTypeCode;
    private String fullName;
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
    private Long structureId;
    private Long departmentId;
    private String specialization;
    private List<String> communicationChannels;
    private String otpRecipient;
    private Boolean dataProcessingConsent;
    private LocalDateTime dataProcessingConsentDateTime;
    private String dataProcessingConsentRevocationLog;
    private String additionalConsents;
}
