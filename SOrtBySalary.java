package EDBMS;

import java.util.Comparator;

public class SOrtBySalary implements Comparator<Empoyee> 
{

	@Override
	public int compare(Empoyee x, Empoyee y) 
	{
		Double i = x.getSalary();
		Double j = y.getSalary();
		
		return i.compareTo(j);
	}

}
