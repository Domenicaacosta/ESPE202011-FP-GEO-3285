/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.ConcessionarieSystem.model;

/**
 *
 * @author Domenica
 */
public class Car {
    private String color;
    private String brand;
    private String model;
    private int power;
    private int price;
    private boolean standar;

    public Car(String color, String brand, String model, int power, int price, boolean standar) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.price = price;
        this.standar = standar;
    }
    
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the standar
     */
    public boolean isStandar() {
        return standar;
    }

    /**
     * @param standar the standar to set
     */
    public void setStandar(boolean standar) {
        this.standar = standar;
    }
    
}
