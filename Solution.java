package EDBMS;

import java.util.Scanner;

public class Solution 
{
public static void main(String[] args) 
{
   Scanner sc = new Scanner(System.in);
   EmployeeManagmentSystem  e = new EmployeeManagmentSystemImpl();
   while(true)
   {
	   System.out.println("1.addEmployee\n2.displayEmpoyee\n3.removeEmployee\n4.removeAllEmployee\n5.updateEmploye\n6.countEmployee\n7.ortEmployee\n8.getEmployeeWithHighestSalary\n9.getEmployeeWithLowestSalary\n10.displayAllEMployees");
        int choice = sc.nextInt();
        
        switch(choice)
        {
        
        case 1 : e.addEmployee();
                 break;
        
        case 2 : e.displayEmpoyee();
        break;

        case 3 : e.displayAllEMployees();
        break;
      
        case 4 : e.removeEmployee();
        break;

        case 5 : e.removeAllEmployee();
        break;

        case 6 : e.updateEmployee();
        break;

        case 7 : e.countEmployee();
        break;

        case 8 : e.sortEmployee();
        break;

        case 9 : e.getEmployeeWithHighestSalary();
        break;

        case 10 : e.getEmployeeWithLowestSalary();
        break;

        
        default : try 
                  {
        	               throw new InvalidChoiceexception("Kindly enter valid choice");
                  }
                  catch(Exception e1)
                  {
        	       System.out.println(e1.getMessage());
                  }
        System.exit(choice);
        }
    sc.close();
     }//end of switch
  
   }//end of while

}//end of while
