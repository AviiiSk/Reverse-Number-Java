import java.util.Scanner;

// 4. Design method public int getReverseNumber(int num) 
// which return int value to that method and result print into main method.




public class Question4_2 {
	
	
	public static int getReverseNumber(int n)
	{
		
		int r = 0;
		
		while (n>0)
		{
			r = n%10;
		  
		    System.out.print(r);
		    n = n/10;  
		    

			
		}
		return r;	
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		System.out.println("Enater Your Number to Reverse");
		Scanner sd = new Scanner (System.in);
		int n = sd.nextInt();
	
		
		getReverseNumber(n);
		
		
		
		
		
	}

}
