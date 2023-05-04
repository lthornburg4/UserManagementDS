//Name: Laura Thornburg
//Class: Data Strucutres
//EMail: lthornburg1@dmacc.edu
//Date: 5/3/2023

import java.util.*;


class Employee {
    private String name;				//employee name
    private int empNumber;				//employee number
    private String userManagement1;		//Application 1
    private String userManagement2;		//Application 2
    private String userManagement3;		//Application 3
    private String userManagement4;		//Application 4
    private String userManagement5;		//Application 4
    
    //constructor to take in all variables
    public Employee(String name, int empNumber, String userManagement1, String userManagement2, String userManagement3, String userManagement4, String userManagement5) {
        this.name = name;
        this.empNumber = empNumber;
        this.userManagement1 = userManagement1;
        this.userManagement2 = userManagement2;
        this.userManagement3 = userManagement3;
        this.userManagement4 = userManagement4;
        this.userManagement5 = userManagement5;
    }
    
    //constructor for only 1 application
    public Employee(String name, int empNumber, String userManagement1) {
    	this.name = name;
    	this.empNumber = empNumber;
    	this.userManagement1 = userManagement1;
    }
    
    //constructor for 2 applications
    public Employee(String name, int empNumber, String userManagement1, String userManagement2) {
    	this.name = name;
    	this.empNumber = empNumber;
    	this.userManagement1 = userManagement1;
    	this.userManagement2 = userManagement2;
    }
    
    //constructor for 3 applications
    public Employee(String name, int empNumber, String userManagement1, String userManagement2, String userManagement3) {
    	this.name = name;
    	this.empNumber = empNumber;
    	this.userManagement1 = userManagement1;
    	this.userManagement2 = userManagement2;
    	this.userManagement3 = userManagement3;
    	}
    
    //constructor for 4 applications
    public Employee(String name, int empNumber, String userManagement1, String userManagement2, String userManagement3, String userManagement4) {
    	this.name = name;
    	this.empNumber = empNumber;
    	this.userManagement1 = userManagement1;
    	this.userManagement2 = userManagement2;
    	this.userManagement3 = userManagement3;
    	this.userManagement4 = userManagement4;
    }
    
    public Employee(String name) {
    	this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getEmpNumber() {
        return empNumber;
    }
    
    public String getUserManagment1() {
        return userManagement1;
    }
    
    public String getUserManagment2() {
        return userManagement2;
    }
    
    public String getUserManagment3() {
        return userManagement3;
    }
    
    public String getUserManagment4() {
        return userManagement4;
    }
    
    public String getUserManagment5() {
        return userManagement5;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNumber=" + empNumber + ", userManagement1=" + userManagement1
				+ ", userManagement2=" + userManagement2 + ", userManagement3=" + userManagement3 + ", userManagement4="
				+ userManagement4 + ", userManagement5=" + userManagement5 + "]";
	}  
}

public class EmployeeLinkedList {
    private static LinkedList<Employee> employees = new LinkedList<Employee>();		//creating linked list
    
    public static void main(String[] args) {
    	
    	String empName;		//employee name variable
    	String eNumber;		//employee number as string
    	int empNumber;		//employee number as the int after casting from string from user input
    	String userApp1;	//first application to add user
    	String userApp2;	//second application to add user
    	String userApp3;	//third application to add user
    	String userApp4;	//fourth application to add user
    	String userApp5;	//fifth application to add user
    	String sIndex;		//index as string
    	int searchIndex;	//index as the int after casting from string from user input
    	String removeEmployee; //Variable to control if remove is completed
    	String menuOption;		//Variable for menu option selected
    	
    	//Creating Scanner object
    	 Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    	 
    	//creating menu to drive user actions regarding list
    	 	 System.out.println("Option 1 - Enter employee information");
    	   	 System.out.println("Option 2 - View employees in list");
    	   	 System.out.println("Option 3 - Search list by index to display employee information and option to remove");
    	   	 System.out.println("Option 4 - View updated employee list");
    	   	 System.out.println("Option 5 - Exit Program");
    	   	 System.out.println("Enter menu option to execute");
    	   	 menuOption = userInput.nextLine();    	 
    	 
    	 if(menuOption.equals("1")) {
    		//loop to get user input
        	 String enterInfo = "";		//variable to control if while loop runs to enter employee information
        	 
        	 System.out.println("Do you need to enter employee user management information? (type 'quit' to exit) ");
        	 enterInfo = userInput.nextLine(); 		//variable controlling if while loop runs   	 
        	 while (!enterInfo.equals("quit") ) {
        		 
        		 System.out.println("Enter Employee Name: ");	//get user input for name	
            	 empName = userInput.nextLine();  // Read user input
            	 
            	 System.out.println("Enter Employee Number: ");		//get user input for employee number
            	 eNumber = userInput.nextLine();
            	 try {
            		 empNumber = Integer.parseInt(eNumber);			//casting string from user input to int variable
            	    } catch (Exception e) {
            	      System.out.println("You didn't enter a number.");
            	    }
            	 empNumber = Integer.parseInt(eNumber);			//casting string from user input to int variable
            	 
            	 System.out.println("Enter Application for employee to be added: ");	//get user input for applications to be added
            	 userApp1 = userInput.nextLine();
            	 
            	 System.out.println("Enter Application for employee to be added: (if no additional application press 'enter' ");
            	 userApp2 = userInput.nextLine();
            	 
            	 System.out.println("Enter Application for employee to be added: (if no additional application press 'enter' ");
            	 userApp3= userInput.nextLine();
            	 
            	 System.out.println("Enter Application for employee to be added: (if no additional appliation press 'enter' ");
            	 userApp4 = userInput.nextLine();
            	 
            	 System.out.println("Enter Application for employee to be added: (if no additional application press 'enter' ");
            	 userApp5 = userInput.nextLine();
            	 
            	 //adding employees to linked list
            	 employees.add(new Employee(empName, empNumber, userApp1, userApp2, userApp3, userApp4, userApp5));		
            	 
            	 System.out.println("Do you need to enter employee user management information? (type 'quit' to exit) ");
            	 enterInfo = userInput.nextLine();
        	 }   
 	        
 	        	// Print the list of employees(iterate through list)
 	        	System.out.println("List of Employees:");
 	        	for (Employee e : employees) {
 	        		System.out.println(e);
 	        	} 
 	         	
       	 }else if(menuOption.equals("2")) {
        		// Add employees to the list (just to give some additional information for testing to create more names on list without input
        	        employees.add(new Employee("John Doe", 1002, "AD", "Payroll"));
        	        employees.add(new Employee("Jane Smith", 1252, "AD", "EMail", "Payroll"));
        	        employees.add(new Employee("Bob Johnson", 2252, "AD", "EMail", "Payroll", "Accounting"));
        	        employees.add(new Employee("Sally Smith", 1551, "AD", "EMail", "Payroll", "Accounting", "Office"));
        	        employees.add(new Employee("Micky Mouse", 2422, "AD", "Kronos", "EMail"));
        	        employees.add(new Employee("Daffy Duck", 5655, "AD", "Kronos", "Cerner", "Email"));
        	        
        	        // Print the list of employees(iterate through list)
        	        System.out.println("List of Employees:");
        	        for (Employee e : employees) {
        	            System.out.println(e);
        	        }    	        
        	        
       	}else if(menuOption.equals("3")) {
     		// Add employees to the list (just to give some additional information for testing to create more names on list without input
  	        employees.add(new Employee("John Doe", 1002, "AD", "Payroll"));
  	        employees.add(new Employee("Jane Smith", 1252, "AD", "EMail", "Payroll"));
  	        employees.add(new Employee("Bob Johnson", 2252, "AD", "EMail", "Payroll", "Accounting"));
  	        employees.add(new Employee("Sally Smith", 1551, "AD", "EMail", "Payroll", "Accounting", "Office"));
  	        employees.add(new Employee("Micky Mouse", 2422, "AD", "Kronos", "EMail"));
  	        employees.add(new Employee("Daffy Duck", 5655, "AD", "Kronos", "Cerner", "Email"));
     		// Print the list of employees(iterate through list)
  	        System.out.println("List of Employees:");
  	        for (Employee e : employees) {
  	            System.out.println(e);
  	        }
  	        
  	           //getting input from user to search for employee information
  	           System.out.println("Enter index to search for employee information: ");
  	           sIndex = userInput.nextLine();
  	           searchIndex = Integer.parseInt(sIndex);		//casting to int from string from user input        
  	           System.out.println("\nEmployee information in index searched:");
  	           System.out.println(employees.get(searchIndex - 1));		//users are not going to start at 0 for index so compensating for that    
  	      
  	           //asking user if they want to remove employee listed above
  	           System.out.println("Do you want to remove the employee listed from the list? (Enter 'Y' to remove employee) ");
  	           removeEmployee = userInput.nextLine();
  	           
  	           //System.out.println(removeEmployee);		//loop wasn't running correctly so was trying to validate that variable was what I expected
  	           if(removeEmployee.equals("Y")){
  	           	 // Remove employee from list
  	               System.out.println("\nEmployee to remove from list:");
  	               System.out.println("Removing employee in index" + searchIndex);
  	               employees.remove(searchIndex - 1);		//again compensating that user is not going to start index at 0
  	           } else {
  	           	System.out.println("Employee not removed from list.");		//false code to execute if user does not want to remove employee
  	           }
  	           
  	       // Print the list of employees(iterate through list)
  	 	        System.out.println("Updated List of Employees:");
  	 	        for (Employee e : employees) {
  	 	            System.out.println(e);
  	 	        }
  	 	        
  	   	 	 	
     	    }else if(menuOption.equals("4")) {
        		 
        		// Add employees to the list (just to give some additional information for testing to create more names on list without input
      	        employees.add(new Employee("John Doe", 1002, "AD", "Payroll"));
      	        employees.add(new Employee("Jane Smith", 1252, "AD", "EMail", "Payroll"));
      	        employees.add(new Employee("Bob Johnson", 2252, "AD", "EMail", "Payroll", "Accounting"));
      	        employees.add(new Employee("Sally Smith", 1551, "AD", "EMail", "Payroll", "Accounting", "Office"));
      	        employees.add(new Employee("Micky Mouse", 2422, "AD", "Kronos", "EMail"));
      	        employees.add(new Employee("Daffy Duck", 5655, "AD", "Kronos", "Cerner", "Email"));
         		// Print the list of employees(iterate through list)
      	        System.out.println("List of Employees:");
      	        for (Employee e : employees) {
      	            System.out.println(e);
      	        }
        	 } else {
        		 System.out.println("You have exited the program.");
        	 }
    	 
        userInput.close(); 		//closing scanner
   	 	 		}
      }
    

