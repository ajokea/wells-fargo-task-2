package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, float purchasePrice, LocalDate purchaseDate, float quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {return securityId;}

    public void setPortfolio(Portfolio portfolio) {this.portfolio = portfolio;}

    public Portfolio getPortfolio() {return portfolio;}

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setCategory(String category) {this.category = category;}

    public String getCategory() {return category;}

    public void setPurchasePrice(float purchasePrice) {this.purchasePrice = purchasePrice;}

    public float getPurchasePrice() {return purchasePrice;}

    public void setPurchaseDate(LocalDate purchaseDate) {this.purchaseDate = purchaseDate;}

    public LocalDate getPurchaseDate() {return purchaseDate;}

    public void setQuantity(float quantity) {this.quantity = quantity;}

    public float getQuantity() {return quantity;}
}
