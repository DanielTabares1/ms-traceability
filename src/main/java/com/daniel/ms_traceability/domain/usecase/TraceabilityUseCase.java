package com.daniel.ms_traceability.domain.usecase;

import com.daniel.ms_traceability.domain.api.ITraceabilityServicePort;
import com.daniel.ms_traceability.domain.model.Traceability;
import com.daniel.ms_traceability.domain.spi.ITraceabilityPersistencePort;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public Traceability addTraceability(Traceability traceability) {
        return traceabilityPersistencePort.addTraceability(traceability);
    }
}
