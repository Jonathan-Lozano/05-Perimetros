/**
 * 
 * @author Jonathan Lozano
 *
 */
public class AppPerimetros {

	/**
	 * Se crea una instancia de la clase Perimetros para asi acceder al metodo
	 * para calcular el perimetro del cuadrado
	 */
	public static void main(String[] args) {
		Perimetros p = new Perimetros();
		System.out.printf("El perimetro del cuadrado es: %d", p.cuadrado(10));
	}
}