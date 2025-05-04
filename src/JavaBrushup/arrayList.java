package JavaBrushup;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String> ();  //creating an Array list
		a.add("alex");
		a.add("matt");
		
		System.out.println (a.get(1)); //accessing an element
		
	//Iterating with a for loop
		
	for (int i=0; i<a.size(); i++)
	{
		System.out.println(a.get(i));
	}
	
	//Enhanced for loop
	for (String val: a)
	{
		System.out.println(val);
	}
	
	//converting array to array list
	

	}

}
