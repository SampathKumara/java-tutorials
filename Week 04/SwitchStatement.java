public class SwitchStatement{
	public static void main(String[] args){
		printTask(99);
		//printTask(1);
		//printTask(7);
		//printTask(8);
	}
	
	public static void printTask(int day){
		switch(day){
			case 1:
				System.out.println("We have class today");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Today is a working Day");
				break;
			case 7:
				System.out.println("Off Day");
				break;
			default:
				System.out.println("Invalid day");
		}
	}
}