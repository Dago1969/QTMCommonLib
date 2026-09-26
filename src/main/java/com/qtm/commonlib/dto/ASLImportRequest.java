package com.qtm.commonlib.dto;

import lombok.Data;

import java.util.List;

@Data
public class ASLImportRequest {
    private List<Long> sourceIds;
}
