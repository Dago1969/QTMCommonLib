package com.qtm.commonlib.dto;

import lombok.Data;

/**
 * DTO condiviso per l'associazione utente-tenant-ruolo-progetto.
 */
@Data
public class UserRoleProjectDto {
    private Long userId;
    private Long tenantId;
    private String roleId;
    private Long projectId;
}