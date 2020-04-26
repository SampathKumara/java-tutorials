public class NestedLoop {
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++){
			for(int j = 0; j <= 9; j++){
				if(i == 0 && j == 0){
					continue;
				}
				System.out.println(""+i+j);
			}
			System.out.println("=========");
		}
	}
}