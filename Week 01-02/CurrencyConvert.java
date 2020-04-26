import java.util.Scanner;

public class CurrencyConvert{
	public static void main(String args[]){
		double rate = new Double(args[0]);
		System.out.println("This tool converts USD to LKR");
		System.out.println("Today rate is 1 USD = " + rate + " Rs\n\n");
		System.out.print("Enter amount of USD to convert: ");
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		double result = convert(value, rate);
		System.out.println("Amount in LKR is : " + result);
	}

	public static double convert(double usd, double rate){
		double res = usd * rate;
		return res;
	}
}