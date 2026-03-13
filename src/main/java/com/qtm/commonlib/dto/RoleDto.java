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
}
