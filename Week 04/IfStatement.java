public class IfStatement{
	public static void main(String[] args){
		int a = 5 , b = 5;
		printRow(a, b);
		b = -5;
		printRow(a, b);
		a = -10;
		printRow(a, b);
	}
	
	public static void printRow(int a, int b){
		System.out.print("a = " + a + ", b = " + b + "\t");
		if(a == b){
			System.out.print(" a Equal b");
		}else if(a > b){
			System.out.print(" a is Larger");
		}else{
			System.out.print(" b is Larger");
		}
		System.out.println();
	}
}