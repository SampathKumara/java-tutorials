public class Methods{
	public static void main(String args[]){
		int result = add(7, 2);
		System.out.println(result);
		
		result = substract(7, 2);
		System.out.println(result);		
	}
	
	public static int add(int a, int b){
		int res = a + b;
		return res;
	}
	
	public static int substract(int a, int b){
		int res = a - b;
		return res;
	}
}