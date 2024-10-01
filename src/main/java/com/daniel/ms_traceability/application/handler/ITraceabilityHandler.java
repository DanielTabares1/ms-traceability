package com.daniel.ms_traceability.application.handler;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.domain.model.Traceability;

public interface ITraceabilityHandler {
    Traceability saveTraceability(CreateTraceabilityRequest traceabilityRequest);
}
