package EDBMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManagmentSystemImpl implements EmployeeManagmentSystem  
{

	Scanner sc1 =new Scanner(System.in);
	Map<String,Empoyee> m = new LinkedHashMap<String,Empoyee>();
	@Override
	public void addEmployee() 
	{
		System.out.println("Enter the Name");
	String name = sc1.next();
	System.out.println("Enter the Age");
	int age = sc1.nextInt();
	System.out.println("Enter the Salary");
	double salary = sc1.nextDouble();
	
	
	Empoyee e1 = new Empoyee(name,age,salary);
	m.put( e1.getId(),e1);
	System.out.println("employee inserted Succesfully");
	System.out.println("EMpoyee id is"+e1.getId());
	
	}

	@Override
	public void displayEmpoyee() 
	{
	Empoyee emp = m.get(m);
	System.out.println("Enter id");
	int id = sc1.nextInt();
	if(m.containsKey(id))
	{
		System.out.println(emp.getAge());
		System.out.println(emp.getId() );
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
	else
	{
		try {
			throw new InvalidChoiceexception("Not found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	}

	@Override
	public void displayAllEMployees() 
	{
	System.out.println("All empl Record");	
		Set<String> key = m.keySet();
		for(String g : key)
		{
			System.out.println(m.get(g));
		}
		
	}

	@Override
	public void removeEmployee() 
	{
	System.out.println("Enter the Id");	
	int id = sc1.nextInt();
	if(m.containsKey(id))
	{
		m.remove(id);
		System.out.println("record removed"+ m.get(id));
	}
	
	
	}

	@Override
	public void removeAllEmployee() 
	{
	if(m.size()!=0) {
		System.out.println("Avsilable employee record"+m.size());
	    m.clear();
	
	}
	else
	{
		try {
			throw new InvalidChoiceexception("Not removed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	}

	@Override
	public void updateEmployee() 
	{
	System.out.println("enter employee id :");
		
	int id = sc1.nextInt();
	
	if(m.containsKey(id))
	{
		Empoyee e2 = m.get(id);
		System.out.println("1.Update age\n2.update Name\n3.update salary");
	    System.out.println("Enter Choice");
	    int choice = sc1.nextInt();
	    
	    
	    switch(choice)
	    {
	    case 1 : System.out.println("Enter age");
	             e2.setAge(sc1.nextInt());
	             System.out.println("Age updated Succesfully");
	             break;
	
	    case 2 : System.out.println("Enter Name");
	             e2.setName(sc1.next());
	             System.out.println("Name updated Succesfully");
	             break;
	             
	             
	    case 3 : System.out.println("Enter salary");//double salary = sc1.nextDouble();
	             e2.setSalary(sc1.nextDouble());//e2.setsalary(salary)
	             break;
	             
	    default : try {
	    	throw new InvalidChoiceexception("Not Found");
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	     }
	      
	   }
	 
	}
	
  }

	@Override
	public void countEmployee() 
	{
	if(m.size()>=0)
	{
		System.out.println(m.size());
	}
	else
	{
		 try 
		 {
		    	throw new InvalidChoiceexception("Not Found");
		    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
        }
		      
	}
		
	}

	@Override
	public void sortEmployee() 
	{
     Set<String> s1 = m.keySet();
     List <Empoyee> l1 = new ArrayList<Empoyee>();
     
     for( String k : s1)
     {
    	 Empoyee s = m.get(s1);
    	 l1.add(s);
     }
		
    
     System.out.println("1.Sort by id\n2.Sort by age\n3.Sort by Name\n3.Sort by salary");
     int choice = sc1.nextInt();
     
     switch(choice)
     {
     case 1 : System.out.println("Sort based on id"); 
              Collections.sort(l1,new Sortbyid());
              
              
     case 2 : System.out.println("Sort Based on Age");          
              Collections.sort(l1 , new SortbyAge());
     
     case 3 : System.out.println("Sort Based on Salary ");
             Collections.sort(l1 , new  SOrtBySalary());
             
     case 4 : System.out.println("Sort based on Name");        
             Collections.sort(l1, new SortbyName());
             
     default :  try 
	 {
	    	throw new InvalidChoiceexception("Not Found");
	    	
 }
 catch(Exception e)
 {
 	System.out.println(e.getMessage());
 }         
             
     
     }
     
     
	}

	@Override
	public void getEmployeeWithHighestSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeWithLowestSalary() {
		// TODO Auto-generated method stub
		
	}




}
