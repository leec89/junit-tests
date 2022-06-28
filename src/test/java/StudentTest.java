import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    // Create a student
    @Test
    public void testCreateStudent(){
        Student name = new Student(1L, "Chris");
        Student anotherPerson = null;

        assertNull(anotherPerson);
        assertNotNull(name);
    }

    // Fields get updated properly
    @Test
    public void testAllFieldsGetUpdated() {

        Student name = new Student(1L, "Dane");

        assertSame(1L, name.getId());
        assertSame("Dane", name.getName());
//        assertSame(null, name.getGrades());
        assertSame(0, name.getGrades().size());

        Student name2 = new Student();
        assertSame(0, name2.getGrades().size());

    }

    // Able to add a grade to the application
    @Test
    public void testAllGradesWorks() {

        Student name = new Student(1L, "Jasmine");

        name.addGrade(100);

        assertSame(100, name.getGrades().get(0));

        name.addGrade(80);
        assertSame(2, name.getGrades().size());
    }

    @Test
    // Average for grade calculation is correct
    public void testAverageGradeWorks() {

        Student name = new Student(1L, "Javier");

        name.addGrade(90);
        name.addGrade(100);

        assertEquals(95, name.getGradeAverage(), 0);

        name.addGrade();
    }

}
