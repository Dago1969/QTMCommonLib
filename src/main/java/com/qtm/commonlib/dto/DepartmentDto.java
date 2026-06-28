package com.qtm.commonlib.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDto {
    private Long id;
    private String areaFunzionale;
    private String reparto;
    private String mainResponsibilities;
    private String exampleSymptoms;
    private Boolean emergenzaUrgenza;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
