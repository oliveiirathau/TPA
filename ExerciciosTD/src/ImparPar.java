import java.util.*;
public class ImparPar {
    public static void main (String args [] ) {
    	Scanner in = new Scanner (System.in);
    	int n ;
    	
    	System.out.println ("Digite um numero");
    	n = in.nextInt();
    	if (n % 2 == 0) {
    	System.out.println("O numero � par!");
    	
    } else {
    	System.out.println("O numero � impar!");
    }in.close();
}
}

