package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long PortfolioID;

    @Column(nullable = false)
    private String CreationDate;

    @ManyToOne
    @JoinColumn(name = "ClientID")  // name is the foreign key column in the client table
    private Client Client;


    public Portfolio(String CreationDate) {
        this.CreationDate = CreationDate;

    }

    public Portfolio(){

    }

    public Long getPortfolioID() {
        return PortfolioID;
    }

    public String CreationDate() {
        return CreationDate;
    }



}
