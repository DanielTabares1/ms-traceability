package com.daniel.ms_traceability.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTraceabilityRequest {
    private long orderId;
    private long clientId;
    private String clientEmail;
    private Date date;
    private String previousState;
    private String newState;
    private long employeeId;
    private String employeeEmail;
}
