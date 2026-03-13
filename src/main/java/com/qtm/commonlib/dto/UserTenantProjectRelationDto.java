package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO per la relazione tra User, Tenant e Project.
 * projectId può essere nullo: utente globale sul tenant.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTenantProjectRelationDto {
    private Long userId;
    private String username;
    private Long tenantId;
    private String tenantName;
    private Long projectId; // può essere nullo
    private String projectCode;
    private boolean superuser;
    /**
     * Email dell'utente (se disponibile).
     */
    private String email;
}
