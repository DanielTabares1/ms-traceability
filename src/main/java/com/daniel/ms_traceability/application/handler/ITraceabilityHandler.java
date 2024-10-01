package com.daniel.ms_traceability.application.handler;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityHandler {
    Traceability saveTraceability(CreateTraceabilityRequest traceabilityRequest);
    List<Traceability> getTraceabilityByOrderId(long orderId);
}
