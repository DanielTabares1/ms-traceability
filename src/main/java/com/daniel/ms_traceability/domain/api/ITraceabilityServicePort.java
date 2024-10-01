package com.daniel.ms_traceability.domain.api;

import com.daniel.ms_traceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    Traceability addTraceability(Traceability traceability);
    List<Traceability> getTraceabilityByOrderId(long orderId);
}
