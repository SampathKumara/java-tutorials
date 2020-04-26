public class TestException{
	public static void main(String[] args){
		try{
			String s = args[10];
		}catch(Exception ex){
			System.out.println("Invalid Index :" + ex.getMessage());
		}
		System.out.println("Test");
		
		int x = 5;
		try{
			int result = x / 0;
			System.out.println("Result is : " + result);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("Thank you !");
	}
}