package com.daniel.ms_traceability.domain.spi;

import com.daniel.ms_traceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    Traceability addTraceability(Traceability traceability);
    List<Traceability> getTraceabilityByOrderId(long orderId);

}
