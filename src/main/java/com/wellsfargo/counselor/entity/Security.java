package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {


    @Id
    @GeneratedValue
    @Column(nullable = false)
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private  String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private int quantity;


    public Security(String name, String category, int purchasePrice, int purchaseDate, int quantity){
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
