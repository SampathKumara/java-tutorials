public class TestScope{
	int a = 1;
	
	public void MyMethod(int x){
		a = 5;
		int b = 22;
		if(x == 10){
			a = 44;
			b = 11;
			int c = 14;
			c = 4;
		}
		//c = 33;
	}

	void AnotherMethod(){
		int a = 16;
		int b = 17;
		int c = 18;
		int x = 19;
	}
}