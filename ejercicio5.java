import java.util.*; // utilizamos todo lo que este en java util
public class Codigo5 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("introduzca un valor");
	    int ni = s.nextInt(); // leyendo el valor del scanner
	    
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
			ni /= 10; // Se coloca restriccion para romper el while.
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");
		  //break;
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
	    
	  }
	  
	}
}