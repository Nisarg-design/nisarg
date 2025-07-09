/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permitapplication;

/**
 *
 * @author Nisarg
 */
public class Permit {
    private int id;
    private String name;
    private PermitCategory category; // Use enum instead of String
    private String description;

    public Permit() {
    }

    public Permit(int id, String name, PermitCategory category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PermitCategory getCategory() {
        return category;
    }

    public void setCategory(PermitCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", description='" + description + '\'' +
                '}';
    }
}