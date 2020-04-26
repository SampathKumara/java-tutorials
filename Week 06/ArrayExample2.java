public class ArrayExample2 {
	public static void main(String[] args) {
		int length = args.length;
		if(length > 0){
			System.out.println("You have provided " + length + " argument(s)");
			System.out.println("They are:");
			float total = 0;
			for(int index = 0; index < length; index++){
				System.out.println(args[index]);
				total += new Float(args[index]);
			}
			System.out.println("Average is : " + (total/length));
		}else{
			System.out.println("Please provided some arguments");
		}
	}
}