package Project1;

import java.util.*;
import java.util.ArrayList;

public class Person 
{
	private String fullName;
	private String id;
	private HashMap<String, Person> Contacts;
	
	public Person()
	{
		fullName = "not set";
		id = "not set";
		
		Contacts = new HashMap<String, Person>();
	}
	
	public Person(String fn, int i)
	{
		fullName = fn;
		id = null;
	}
	public void addContact(String id)
	{
		
	}
	
	public String getName()
	{
		return fullName;
	}
	
	public String getId()
	{
		return id;
	}

}
