package com.daniel.ms_traceability.application.mapper;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.domain.model.Traceability;

public interface ITraceabilityRequestMapper {
    Traceability toModel(CreateTraceabilityRequest traceabilityRequest);
}
