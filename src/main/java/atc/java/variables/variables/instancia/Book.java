package atc.java.variables.variables.instancia;

public class Book {

	/*La varaible de instancia se declaran sin un static, con esto esta 
	 * variable es propia de cada instancia**/
	private int total =0;
	public static int totalEstatic=0;
		
	public Book() {
		total++;
		totalEstatic++; 
	}

	public int getTotal() {
		return total;
		
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
