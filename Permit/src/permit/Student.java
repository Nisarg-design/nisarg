/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit;

/**
 *
 * @author Nisarg
 */
public class Student {

    // Rule used for testing:
    // eligible if (currentYear >= 2) AND (gradeAverage >= 80)
    public boolean getsBursary(int currentYear, double gradeAverage) {
        if (currentYear < 1) {
            throw new IllegalArgumentException("currentYear must be >= 1");
        }
        if (!Double.isFinite(gradeAverage) || gradeAverage < 0.0 || gradeAverage > 100.0) {
            throw new IllegalArgumentException("gradeAverage must be 0..100 and finite");
        }
        return currentYear >= 2 && gradeAverage >= 80.0;
    }
}
