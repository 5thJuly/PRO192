/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boibi
 */
public class Product {
   private String ID;
   private String name;
   private double value;
   private int Number;

    public Product() {
    }

    public Product(String ID, String name, double value, int Number) {
        this.ID = ID;
        this.name = name;
        this.value = value;
        this.Number = Number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    @Override
    public String toString() {
        return  "ID = " + ID + "|| Name=" + name + "|| Value=" + value + ", Number = " + Number ;
    }
    
   
   
    
}
