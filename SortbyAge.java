package EDBMS;

import java.util.Comparator;

public class SortbyAge implements Comparator<Empoyee>
{

	@Override
	public int compare(Empoyee x, Empoyee y) {
		// TODO Auto-generated method stub
		return x.getAge()-y.getAge();
	}

}
