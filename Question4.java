import java.util.Scanner;

// 4. Design method public int getReverseNumber(int num) 
// which return int value to that method and result print into main method.





public class Question4 {

	public static int getReverseNumber(int num)
	{
		
		int r=0;
		
		
		while (num!=0)
		{
			r = r*10;
			
			r = r +num%10;
			num = num/10;
			
		}
		return r;
		
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		

		System.out.println("Enter Your Number to Reverse");
		
		@SuppressWarnings("resource")
		Scanner sd = new Scanner(System.in);
		
		int num = sd.nextInt();
		
		int ref = getReverseNumber(num);
		
		System.out.println("-->" + ref);
		
	}

}
