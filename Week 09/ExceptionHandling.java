public class ExceptionHandling{
	public static void main(String[] args){ //throws Exception{
		try{
			float result = 0;
			int a = new Integer(args[0]);
			int b = new Integer(args[1]);
			if(a > 100 || b > 100){
				throw new Exception("Values must be less than 100");
			}
			result = a / b;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.err.println("Please enter 2 numbers");
		}catch(NumberFormatException ex){
			System.err.println("Invalid value: " + ex.getMessage());
		}catch(ArithmeticException ex){
			System.err.println("Second number must be > 0");
		}catch(Exception ex){
			System.err.println("Exception: "+ ex.getMessage());
		}finally{
			System.out.println("Bye");
		}
	}
}