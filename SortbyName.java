package EDBMS;

import java.util.Comparator;

public class SortbyName implements Comparator<Empoyee>
{

	@Override
	public int compare(Empoyee x, Empoyee y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}

}
