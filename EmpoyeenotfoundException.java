package EDBMS;

public class EmpoyeenotfoundException extends RuntimeException
{
	private String message;

	public EmpoyeenotfoundException(String message) 
	{
		
		this.message = message;
	}
	public String getMessage() 
	{
		return message;
	}

}
