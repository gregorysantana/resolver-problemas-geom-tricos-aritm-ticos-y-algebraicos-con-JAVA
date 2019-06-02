package MJL;

public class ClassAlgebraicos {
	
	double rCuadratica, raiz;
	
	public void EcuacionCuadratica(double nCuadratico, double nLineal, double nIndependiente){
		double raiz = Math.pow(nLineal,2) - 4 * nCuadratico * nIndependiente;
		if(nCuadratico!=0){
			if(raiz < 0) {
				System.out.println("No existen soluciones reales para esta entrada\n");
			}else {
				double x1 = ( - nLineal + Math.sqrt(raiz)) / (2 * nCuadratico);
				double x2 = ( - nLineal - Math.sqrt(raiz)) / (2 * nCuadratico);
				System.out.println("Respuestas: \n"
						+ "x1 = " + x1 + "\n"
						+ "x2 = " + x2 + "\n");
			}
		}
	}
	

}
