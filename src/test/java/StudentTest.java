import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
	Student bob;

	@Before
	public void createStudent(){
		bob = new Student("bob", 10000000L);
	}

	@Test
	public void testStudentCreation(){
		assertNotNull(bob);
	}

	@Test
	public void testGetName(){
		assertEquals("bob", bob.getName());
	}

	@Test
	public void testGetID(){
		assertEquals(10000000L, bob.getID());
	}

	@Test
	public void testGetGrades(){
		bob.addGrade(90);
		bob.addGrade(75);
		assertSame(90, bob.getGrades().get(0));
		assertSame(75, bob.getGrades().get(1));
	}

	@Test
	public void testAddGrade(){
		bob.addGrade(45);
		bob.addGrade(70);
		bob.addGrade(85);
		bob.addGrade(99);
		assertEquals(4, bob.getGrades().size());
	}

	@Test
	public void testGetGradeAverage(){
		bob.addGrade(90);
		bob.addGrade(95);
		bob.addGrade(50);
		bob.addGrade(55);
		bob.addGrade(75);
		assertEquals(73.0, bob.getGradeAverage(), 0);
	}
}
