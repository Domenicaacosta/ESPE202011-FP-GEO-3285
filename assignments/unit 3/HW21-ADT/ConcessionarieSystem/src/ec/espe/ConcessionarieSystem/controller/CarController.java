/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.ConcessionarieSystem.controller;

import ec.espe.ConcessionarieSystem.model.Car;
import java.io.IOException;

import utils.FileManager;

/**
 *
 * @author Domenica
 */
public class CarController {

    public void save(Car car) {

        String data = car.getBrand() + ", " + car.getModel() + ", " + car.getColor() + ", " + car.getPower() + "HP, " + " $" + car.getPrice() + ", " + car.isStandar();
        FileManager.save(data, "cars");
    }

   public String read() {

        String data;
        data = FileManager.read("cars");
        return data;
    }
    
}
