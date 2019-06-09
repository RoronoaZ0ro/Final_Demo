import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SchoolTest {

	@Test
	public void test() {
		System.out.println("Test1:");
		School sc1 = new School("台大", 2, 1);
		
		String School_list[] = {"台大","清大"};
		Student st1 = new Student("Student_1", 80, School_list);
		
		String School_list_2[] = {"台大"};
		Student st2 = new Student("Student_2", 70, School_list_2);
		
		String School_list_3[] = {"台大"};
		Student st3 = new Student("Student_3", 80, School_list_3);
		
		String School_list_4[] = {"台大"};
		Student st4 = new Student("Student_4", 60, School_list_4);
		
		String School_list_5[] = {"台大"};
		Student st5 = new Student("Student_5", 79, School_list_5);
		
		Student[] Students = {st1,st2,st3,st4,st5};
		
		for(int i = 0;i<Students.length;i++) {
			for(int j = 0; j < Students[i].getSchool_list().length; j++) {
				if(sc1.getSchool_name().equals(Students[i].getSchool(j))) {
					sc1.send_Score(Students[i].getStudent_name(), Students[i].getScore());
				}
			}
		}
		
		List<String> Result_list = new ArrayList<String>();
		Result_list.add("Student_1" + " Primary");
		Result_list.add("Student_3" + " Primary");
		Result_list.add("Student_5" + " Secondary");
		Result_list.add("Student_2" + " None");
		Result_list.add("Student_4" + " None");
		assertEquals(Result_list,sc1.Release());
	}
	
	@Test
	public void test2() {
		System.out.println();
		System.out.println("Test2:");
		School sc1 = new School("台大", 0, 0);
		
		String School_list[] = {"台大","清大"};
		Student st1 = new Student("Student_1", 80, School_list);
		
		String School_list_2[] = {"台大"};
		Student st2 = new Student("Student_2", 70, School_list_2);
		
		String School_list_3[] = {"台大"};
		Student st3 = new Student("Student_3", 80, School_list_3);
		
		String School_list_4[] = {"台大"};
		Student st4 = new Student("Student_4", 60, School_list_4);
		
		String School_list_5[] = {"台大"};
		Student st5 = new Student("Student_5", 79, School_list_5);
		
		Student[] Students = {st1,st2,st3,st4,st5};
		
		for(int i = 0;i<Students.length;i++) {
			for(int j = 0; j < Students[i].getSchool_list().length; j++) {
				if(sc1.getSchool_name().equals(Students[i].getSchool(j))) {
					sc1.send_Score(Students[i].getStudent_name(), Students[i].getScore());
				}
			}
		}
		
		List<String> Result_list = new ArrayList<String>();
		Result_list.add("Student_1" + " None");
		Result_list.add("Student_3" + " None");
		Result_list.add("Student_5" + " None");
		Result_list.add("Student_2" + " None");
		Result_list.add("Student_4" + " None");
		assertEquals(Result_list,sc1.Release());
	}
	
	@Test
	public void test3() {
		System.out.println();
		System.out.println("Test3:");
		School sc1 = new School("台大", 2, 1);
		School sc2 = new School("清大", 1, 2);
		
		String School_list[] = {"台大","清大"};
		Student st1 = new Student("Student_1", 80, School_list);
		
		String School_list_2[] = {"台大"};
		Student st2 = new Student("Student_2", 70, School_list_2);
		
		String School_list_3[] = {"台大"};
		Student st3 = new Student("Student_3", 80, School_list_3);
		
		String School_list_4[] = {"台大"};
		Student st4 = new Student("Student_4", 60, School_list_4);
		
		String School_list_5[] = {"台大"};
		Student st5 = new Student("Student_5", 79, School_list_5);
		
		Student[] Students = {st1,st2,st3,st4,st5};
		
		for(int i = 0;i<Students.length;i++) {
			for(int j = 0; j < Students[i].getSchool_list().length; j++) {
				if(sc1.getSchool_name().equals(Students[i].getSchool(j))) {
					sc1.send_Score(Students[i].getStudent_name(), Students[i].getScore());
				}
				if(sc2.getSchool_name().equals(Students[i].getSchool(j))) {
					sc2.send_Score(Students[i].getStudent_name(), Students[i].getScore());
				}
			}
		}
		
		List<String> Result_list = new ArrayList<String>();
		Result_list.add("Student_1" + " Primary");
		Result_list.add("Student_3" + " Primary");
		Result_list.add("Student_5" + " Secondary");
		Result_list.add("Student_2" + " None");
		Result_list.add("Student_4" + " None");
		
		List<String> Result_list2 = new ArrayList<String>();
		Result_list2.add("Student_1" + " Primary");
		
		assertEquals(Result_list,sc1.Release());
		assertEquals(Result_list2,sc2.Release());
		
		
	}
	
	@Test
	public void test4() {
		System.out.println("Test4:");
		School sc1 = new School("台大", 2, 1);
		
		String School_list[] = {"台大","清大"};
		Student st1 = new Student("Student_1", 80, School_list);
		
		String School_list_2[] = {"台大"};
		Student st2 = new Student("Student_2", 80, School_list_2);
		
		String School_list_3[] = {"台大"};
		Student st3 = new Student("Student_3", 80, School_list_3);
		
		String School_list_4[] = {"台大"};
		Student st4 = new Student("Student_4", 60, School_list_4);
		
		String School_list_5[] = {"台大"};
		Student st5 = new Student("Student_5", 79, School_list_5);
		
		Student[] Students = {st1,st2,st3,st4,st5};
		
		for(int i = 0;i<Students.length;i++) {
			for(int j = 0; j < Students[i].getSchool_list().length; j++) {
				if(sc1.getSchool_name().equals(Students[i].getSchool(j))) {
					sc1.send_Score(Students[i].getStudent_name(), Students[i].getScore());
				}
			}
		}
		
		List<String> Result_list = new ArrayList<String>();
		Result_list.add("Student_1" + " Primary");
		Result_list.add("Student_2" + " Primary");
		Result_list.add("Student_3" + " Primary");
		Result_list.add("Student_5" + " Secondary");
		Result_list.add("Student_4" + " None");
		assertEquals(Result_list,sc1.Release());
	}
}
