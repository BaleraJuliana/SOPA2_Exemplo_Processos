
public class Buffer{


	private static final int BUFFER_SIZE = 100;
	private static Buffer uniqueInstance;
	private Object[] buffer;
	private int count = 0;
	
	private Buffer(){ buffer = new Object[BUFFER_SIZE];}
	
	public static Buffer getInstance(){
		if(uniqueInstance == null) uniqueInstance = new Buffer();
		return uniqueInstance;
	}
	
	public boolean add(Object o){
		if(count==BUFFER_SIZE) return false;
		buffer[count] = o;
		count++;
		return true;
		
	}
	
	public boolean remove(){
		if(count==0) return false;
		count--;
		return true;
	}
}
