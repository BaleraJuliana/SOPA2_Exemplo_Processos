import java.util.Random;
import java.util.Scanner;

public class Processador {


	public static void main(String[] args){

		Buffer bb = Buffer.getInstance();
		Escalonador escalonador = new Escalonador();
		ProcessoConsumidor processoConsumidor = new ProcessoConsumidor();
		ProcessoProdutor processoProdutor = new ProcessoProdutor();
		int count = 0;


		while(true){
			while(true){
				
				String vez = escalonador.escalonar();
				
				if(vez.equals("consumidor")){
					
					System.out.print("ProcessoConsumidor no processador ----->Uso do Buffer: "+(--count));
					
					if(processoConsumidor.run()==false){
						System.out.print("\tERRO ! Buffer cheio :( ");
						++count;
						System.out.println("");
						Scanner leitor = new Scanner(System.in);
						int prossegue = leitor.nextInt();
						break;
					}					
					System.out.println("");
				}

				if(vez.equals("produtor")){
					
					System.out.print("ProcessoProdutor no processador   ----->Uso do Buffer: "+(++count));
					if(processoProdutor.run()==false){
						System.out.print("\tERRO ! Buffer vazio :( ");
						--count;
						System.out.println("");
						Scanner leitor = new Scanner(System.in);
						int prossegue = leitor.nextInt();
						break;
					}
					System.out.println("");
				}
			
			}


		}
	}
}
