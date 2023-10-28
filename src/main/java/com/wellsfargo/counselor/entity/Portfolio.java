package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Id
    private long clientId;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {

    }

    public Portfolio(Long clientId, LocalDate creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {return portfolioId;}

    public void setClientId(long clientId) {this.clientId = clientId;}

    public Long getClientId() {return clientId;}

    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

    public LocalDate getCreationDate() {return creationDate;}
}
