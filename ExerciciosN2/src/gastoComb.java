import java.util.*;
public class gastoComb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int km,l,c;
		System.out.println("digite o valor da distancia percorrida");
		km= in.nextInt();
		
		System.out.println("digite a capacidade do tanque");
		l= in.nextInt();
		
		c= km/l;
		System.out.println("O gasto medio de combutivel �:"+ c);
		
		if(c >10) {
			System.out.println("Econ�mico");
		}else {
			System.out.println("N�o econ�mico");
		}in.close();
		

	}

}
