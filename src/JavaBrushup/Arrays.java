package JavaBrushup;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = new int[5]; //Initialization method 1
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 5;
		arr[4] = 4;
		
		int[] arr2 = {1,3,2,5,4}; //Initialization method 2
		
			
		
		System.out.println(arr[0]+arr2[3]);
	
	// For loop
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		
	// Enhanced for loop example with string array
		
		String[] sarr = {"bob", "matt", "Alex"};
		for ( String a: sarr)
		{
			System.out.println(a);
		}
			

	}

}
