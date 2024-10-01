package com.daniel.ms_traceability.application.handler;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.application.mapper.ITraceabilityRequestMapper;
import com.daniel.ms_traceability.domain.api.ITraceabilityServicePort;
import com.daniel.ms_traceability.domain.model.Traceability;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;

    @Override
    public Traceability saveTraceability(CreateTraceabilityRequest traceabilityRequest) {
        Traceability traceability = traceabilityRequestMapper.toModel(traceabilityRequest);
        return traceabilityServicePort.addTraceability(traceability);
    }

    @Override
    public List<Traceability> getTraceabilityByOrderId(long orderId) {
        return traceabilityServicePort.getTraceabilityByOrderId(orderId);
    }
}
