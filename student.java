import java.util.List;
import java.util.ArrayList;

class student{
	String stud_name;
	String stud_dept;

	List<subject> subjects = new ArrayList<subject>();	

	public void addSubject(subject s){
		subjects.add(s);
	}

	public List<subject> getSubjects(){
		return subjects;
	}

	public void setName(String name){
		stud_name = name;	
	}	

	public String getName(){
		return stud_name;
	}	

	public void setDept(String dept){
		stud_dept = dept;
	}

	public String getDept(){
		return stud_dept;
	}
}