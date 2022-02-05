package com.akash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppMain {

    public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("resources//Inventory.txt");
                int data = reader.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = reader.read();
                }
                reader.close();


            } catch (IOException e) {
                System.out.println("file not found");
            }
        }



public void getReceipes(){

        FileReader reader1 = null;
        try {
            reader1 = new FileReader("resources//Receipe.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int data1 = 0;
        try {
            data1 = reader1.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(data1 != -1){
            System.out.print((char)data1);
            try {
                data1 = reader1.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static double getAccountsDetails() {
        double account = 0.0;
        try {
            FileReader fr = new FileReader("resources\\accounts.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            System.out.println(str);
            account = Double.parseDouble(str);
            return account;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return account;
    }

    private static FileReader getReceipe(String sandwich) throws FileNotFoundException {
        try {
            FileReader receipe = new FileReader("resources\\Receipe");
            BufferedReader br1 = new BufferedReader(receipe);
            String str1 = br1.readLine();
            System.out.println(str1);
            return receipe;


        } catch (FileNotFoundException e) {
            System.out.println("invalid input");
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}

