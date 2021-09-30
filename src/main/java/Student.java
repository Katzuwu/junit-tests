import java.util.ArrayList;
import java.util.Map;

public class Student {
	private String name;
	private long id;
	private ArrayList<Integer> grades;

	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.grades = new ArrayList<>();
	}

	public void addGrade(int i) {
		grades.add(i);
	}

	public String getName() {
		return name;
	}

	public long getID() {
		return id;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public double getGradeAverage() {
		double total = 0;
		for(Integer grade: grades)
			total += grade;
		return total/grades.size();
	}
}
