
public class Student {
	private String Student_name;
	private int Score;
	private String School_list[];
	
	public Student(String Student_name, int Score, String School_list[]) {
		this.Student_name = Student_name;
		this.Score = Score;
		this.School_list = School_list;
	}
	
	public String getStudent_name() {
		return Student_name;
	}
	
	public int getScore() {
		return Score;
	}
	
	public String[] getSchool_list() {
		return School_list;
	}
	
	public String getSchool(int i) {
		return School_list[i];
	}
}
