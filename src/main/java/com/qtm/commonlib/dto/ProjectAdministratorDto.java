package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO di riepilogo per gli amministratori associati a un progetto.
 */
@Getter
@Setter
@NoArgsConstructor
public class ProjectAdministratorDto {

    private Long userId;
    private String roleId;
    private String username;
    private String email;
}