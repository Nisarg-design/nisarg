/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nisarg
 */


import static org.junit.Assert.*;
import org.junit.Test;
import permit.Student;

public class StudentTest {

    private final Student student = new Student();

    @Test
    public void eligible_year2_grade80_true() {
        assertTrue(student.getsBursary(2, 80.0));
    }

    @Test
    public void notEligible_year1_highGrade_false() {
        assertFalse(student.getsBursary(1, 90.0));
    }

    @Test
    public void notEligible_gradeBelow80_false() {
        assertFalse(student.getsBursary(3, 75.0));
    }

    @Test
    public void boundary_year2_grade80_true() {
        assertTrue(student.getsBursary(2, 80.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalid_yearZero_throws() {
        student.getsBursary(0, 85.0);
    }
}
