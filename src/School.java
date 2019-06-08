import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class School {
	private String School_name;
	private int Primary;
	private int Secondary;
	
	private List<String> Student_list = new ArrayList<String>();
	private List<Integer> Score_list = new ArrayList<Integer>();
	private List<String> Release_list = new ArrayList<String>();
	private List Score_list_set = null;
	
	public School(String School_name, int Primary, int Secondary) {
		this.School_name = School_name;
		this.Primary = Primary;
		this.Secondary = Secondary;
	}
	
	public void send_Score(String Student_name, int Score) {
		Student_list.add(Student_name);
		Score_list.add(Score);
	}
	
	public List<String> Release() {
		int count_Primary = 0;
		int count_Secondary = 0;
		System.out.println(this.School_name + "¡G");
		List Score_list_set = new ArrayList(new TreeSet(Score_list)); 
		Collections.reverse(Score_list_set);
		
		System.out.println(Score_list);
		System.out.println(Score_list_set);
		
		for(int i = 0; i < Score_list_set.size(); i++) {
			if(count_Primary < Primary) {
				for(int j = 0; j < Score_list.size(); j++) {
					if(Score_list_set.get(i) == Score_list.get(j)) {
						Release_list.add(Student_list.get(j) + " Primary");
						count_Primary += 1;
					}
				}
			}else if(count_Secondary < Secondary) {
				for(int j = 0; j < Score_list.size(); j++) {
					if(Score_list_set.get(i) == Score_list.get(j)) {
						Release_list.add(Student_list.get(j) + " Secondary");
						count_Secondary += 1;
					}
				}
			}else {
				for(int j = 0; j < Score_list.size(); j++) {
					if(Score_list_set.get(i) == Score_list.get(j)) {
						Release_list.add(Student_list.get(j) + " None");
					}
				}
			}
		}
		System.out.println(Release_list);
		System.out.println();
		return Release_list;
	}
	
	public String getSchool_name() {
		return School_name;
	}
	
//	public int getPrimary() {
//		return Primary;
//	}
//	
//	public int getSecondary() {
//		return Secondary;
//	}
}
