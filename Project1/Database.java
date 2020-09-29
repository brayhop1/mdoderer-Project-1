package Project1;

import java.util.*;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Database extends Person{
	
	private int size;
	private static final int DEFAULT_SIZE = 10;
	private Person[] people;
	private String fileName;
	private String idNumber;
	private String lastContact;
	
	//public HashMap<String, Integer> people;
	
	public Database()
	{
		size = 0;
		people = new Person[DEFAULT_SIZE];
		fileName = null;
	}
	
	public Database(String fN, String id)
	{
		this();
		fileName = fN;
		idNumber = id;
		readFile();
		//people = new HashMap<String, Integer>();
	}
	
	public void doubleArray()
	{
		size = size * 2;
	}
	
	public void addPerson(Person p)
	{
		if(size >= people.length)
		{
			doubleArray();
		}
		
		people[size] = p;
		size++;
	}
	
	public String toString()
	{
		return null;
	}
	
	private void readFile()
	{
		BufferedReader lineReader = null;
		try
		{
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while((line = lineReader.readLine()) != null)
			{
				String name = lineReader.readLine();
				String id = lineReader.readLine();
			}
		}
	}
	
	public void writeFile()
	{
		doWrite(fileName);
	}
	
	private void doWrite(String fN)
	{
		try
		{
			FileWriter fw = new FileWriter(fN);
			BufferedWriter myOutfile = new BufferedWriter(fw);
			
			for(int i = 0; i < size; i++)
			{
				Person person = people[i];
				if(person instanceof Person)
				{
					myOutfile.write(person.getName() + "\n");
					myOutfile.write(person.getId() + "\n");
				}
				else
				{
					System.err.println("Error in array, instance type not found");
				}
			}
			myOutfile.flush();
			myOutfile.close();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
