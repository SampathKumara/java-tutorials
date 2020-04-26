import java.util.Scanner;

public class InfiniteLoop{
	public static void main(String args[]){
		System.out.println("==Welcome to guess the magic number==\n");
		Scanner input = new Scanner(System.in);
		int attempt = 0;
		int magicNumber = (int)(Math.random() * 10);
		do{
			attempt++;
			System.out.print("Enter 0-9 number: ");
			int number = input.nextInt();
			if(number < 0 || number > 9){
				System.out.println("Invalid Number");
				continue;
			}
			if(number == magicNumber){
				System.out.println("You are the winner! Magic Number is " + magicNumber + " , Total attempts: " + attempt);
				break;
			}
			System.out.println("You entered " + number + ", try again.");
		}while(true);
	}
}