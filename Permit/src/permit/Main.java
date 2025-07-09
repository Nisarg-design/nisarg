/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit;

import java.util.Scanner;

/**
 * Added Permit system with category selection and validation
 * @author Nisarg
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PermitService service = new PermitService();

        String number;
        do {
            System.out.println("Enter permit number (format: AA-1234):");
            number = scanner.nextLine();
        } while (!service.isValidPermitNumber(number));

        System.out.println("Select category:");
        for (PermitCategory cat : PermitCategory.values()) {
            System.out.println("- " + cat);
        }

        String selected = scanner.nextLine().toUpperCase();
        PermitCategory category = PermitCategory.valueOf(selected);
        Permit permit = service.createPermit(number, category);

        System.out.println("Permit created successfully for " + permit.getPermitNumber() + " under " + permit.getCategory());
    }
}
