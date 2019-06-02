package MJL;
public class ClassAritmetica {

	int suma;
	int resta;
	int multiplicacion;
	double division;
	
	 public void Sumar(int numero1, int numero2){
	     suma = numero1 + numero2;
	     System.out.println("La suma es: "+suma);
	 }
	 
	 public void Resta(int numero1, int numero2){
	     resta = numero1 - numero2;
	     System.out.println("La resta es: " + resta);
	 }
	 
	 public void Multiplicacion(int numero1, int numero2){
	     multiplicacion = numero1 * numero2;
	     System.out.println("La multiplicacion es: " + multiplicacion);
	 }
	 
	 public void Division(double numero1, double numero2){
		 division = numero1 / numero2;
	     System.out.println("La division es: " + division);
	 }	
}
