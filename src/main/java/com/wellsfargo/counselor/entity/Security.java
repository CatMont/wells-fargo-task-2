package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long SecurityID;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column (nullable = false)
    private String PurchasePrice;

    @Column (nullable = false)
    private String PurchaseDate;

    @Column (nullable = false)
    private String Quantity;

    @ManyToOne
    @JoinColumn(name = "PortfolioID")  // name is the foreign key column in the client table
    private Client PortfolioID;


    public Security(String Name, String Category, String PurchasePrice, String PurchaseDate, String Quantity) {
        this.Name = Name;
        this.Category = Category;
        this.PurchasePrice = PurchasePrice;
        this.PurchaseDate = PurchaseDate;
        this.Quantity = Quantity;
    }


    public Security(){

    }

    public Long getSecurityId() {
        return SecurityID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(String PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

}
