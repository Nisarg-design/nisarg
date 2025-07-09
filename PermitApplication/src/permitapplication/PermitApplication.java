/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permitapplication;

/**
 *
 * @author Nisarg
 */

public class PermitApplication {

    public static void main(String[] args) {
        // Create a Permit object using the enum
        Permit permit = new Permit(101, "Test Permit", PermitCategory.NISARG_CATEGORY, "This is a test using custom category.");

        // Print it to verify it's working
        System.out.println(permit);
    }
}

