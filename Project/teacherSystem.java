

import java.util.ArrayList;
import java.util.Scanner;

public class teacherSystem {
	
    static Scanner pam = new Scanner(System.in);
  //Prints out menu
    public static void Menu() {
        System.out.println("----------------------------------");
        System.out.println("-   (Add) Teacher information    -");
        System.out.println("-   (Search) Teacher information -");
        System.out.println("-   (Modify) Teacher information -");
        System.out.println("-   (Delete Teacher information  -");
        System.out.println("-   (Print) Teacher information  -");
        System.out.println("-   (Exit) management system     -");
        System.out.println("----------------------------------");
    }
	//Adds Teacher to array list
    public static void addTeacher(ArrayList<Teacher> stu) {
        //Instantiate the Teacher class and create an object
        Teacher s = new Teacher();
        //Prompts user to enter an ID number
        System.out.println("Enter Teacher ID number:");
        String id = pam.next();
        //for loop that search if the ID already exist
        for (int i = 0; i < stu.size(); i++) {
            if (id.equals(stu.get(i).getteacherNumber())) {
                System.out.println("This Teacher ID number already exist.");
                return;
            }
        }
        //Sets the id number to the Teacher
        s.setteacherNumber(id);
        //Prompts user to enter Teacher's name
        System.out.println("Enter Teacher name:");
        String Name = pam.next();
        s.setName(Name);
        
     //Prompts user to enter Salary
        System.out.println("Enter the Salary the Teacher owes:");
        double Salary = pam.nextDouble();
        s.setSalary(Salary);
        //Prompts user Teacher's birthday
        System.out.println("Enter Teacher's birthday: ");
        String birthday = pam.next();
        s.setBirthday(birthday);
        
        //Adds Teacher to the arraylist
        stu.add(s);
        //Lets user the Teacher was added
        System.out.println("Added successfully");
    }

   //Searches Teacher in arraylist
    public static void searchTeacher(ArrayList<Teacher> stu) {
        if (stu.size() == 0) {
            System.out.println("Teacher information not found");
            return;
        }
        //Prompts user to enter ID number so it use the for loop to search for it
        System.out.println("Enter Teacher ID number:");
        String id = pam.next();
        for (int i = 0; i < stu.size(); i++) {
        	//if found it prompts user information
            if (stu.get(i).getteacherNumber().equals(id)) 
            {
                System.out.println("Teacher Found");
                System.out.println("Id#:" + stu.get(i).getteacherNumber() + " Name:" + stu.get(i).getName() +
      				  " Birthday:" +stu.get(i).getBirthday() +" Salary:" + stu.get(i).getSalary() );
                return;
            }
        }
        //if it wasn't found then it prompts this message
        System.out.println("Teacher information not found");
    }

   //method to modify Teacher
    public static void modifyTeacher(ArrayList<Teacher> stu) {
      //Prompts user to enter the Teacher's ID number so it can search for the specfic Teacher
        System.out.println("Enter the Teacher number of the Teacher you want to modify:");
        String id = pam.next();
        //for loop that search for that specific ID number
        for (int i = 0; i < stu.size(); i++) {
        	//If Teacher was found then it prompts them to re-enter their information
            if (stu.get(i).getteacherNumber().equals(id)) {
                System.out.println("Teacher found. Re-enter the Teacher's information!");
                addTeacher(stu);
                System.out.println("Enter Teacher ID number):");
                String idnumber = pam.next();
                for (int j = 0; j < stu.size(); j++) {
                    if(idnumber.equals(stu.get(j).getteacherNumber())){
                        System.out.println("That Teacher already exsit");
                        return;
                    }
                }
                System.out.println("Enter Teacher ID #:");
                stu.get(i).getteacherNumber();
                System.out.println("Enter Teacher first name:");
                stu.get(i).setName(pam.next());
       
                System.out.println("Enter Teacher Birhday:");
                stu.get(i).setBirthday(pam.next());
                System.out.println("Enter Teacher Salary:");
                stu.get(i).setSalary(pam.nextDouble());
               
                System.out.println("Modified.");
                return;
            }
        }
        System.out.println("Teacher information not found");
    }

    //method to delete a Teacher from the list
     public static void deleteTeacher(ArrayList<Teacher> stu) {
        if (stu.size() == 0) {
            System.out.println("Teacher already in system");
            return;
        }
        //Prompts user to enter Teacher's id number
        System.out.println("Enter the Teacher number of the Teacher you want to delete:");
        String id = pam.next();
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i).getteacherNumber().equals(id)) {
                stu.remove(i);//removes Teacher
                System.out.println("Deleted.");
                return;
            }
        }//if not found then Teacher is not in the system
        System.out.println("Teacher not in system");
    }
    //prints out information
    public static void printInformation(ArrayList<Teacher> stu) {
    	for (int i=0; i<stu.size(); i++) {
    		  Teacher print = stu.get(i);

    		  System.out.println("Id#:" + stu.get(i).getteacherNumber() + " Name:" + stu.get(i).getName() +
    				  " Birthday:" +stu.get(i).getBirthday() + " Salary:" + stu.get(i).getSalary());    		}
    }
}

		
