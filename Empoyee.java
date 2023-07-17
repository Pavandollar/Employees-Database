package EDBMS;

public class Empoyee 
{
private String id;
private String name;
private int age;
private Double salary;
 static int count = 101;
public Empoyee( String name, int age, double salary) 
{
	this.id = "EMP"+count ;
	this.name = name;
	this.age = age;
	this.salary = salary;
	count++;
}
public String getId() 
{
	return id;
}
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getAge() 
{
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}



}
