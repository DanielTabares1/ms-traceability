package com.daniel.ms_traceability.infrastructure.output.mongo.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Traceability")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TraceabilityCollection {
    @Id
    private ObjectId id;
    private long orderId;
    private long clientId;
    private String clientEmail;
    private Date date;
    private String previousState;
    private String newState;
    private long employeeId;
    private String employeeEmail;
}
