



public class Teacher {
	
	String Name;
	double salary;
	String teacherNumber;
	String birthday;
	
	 public Teacher() {
	    }
	
	public Teacher(String Name, String teacherNumber, String birthday, double salary){ 
		
		this.Name = Name;;
		this.teacherNumber = teacherNumber;;
		this.salary = salary;
		this.birthday=birthday;
	}
	//Get teacher's name
	public String getName() {
		 return Name;
	}
	//Set teacher's name
	public void setName(String Name) {
		 this.Name=Name;
	}
	//Get's teacher id number
	public String getteacherNumber() {
		return teacherNumber;
	}
	//Set teacher's id number
	public void setteacherNumber(String studentNumber) {
	this.teacherNumber=studentNumber;
	}
	//Get teacher's salary
	public Double getSalary(){
		return salary;	
	}
	//Set teacher's salary
	public void setSalary(double salary) {
		this.salary=salary;
	}
	//get teacher's birthday
	public String getBirthday() {
		 return birthday;
	}
	//set teacher's birthday
	public void setBirthday(String birthday) {
		 this.birthday=birthday;
	}

	

	
}