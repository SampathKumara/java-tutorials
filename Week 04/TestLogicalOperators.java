public class TestLogicalOperators{
	public static void main(String[] args){
		System.out.println("p value\tq value\t(p & q)\t(p |  q)\t(p ^ q)\t(!p)\t(!q)");
		boolean p = true , q = true;
		printRow(p, q);
		q = false;
		printRow(p, q);
		p = false;
		q = true;
		printRow(p, q);
		q = false;
		printRow(p, q);
	}
	
	public static void printRow(boolean p, boolean q){
		System.out.print( p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t" );
		System.out.println((p ^ q) + "\t" + (!p) + "\t" + (!q) );
	}
}