import java.util.Date;

class Employee {
    private String name;
    private String grade;


    public Employee(String name, String grade) {
        this.name = name;
        this.grade = grade;

    }

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
// Getters and Setters (Omitted for brevity)
	
}