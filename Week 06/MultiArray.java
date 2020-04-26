public class MultiArray {
	public static void main(String[] args) {
		int[][] ar = new int[3][2];
		printArray(ar);
		ar[1][1] = 5;
		printArray(ar);
		
		//Irregular arrays
		int[][] ar2 = new int[4][];
		int[] a1 = {10,12,33,44};
		int[] a2 = {56,61};
		int[] a3 = {20, 6, 99};
		int[] a4 = {78};
		ar2[0] = a1;
		ar2[1] = a2;
		ar2[2] = a3;
		ar2[3] = a4;
		printArray(ar2);
		
		//more dimensions
		int[][][][][] ar3 = new int[2][3][2][2][2];
	}
	
	public static void printArray(int[][] ar){
		System.out.println("Printing Array:");
		for(int[] child: ar){
			for(int element: child){
				System.out.print(element+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}