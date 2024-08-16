import java.util.*; // importamos java.util
//import java.util.ArrayList;

public class codigo{
	// Modificamos el nombre de la clase
	// se agrega el main
	  public static void main(String[] args){
	// se declara de forma correcta el array para que contenga 20 numeros en el arreglo
		int[] n = new int[20];
	// ciclo que itera sobre los 20 numeros del array con una funcion .Math para su formulacion
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
		  // imprimimos los numeros despues de que se itero con dicha funcion 
	      System.out.println(n[i] + " ");
	    }

System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		// Se agregrega un parentesis
	    int opcion = Integer.parseInt(System.console().readLine());

		// Se coloca de forma correcta la Condicion ternaria.
	    int multiplo = (opcion == 1) ? 5 : 7;

	    for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
		  } else {
	        System.out.println(e + " ");
	      }
	    }
	  
	}
}