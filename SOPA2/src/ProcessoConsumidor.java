
public class ProcessoConsumidor {
	
	
	
	
	Buffer buffer = Buffer.getInstance();
	

	public ProcessoConsumidor(){}
	
	
	public boolean run(){
		
		if(buffer.remove()==true) return true;
		return false;
		
	}
}
