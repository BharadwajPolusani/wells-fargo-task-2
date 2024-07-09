package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import javax.xml.crypto.Data;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    @Column(name = "portfolioid",nullable = false)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientid",nullable = false)
    private long clientId;

    @Column(nullable = false)
    private Data creationDate;

    public Portfolio(long portfolioId, long clientId, Data creationDate){
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;


    }

    public long getPortfolioId() {
        return portfolioId;
    }



    public long getClientId() {
        return clientId;
    }



    public Data getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Data creationDate) {
        this.creationDate = creationDate;
    }
}
