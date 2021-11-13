

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
	
    static Scanner pam = new Scanner(System.in);
  //Prints out menu
    public static void Menu() {
        System.out.println("----------------------------------");
        System.out.println("-   (Add) student information    -");
        System.out.println("-   (Search) student information -");
        System.out.println("-   (Modify) student information -");
        System.out.println("-   (Delete student information  -");
        System.out.println("-   (Print) student information  -");
        System.out.println("-   (Exit) management system     -");
        System.out.println("----------------------------------");
    }
	//Adds student to array list
    public static void addStudent(ArrayList<Student> stu) {
        //Instantiate the Student class and create an object
        Student s = new Student();
        //Prompts user to enter an ID number
        System.out.println("Enter student ID number:");
        String id = pam.next();
        //for loop that search if the ID already exist
        for (int i = 0; i < stu.size(); i++) {
            if (id.equals(stu.get(i).getstudentNumber())) {
                System.out.println("This student ID number already exist.");
                return;
            }
        }
        //Sets the id number to the student
        s.setstudentNumber(id);
        //Prompts user to enter student's name
        System.out.println("Enter student name:");
        String Name = pam.next();
        s.setName(Name);
        
     //Prompts user to enter tuition
        System.out.println("Enter the tuition the student owes:");
        double tuition = pam.nextDouble();
        s.setTuition(tuition);
        //Prompts user student's birthday
        System.out.println("Enter student's birthday: ");
        String birthday = pam.next();
        s.setBirthday(birthday);
        
        //Adds student to the arraylist
        stu.add(s);
        //Lets user the student was added
        System.out.println("Added successfully");
    }

   //Searches student in arraylist
    public static void searchStudent(ArrayList<Student> stu) {
        if (stu.size() == 0) {
            System.out.println("Student information not found");
            return;
        }
        //Prompts user to enter ID number so it use the for loop to search for it
        System.out.println("Enter student ID number:");
        String id = pam.next();
        for (int i = 0; i < stu.size(); i++) {
        	//if found it prompts user information
            if (stu.get(i).getstudentNumber().equals(id)) 
            {
                System.out.println("Student Found");
                System.out.println("Id#:" + stu.get(i).getstudentNumber() + " Name:" + stu.get(i).getName() +
      				  " Birthday:" +stu.get(i).getBirthday() +" Tuition:" + stu.get(i).getTuition() );
                return;
            }
        }
        //if it wasn't found then it prompts this message
        System.out.println("Student information not found");
    }

   //method to modify student
    public static void modifyStudent(ArrayList<Student> stu) {
      //Prompts user to enter the student's ID number so it can search for the specfic student
        System.out.println("Enter the student number of the student you want to modify:");
        String id = pam.next();
        //for loop that search for that specific ID number
        for (int i = 0; i < stu.size(); i++) {
        	//If student was found then it prompts them to re-enter their information
            if (stu.get(i).getstudentNumber().equals(id)) {
                System.out.println("Student found. Re-enter the student's information!");
                addStudent(stu);
                System.out.println("Enter student ID number):");
                String idnumber = pam.next();
                for (int j = 0; j < stu.size(); j++) {
                    if(idnumber.equals(stu.get(j).getstudentNumber())){
                        System.out.println("That student already exsit");
                        return;
                    }
                }
                System.out.println("Enter student ID #:");
                stu.get(i).getstudentNumber();
                System.out.println("Enter student first name:");
                stu.get(i).setName(pam.next());
       
                System.out.println("Enter student Birhday:");
                stu.get(i).setBirthday(pam.next());
                System.out.println("Enter student Tuition:");
                stu.get(i).setTuition(pam.nextDouble());
               
                System.out.println("Modified.");
                return;
            }
        }
        System.out.println("Student information not found");
    }

    //method to delete a student from the list
     public static void deleteStudent(ArrayList<Student> stu) {
        if (stu.size() == 0) {
            System.out.println("Student already in system");
            return;
        }
        //Prompts user to enter student's id number
        System.out.println("Enter the student number of the student you want to delete:");
        String id = pam.next();
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i).getstudentNumber().equals(id)) {
                stu.remove(i);//removes student
                System.out.println("Deleted.");
                return;
            }
        }//if not found then student is not in the system
        System.out.println("Student not in system");
    }
    //prints out information
    public static void printInformation(ArrayList<Student> stu) {
    	for (int i=0; i<stu.size(); i++) {
    		  Student print = stu.get(i);

    		  System.out.println("Id#:" + stu.get(i).getstudentNumber() + " Name:" + stu.get(i).getName() +
    				  " Birthday:" +stu.get(i).getBirthday() + " Tuition:" + stu.get(i).getTuition());    		}
    }
}

	
	       