package JavaBrushup;

public class ifElse {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,4}; 
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] > 3)
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i]+ " is not greater than 3");
			}
					
		}

	}

}
