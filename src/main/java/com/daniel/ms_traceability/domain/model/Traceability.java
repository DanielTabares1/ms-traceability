package com.daniel.ms_traceability.domain.model;

import java.util.Date;

public class Traceability {
    private String id;
    private long orderId;
    private long clientId;
    private String clientEmail;
    private Date date;
    private String previousState;
    private String newState;
    private long employeeId;
    private String employeeEmail;


    public Traceability() {
    }

    public Traceability(String id, long orderId, long clientId, String clientEmail, Date date, String previousState, String newState, long employeeId, String employeeEmail) {
        this.id = id;
        this.orderId = orderId;
        this.clientId = clientId;
        this.clientEmail = clientEmail;
        this.date = date;
        this.previousState = previousState;
        this.newState = newState;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
    }

    public Traceability(long orderId, long clientId, String clientEmail, Date date, String previousState, String newState, long employeeId, String employeeEmail) {
        this.orderId = orderId;
        this.clientId = clientId;
        this.clientEmail = clientEmail;
        this.date = date;
        this.previousState = previousState;
        this.newState = newState;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
