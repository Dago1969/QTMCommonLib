package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO ruolo centralizzato per QTM.
 * Unificato da TENAPP e QTMDB.
 */
@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    private String id;
    private String name;
    private String description;
    private String sourceRoleId;
    private Long tenantId;
    /**
     * Tenant associato al ruolo (nullabile, id).
     */
    private String father;
    /**
     * ID del ruolo padre da cui è stato ereditato questo ruolo (nullabile).
     */
}
