/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit;

/**
 *
 * @author Nisarg
 */
public class PermitService {
    public boolean isValidPermitNumber(String permitNumber) {
        return permitNumber.matches("[A-Z]{2}-\\d{4}");
    }

    public Permit createPermit(String number, PermitCategory category) {
        return new Permit(number, category);
    }
}
