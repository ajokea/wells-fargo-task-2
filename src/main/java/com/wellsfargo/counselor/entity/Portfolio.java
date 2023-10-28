package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {return portfolioId;}

    public void setClient(Client clientId) {this.client = client;}

    public Client getClient() {return client;}

    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

    public LocalDate getCreationDate() {return creationDate;}
}
