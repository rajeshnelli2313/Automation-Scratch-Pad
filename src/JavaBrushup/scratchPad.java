package JavaBrushup;

public class scratchPad {

	public static void main(String[] args) {
		
		System.out.println("This is for loop");
		for (int i = 0; i < 10; i++) {
		    if (i == 5) {
		        continue; 
		    }
		    System.out.println(i);
		}
		
		System.out.println("This is whileloop");
		int w = 0;
		while (w <=4)
		{
			System.out.println(w);
			w++;
		}
		
		System.out.println("This is dowhile");
		int dw = 0;
		do
		{
			System.out.println(dw);
			dw++;
		} while (dw <=4);

}
}
