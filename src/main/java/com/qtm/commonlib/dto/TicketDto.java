package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO per comunicazione esterna del ticket.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TicketDto {

    private Long id;
    private String realm;
    private String project;
    private String patientId;
    private String therapeuticPlanId;
    private String ticketType;
    private String status;
    private String title;
    private String description;
    private String contentJson;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
