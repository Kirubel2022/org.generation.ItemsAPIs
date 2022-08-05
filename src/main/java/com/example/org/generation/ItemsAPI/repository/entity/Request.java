package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer requestId;
    private String accepted;
    private String rejected;
    private String pending;
    private Date dateOfRequest;

    public Request(){

    }

    public Request(String accepted, String rejected, String pending, Date dateOfRequest) {
        this.accepted = accepted;
        this.rejected = rejected;
        this.pending = pending;
        this.dateOfRequest = dateOfRequest;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    public String getRejected() {
        return rejected;
    }

    public void setRejected(String rejected) {
        this.rejected = rejected;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }
}
