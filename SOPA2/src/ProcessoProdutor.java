
public class ProcessoProdutor {
	
	Buffer buffer = Buffer.getInstance();
	
	public ProcessoProdutor(){}
	
	public boolean run(){
		if(buffer.add("-")==true) return true;
		return false;	
	}
}
