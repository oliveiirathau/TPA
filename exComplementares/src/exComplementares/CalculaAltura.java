package exComplementares;

public class CalculaAltura {

	public static void main(String[] args) {
	  
		int i=0;
		double j=1.34;
		double  p = 1.45;
		do {
			j=j+0.025;
			p= p+0.020;
	    i++;
		}while (j<p);
		
		System.out.println(" Altura final de Jo�o :" + j );
		System.out.println("Altura final de Pedro :" + p);
		System.out.println(" Ser�o necessarios " + i + " anos para Jo�o ficar mais alto que Pedro");


	}

}
