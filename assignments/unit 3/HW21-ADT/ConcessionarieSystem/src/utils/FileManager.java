/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Domenica
 */
public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;

        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;

            } else {
                System.out.println("file already exists");
                created = false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;
    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".txt", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }

    public static String read(String fileName) {
        String direction = new String(), path = "C:\\Users\\Domenica\\OneDrive\\Desktop\\Programacion\\codigos github\\ESPE202011-FP-GEO-3285\\assignments\\unit 3\\HW21-ADT\\ConcessionarieSystem\\txt\\";
        File document = new File(path);

        FileReader fr = null;
        BufferedReader read = null;
        try {
            fr = new FileReader(path);
            read = new BufferedReader(fr);

            while (read.ready()) {
                direction += read.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return direction;

    }
}
