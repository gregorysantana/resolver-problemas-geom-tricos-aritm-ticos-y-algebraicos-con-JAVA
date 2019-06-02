// Trabajo Marionys Javier Ludwin
package MJL;
import java.util.Scanner;
import MJL.ClassAritmetica;
public class main {

	public static void main(String[] args) {
		int OpcionMainSelect, OpcionSelectAritmetica,n1aritmetica,n2aritmetica,resultadoSuma, OpcionSelectGeometric, opcionesAlgebraicas, OpcionSelectAlgebraicas;
		double BaseC, AlturaC, radioC, tCuadratico, tLineal, tIndependiente;
		
		Scanner opcionesMain1 = new Scanner( System.in );
		
		System.out.print( "Menu Principal:\n "
				+ "Seleccione la operacion que desea realizar.\n "
				+ "Opcion 1: aritmetica: \n"
				+ "Opcion 2: geometrica: \n"
				+ "Opcion 3: algebraica: \n");
		
		OpcionMainSelect = opcionesMain1.nextInt();
		
		System.out.print( "La opcion fue: " + OpcionMainSelect + "\n\n");
		
		if (OpcionMainSelect == 1) {
			
			// OPCIONES ARITMETICAS
			System.out.print( "Usted selecciono: " + OpcionMainSelect + " Aritmetica\n\n");
			
			Scanner opcionesAritmetica= new Scanner( System.in );
			System.out.print("Menu Opciones Aritmeticas: \n\n"
					+ "Seleccione lo que desea realizar: \n\n"
					+ "Opcion 1 sumar \n"
					+ "Opcion 2 resta \n"
					+ "Opcion 3 multiplicar \n"
					+ "Opciones 4 dividir \n");
			
			OpcionSelectAritmetica = opcionesAritmetica.nextInt();
			Scanner Naritmetica = new Scanner( System.in );
			
			System.out.print("Ingrese el primer numero: \n");
			n1aritmetica = Naritmetica.nextInt();
			
			System.out.print("Ingrese el segundo numero: \n");
			n2aritmetica = Naritmetica.nextInt();
			
			ClassAritmetica PaResolver = new ClassAritmetica();
			
			if(OpcionSelectAritmetica == 1) {
				PaResolver.Sumar(n1aritmetica,n2aritmetica);
			}else if(OpcionSelectAritmetica == 2) {
				PaResolver.Resta(n1aritmetica,n2aritmetica);
			}else if(OpcionSelectAritmetica == 3) {
				PaResolver.Multiplicacion(n1aritmetica,n2aritmetica);
			}else if(OpcionSelectAritmetica == 3) {
				PaResolver.Division(n1aritmetica,n2aritmetica);
			}
			// END OPCIONES ARITMETICAS
			
		} else if(OpcionMainSelect == 2) {
			System.out.print( "Usted selecciono: " + OpcionMainSelect + "geometrica\n\n");
			
			Scanner opcionesGeometricas= new Scanner( System.in );
			System.out.print("Menu Opciones Geometricas: \n"
					+ "Opcion 1 - Area de un cuadrado \n"
					+ "Opcion 2 - Area del Triangulo \n"
					+ "Opcion 3 - Area del circulo \n"
					+ "Opcion 4 - Area de un rectangulo \n");
			
			OpcionSelectGeometric = opcionesGeometricas.nextInt();
			Scanner NGemetrica = new Scanner( System.in );
			
			ClassGeometricas PaCalcular = new ClassGeometricas();
			
			if(OpcionSelectGeometric == 1) {
				// Area de un cuadrado
				System.out.print("Usted selecciono el area de un cuadrado \n");
				System.out.print("Ingrese la base del cuadrado: \n");
				BaseC = NGemetrica.nextInt();
				
				PaCalcular.AreaDelCuadrado(BaseC);				
				
			}else if(OpcionSelectGeometric == 2) {
				// Area de un Triangulo
				// Base por altura, entre dos
				System.out.print("Usted selecciono el area de un Triangulo \n");
				
				System.out.print("Ingrese la base: \n");
				BaseC = NGemetrica.nextInt();
				
				System.out.print("Ingrese la altura: \n");
				AlturaC = NGemetrica.nextInt();
				
				PaCalcular.AreaTriangulo(BaseC, AlturaC);
				
			}else if (OpcionSelectGeometric == 3) {
				System.out.print("Usted selecciono el area de un circulo \n");
				
				System.out.print("Ingrese el radio: \n");
				radioC = NGemetrica.nextInt();
				
				PaCalcular.AreaCirculo(radioC);
				
			}else if (OpcionSelectGeometric == 4) {
				System.out.print("Usted selecciono el area de un rectangulo \n");
				
				System.out.print("Ingrese la altura: \n");
				AlturaC = NGemetrica.nextInt();
				
				System.out.print("Ingrese la base: \n");
				BaseC = NGemetrica.nextInt();
				
				PaCalcular.AreaRectangulo(AlturaC, BaseC);				
				
			}
			
		}else if(OpcionMainSelect == 3) {
			System.out.print( "Usted selecciono: " + OpcionMainSelect + "algebraica\n");
			
			Scanner opcionesAlgebraicas1= new Scanner( System.in );
			System.out.print("Menu Opciones Geometricas: \n"
					+ "Opcion 1 - Ecuacion cuadratica \n"
					+ "Opcion 2 - Dos variables x & y \n"
					+ "Opcion 3 - Ecuacion Lineal \n");
			
			OpcionSelectAlgebraicas = opcionesAlgebraicas1.nextInt();
			
			Scanner NAlgebraica = new Scanner( System.in );
			
			ClassAlgebraicos PaAlgebra = new ClassAlgebraicos();
			

			// Termino Cuadratico
			
			System.out.print("Ingrese Termino Cuadratico: \n");
			tCuadratico = NAlgebraica.nextInt();
			
			// Termino Lineal
			System.out.print("Ingrese Termino Lineal: \n");
			tLineal = NAlgebraica.nextInt();
			
			// Termino Independiente
			System.out.print("Ingrese Termino Independiente: \n");
			tIndependiente = NAlgebraica.nextInt();
			
			
			if(OpcionSelectAlgebraicas == 1) {
				System.out.print("Usted selecciono Ecuacion cuadratica \n");				
				PaAlgebra.EcuacionCuadratica(tCuadratico, tLineal, tIndependiente);
				
			}else if (OpcionSelectAlgebraicas == 2) {
				System.out.print("Usted selecciono Dos variables x & y : \n");
				PaAlgebra.EcuacionCuadratica(tCuadratico, tLineal, tIndependiente);
				
			}else if (OpcionSelectAlgebraicas == 3) {
				System.out.print("Usted selecciono Ecuacion Lineal : \n");
				PaAlgebra.EcuacionCuadratica(tCuadratico, tLineal, tIndependiente);
			}
			
			
			
		}
		
		
		
	}

	

}
