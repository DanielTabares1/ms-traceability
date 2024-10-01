package com.daniel.ms_traceability.domain.api;

import com.daniel.ms_traceability.domain.model.Traceability;

public interface ITraceabilityServicePort {
    Traceability addTraceability(Traceability traceability);
}
