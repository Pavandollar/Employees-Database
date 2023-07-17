package EDBMS;

public class InvalidChoiceexception extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -513964305834818461L;
	private String message;

	public InvalidChoiceexception(String message) 
	{
		
		this.message = message;
	}
	public String getMessage() 
	{
		return message;
	}

}
