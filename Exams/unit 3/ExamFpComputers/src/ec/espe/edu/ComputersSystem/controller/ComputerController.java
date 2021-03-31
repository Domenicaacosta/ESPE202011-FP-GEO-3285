/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ComputersSystem.controller;

import ec.espe.edu.ComputersSystem.model.Computer;
import utils.FileManager;

/**
 *
 * @author Domenica
 */
public class ComputerController {

    public void save(Computer computer) {

        String data = computer.getBrand() + "; " + computer.getPrice() + "; " + computer.isPc() + "; " + computer.getMemory() + "; " + computer.getOperatingSystem();

        FileManager.save(data, "computer");
    }

    public String read() {

        String data;
        data = FileManager.read("computer.txt");
        return data;
    }
}
