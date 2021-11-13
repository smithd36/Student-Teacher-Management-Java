

import java.util.ArrayList;
import java.util.Scanner;




public class testerProgram {
   

	public static void main(String[] args) {
		//Variable declartion
		Scanner pam = new Scanner(System.in);
		
		ArrayList<Student> stu = new ArrayList<>();
		ArrayList<Teacher> tea = new ArrayList<>();
		//while true run the following
	while(true) {
			System.out.println("Please enter either student or teacher to do an action: ");
			String decide = pam.nextLine();
			
			//if user enters student it runs the following
		if(decide.equals("Student") ||decide.equals("student")) {

		Student stu1 = new Student ("219832","John", "01/23/09",4500.00);
    		stu.add(stu1);
    		
    		Student stu2 = new Student ("128424","Emma", "04/06/02",3000.00);
    		stu.add(stu2);
        	
    		Student stu3 = new Student ("372918","Miguel", "05/17/04",2500.00);
    		stu.add(stu3);
        while (true) {
        	//calls menu method
            studentSystem.Menu();
            //prompts user to enter what kind of action they want to do
            System.out.println("Enter the action you want to do: ");
        	String action = pam.nextLine();
            switch (action) {
            		case"Add":case"add":
                	studentSystem.addStudent(stu);//calls add method
                    break;
            		case"Search":case"search":
                    studentSystem.searchStudent(stu);//calls search method
                    break;
            		case"Modify":case"modify":
                    studentSystem.modifyStudent(stu);//calls modify method
                    break;
            		case"Delete":case"delete":
                    studentSystem.deleteStudent(stu);//calls student method
                    break;
            		case"Print":case"print":
                	studentSystem.printInformation(stu);//calls print method
                	break;
    	            case"Exit":case"exit"://terminates
                    System.out.println("Application terminated.");//terminates 
                    System.exit(0);
                    break;
    	            default:
  	              { //if user enters any other action or character it prompts the following
  	            	  System.out.println("Error: Invalid command.");               
  	              }
            }
        }
	}	
			//same thing as student option
            else if(decide.equals("Teacher") || decide.equals("teacher")) { 
            	
        		Teacher tea1 = new Teacher ("234802","Jose", "07/12/98",45000.00);
        		tea.add(tea1);
        		
        		Teacher tea2 = new Teacher ("732194","Emily", "12/06/67",80000.00);
        		tea.add(tea2);
            	
        		Teacher tea3 = new Teacher ("917284","Michael", "04/16/02",25000.00);
        		tea.add(tea3);
        		
            	while (true) {
                teacherSystem.Menu();
                System.out.println("Enter the action you want to do: ");
            	String action = pam.nextLine();
                switch (action) {
                		case"Add":case"add":
                    	teacherSystem.addTeacher(tea);
                        break;
                		case"Search":case"search":
                        teacherSystem.searchTeacher(tea);
                        break;
                		case"Modify":case"modify":
                        teacherSystem.modifyTeacher(tea);
                        break;
                		case"Delete":case"delete":
                        teacherSystem.deleteTeacher(tea);
                        break;
                		case"Print":case"print":
                    	teacherSystem.printInformation(tea);
                    	break;
        	            case"Exit":case"exit"://terminates
                        System.out.println("Application terminated");
                        System.exit(0);
                        break;
                        
        	            default:
      	              { 
      	            	  System.out.println("Error: Invalid command.");               
      	              }
                }

            }
            	
    	}     
		
            else {//prompts this when user doesn't enter student or teacher
            	System.out.println("Invalid");
            }
            

            }
        }
}


      
      

		    	
    	
    	
    	
    	
       
            
         
