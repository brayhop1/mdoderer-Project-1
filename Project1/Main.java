package Project1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Daniel Massa", 1);
		Person p2 = new Person("Markus Johnson", 2);
		Database myData = new Database();
		System.out.println(myData);
		myData.addPerson(p1);
		myData.addPerson(p2);
		
		System.out.println(myData);
		System.out.println();
		System.out.println();

	}

}
