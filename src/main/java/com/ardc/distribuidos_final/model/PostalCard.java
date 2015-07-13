package com.ardc.distribuidos_final.model;

import java.io.Serializable;

/**
 * Model for a PostalCard.
 * @author ALVES, R.C.
 */
public class PostalCard implements Serializable{
    
    /**
     * The place from which this card is from.
     */
    private String location;
    
    /**
     * The price which the owner paid to buy this card.
     */
    private float cost;
    
    /**
     * The year in which this card was bought.
     */
    private int year;

    /**
     * Constructor for a PostalCard instance.
     * @param location The place which this card was bought.
     * @param cost The price paid for this card.
     * @param year The year on which this card was bought.
     */
    public PostalCard(String location, float cost, int year) {
        this.location = location;
        this.cost = cost;
        this.year = year;
    }

    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * Método para representar um cartão postal em formato de String.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("[%s]: Location = %s;\nYear = %d;\nCost = %f;\n", "PostalCard", this.location, this.year, this.cost);
    }
}
