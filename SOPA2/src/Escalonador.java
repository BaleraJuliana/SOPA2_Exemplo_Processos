import java.util.Random;

public class Escalonador {


	public Escalonador(){}

	public String escalonar(){

		Random gerador = new Random();
		int processo = gerador.nextInt();

		if(processo%2==0){
			return "consumidor";
		}
		return "produtor";
	}
}
