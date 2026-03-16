package com.qtm.commonlib.dto;

import lombok.Data;

/**
 * DTO per la relazione User-Tenant-Role condiviso tra i moduli.
 */
@Data
public class UserTenantRoleRelationDto {
    private Long id;
    private Long userId;
    private Long tenantId;
    private String roleId;
}
