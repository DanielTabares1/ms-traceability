package com.daniel.ms_traceability.application.mapper;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.domain.model.Traceability;
import org.springframework.stereotype.Component;

@Component
public class TraceabilityRequestMapper implements ITraceabilityRequestMapper{
    @Override
    public Traceability toModel(CreateTraceabilityRequest traceabilityRequest) {
        return new Traceability(
                traceabilityRequest.getOrderId(),
                traceabilityRequest.getClientId(),
                traceabilityRequest.getClientEmail(),
                traceabilityRequest.getDate(),
                traceabilityRequest.getPreviousState(),
                traceabilityRequest.getNewState(),
                traceabilityRequest.getEmployeeId(),
                traceabilityRequest.getEmployeeEmail()
        );
    }
}
