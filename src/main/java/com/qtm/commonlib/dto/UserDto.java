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
    private Long structureId;
    /**
     * Email dell'utente (univoca, usata per login e comunicazioni).
     */
    private String email;
}
