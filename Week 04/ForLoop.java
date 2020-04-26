public class ForLoop{
	public static void main(String[] args){
		int sum = 0,start = 1, end = 5;
		int factorial = start;
		for(int i = start; i <= end; i++){
			//inside for loop
			System.out.println("Adding " + i + " to sum");
			sum += i;
			System.out.println("Multiplying factorial by " + i);
			factorial *= i;
		}
		System.out.println("Sum of " + start + " to " + end + " numbers is " + sum);
		System.out.println("Factorial " + end + " is " + factorial);		
	}	
}