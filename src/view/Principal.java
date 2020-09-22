
package view;
import java.util.concurrent.Semaphore;
import controller.ThreadCar;

public class Principal {
	public static void main(String[] args) {
		
		int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);
		
		for (int idCarro = 0; idCarro < 4; idCarro++) {
			
			Thread carros = new ThreadCar(idCarro, semaforo);
			carros.start();
		}
		
		
	}
	
}