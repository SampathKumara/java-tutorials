import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		//variable
		int a = 3;
		
		//array
		int[] myArray = new int[5];
		//int myArray[] = new int[5];
		
		System.out.println("3rd element of myArray is: " + myArray[2]);
		System.out.println("Printing array : " + Arrays.toString(myArray));
		
		//initializing the array
		myArray[0] = 1;
		myArray[1] = a;
		myArray[2] = 8;
		myArray[3] = 23;
		myArray[4] = 99;
		//myArray[5] = 199;
		
		System.out.println("3rd element of myArray is: " + myArray[2]);
		//Array size
		System.out.println("myArray has " + myArray.length + " elements");
		System.out.println("Printing array : " + Arrays.toString(myArray));

		//Alternative method
		int myArray3[] = {1,3,5,7,9};
		System.out.println("3rd element of myArray3 is: " + myArray3[2]);
		
	}
}