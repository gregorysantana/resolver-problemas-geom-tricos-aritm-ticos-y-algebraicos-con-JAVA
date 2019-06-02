package MJL;

public class ClassGeometricas {
	
	double base=0,altura=0,radio=0, adelcuadrado, adeltriangulo, aCirculo, aRectangulo;
	
	public void AreaDelCuadrado(double nBase){
		 adelcuadrado = Math.pow(nBase, 2);
	     System.out.println("El area del cuadrado es: "+ adelcuadrado);
	 }
	
	public void AreaTriangulo(double nBase, double nAltura){
		// Base por altura, entre dos
		 adeltriangulo = (nBase * nAltura) / 2;
	     System.out.println("El area del triangulo es: "+ adeltriangulo);
	}
	
	public void AreaCirculo(double nRadio){
		// Área de un círculo
		// pi x radio al ^ 2 
		 aCirculo = Math.pow((3.14 * nRadio), 2);
	     System.out.println("El area del circulo es: "+ aCirculo);
	}
	
	public void AreaRectangulo(double nBase, double nAltura){
		// Área de un rectangulo
		 aRectangulo = (nAltura * nBase);
	     System.out.println("El area del rectangulo es: "+ aRectangulo);
	}
	

}
