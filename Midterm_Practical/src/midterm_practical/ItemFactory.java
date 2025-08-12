package midterm_practical;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nisarg
 */

public class ItemFactory {
    private int nextId = 0;

    public Item create(String description, double price) {
        nextId++;
        return new Item(nextId, description, price);
    }
}
