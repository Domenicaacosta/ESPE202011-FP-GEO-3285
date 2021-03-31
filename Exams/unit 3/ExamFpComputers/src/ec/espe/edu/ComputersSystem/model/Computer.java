/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ComputersSystem.model;

/**
 *
 * @author Domenica
 */
public class Computer {

    private String brand;
    private float price;
    private boolean pc;
    private float memory;
    private String operatingSystem;

    public Computer(String brand, float price, boolean pc, float memory, String operatingSystem) {
        this.brand = brand;
        this.price = price;
        this.pc = pc;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the pc
     */
    public boolean isPc() {
        return pc;
    }

    /**
     * @param pc the pc to set
     */
    public void setPc(boolean pc) {
        this.pc = pc;
    }

    /**
     * @return the memory
     */
    public float getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(float memory) {
        this.memory = memory;
    }

    /**
     * @return the operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * @param operatingSystem the operatingSystem to set
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
