package com.daniel.ms_traceability.domain.spi;

import com.daniel.ms_traceability.domain.model.Traceability;

import java.util.Optional;

public interface ITraceabilityPersistencePort {
    Traceability addTraceability(Traceability traceability);
}
