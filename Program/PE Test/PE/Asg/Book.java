/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Book {
    private String code;
    private String title;
    private float unitPrice;
    private int quantity;
    public Book(){
    }
    public Book(String code, String title, float unitPrice, int quantity) {
        this.code = code.toUpperCase();
        this.title = title.toUpperCase();
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        title = title.trim().toUpperCase();
        if (title.length()>0) this.title = title;
    }
    public float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return code + "\t" + title + "\t" + unitPrice + "\t" + quantity ;
    }
}
