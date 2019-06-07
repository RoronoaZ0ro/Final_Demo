import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SchoolTest {

	@Test
	public void test() {
		School sc1 = new School("台大", 2, 1);
		
		String School_list[] = {"台大","清大"};
		Student st1 = new Student("Test", 80, School_list);

		for(int i = 0; i < st1.getSchool_list().length; i++) {
			if(sc1.getSchool_name().equals(st1.getSchool(i))) {
				sc1.send_Score(st1.getStudent_name(), st1.getScore());
			}
		}
		
		String School_list_2[] = {"台大"};
		Student st2 = new Student("Test2", 70, School_list_2);

		for(int i = 0; i < st2.getSchool_list().length; i++) {
			if(sc1.getSchool_name().equals(st2.getSchool(i))) {
				sc1.send_Score(st2.getStudent_name(), st2.getScore());
			}
		}
		
		String School_list_3[] = {"台大"};
		Student st3 = new Student("Test3", 80, School_list_3);

		for(int i = 0; i < st3.getSchool_list().length; i++) {
			if(sc1.getSchool_name().equals(st3.getSchool(i))) {
				sc1.send_Score(st3.getStudent_name(), st3.getScore());
			}
		}
		
		String School_list_4[] = {"台大"};
		Student st4 = new Student("Test4", 60, School_list_4);

		for(int i = 0; i < st4.getSchool_list().length; i++) {
			if(sc1.getSchool_name().equals(st4.getSchool(i))) {
				sc1.send_Score(st4.getStudent_name(), st4.getScore());
			}
		}
		
		String School_list_5[] = {"台大"};
		Student st5 = new Student("Test5", 79, School_list_5);

		for(int i = 0; i < st5.getSchool_list().length; i++) {
			if(sc1.getSchool_name().equals(st5.getSchool(i))) {
				sc1.send_Score(st5.getStudent_name(), st5.getScore());
			}
		}
		
		List<String> Result_list = new ArrayList<String>();
		Result_list.add("Test" + " Primary");
		Result_list.add("Test3" + " Primary");
		Result_list.add("Test5" + " Secondary");
		Result_list.add("Test2" + " None");
		Result_list.add("Test4" + " None");
		assertEquals(Result_list,sc1.Release());
	}

}
