package EDBMS;

import java.util.Comparator;

public class Sortbyid implements Comparator<Empoyee> 
{

	@Override
	public int compare(Empoyee x, Empoyee y)
	{
		
		return x.getId().compareTo(y.getId());
	}

}
