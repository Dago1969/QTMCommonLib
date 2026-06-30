package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO condiviso per i referenti associati alle ASL.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ReferentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String role;
    private String phone;
    private String email;
}