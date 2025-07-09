/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_practical;

/**
 *
 * @author Nisarg
 */
public class Item {
    public int id;
    private final String description;
    private final double price;

    public Item(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String nisargambade(double price) {
        return "The price you entered is $" + price;
    }
}