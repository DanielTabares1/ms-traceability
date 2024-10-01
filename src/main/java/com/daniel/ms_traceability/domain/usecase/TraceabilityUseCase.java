package com.daniel.ms_traceability.domain.usecase;

import com.daniel.ms_traceability.domain.api.ITraceabilityServicePort;
import com.daniel.ms_traceability.domain.model.Traceability;
import com.daniel.ms_traceability.domain.spi.ITraceabilityPersistencePort;

import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public Traceability addTraceability(Traceability traceability) {
        return traceabilityPersistencePort.addTraceability(traceability);
    }

    @Override
    public List<Traceability> getTraceabilityByOrderId(long orderId) {
        return traceabilityPersistencePort.getTraceabilityByOrderId(orderId);
    }
}
