import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 numbers separated by comma: ");
		String value = input.next();
		String numbers[] = value.split(",");
		int result = add(numbers[0], numbers[1]);
		System.out.println("Addition is " + result);
	}

	public static int add(String a, String b){
		int res = new Integer(a) + new Integer(b);
		return res;
	}
}