


//Student class
public class Student {
	//Variable declaration
	private String Name;
	private double tuition;
	private String studentNumber;
	private String birthday;
	
	//Constructor
	 public Student() {
	    }
	
	public Student(String studentNumber, String Name, String birthday, double tuition){ 
		
		this.Name = Name;;
		this.studentNumber = studentNumber;;
		this.tuition = tuition;
		this.birthday = birthday;
	}
	
	//Gets the name of the student
	public String getName() {
		 return Name;
	}
	//Sets the name of the student
	public void setName(String firstName) {
		 this.Name=firstName;
	}
	//Gets the student's number
	public String getstudentNumber() {
		return studentNumber;
	}
	//Sets student number
	public void setstudentNumber(String studentNumber) {
	this.studentNumber=studentNumber;
	}
	//Gets student's tuition
	public Double getTuition(){
		return tuition;	
	}
	//Sets student tuition
	public void setTuition(double tuition) {
		this.tuition=tuition;
	}
	///Get student's birthday
	public String getBirthday() {
		 return birthday;
	}
	//Set student's birthday
	public void setBirthday(String birthday) {
		 this.birthday=birthday;
	}
	
}