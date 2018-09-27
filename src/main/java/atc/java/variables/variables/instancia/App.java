package atc.java.variables.variables.instancia;


/**Variables de instancia*/


public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println("Instacia del primer objeto libro");
    	Book theBook0 = new Book();
    	
    	
    	System.out.println("***Varaiable estática***");
    	System.out.println("La varaible estatic total (Es compartida por todas las intancias, pertenece a la definicion de la clase): "+Book.totalEstatic);
    	
    	Book theBook1 = new Book();
    	System.out.println("Instacia del segundo objeto libro");
    	
    	System.out.println("\n ***Varaiable de instancia***");
    	System.out.println("La varaible de instancia total del libro 0 (variable propia de cada instancia): "+theBook0.getTotal());
    	System.out.println("La varaible de instancia total del libro 1 (variable propia de cada instancia): "+theBook1.getTotal());
    	System.out.println("Aunque se instacia 2 veces el objeto la variable total sin static es 1 en los dos casos, no así la static");
    	System.out.println("La varaible estatic total (Es compartida por todas las intancias, pertenece a la definicion de la clase): "+Book.totalEstatic);
    	
    	
    	
    	
    }
}
