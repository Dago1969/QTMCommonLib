package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO di output per la configurazione di puntamento client -> TENANTS-APP.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TenantDto {

    private Long id;
    private String clientCode;
    private String clientName;
    private String tenantAppUrl;
    private boolean enabled;
}
