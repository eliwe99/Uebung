
public class List {

    public Liste kopf;
	
	public List (int wert){
		kopf = new Liste (wert);
	}
	public void add(int wert){
		kopf.add(new Liste (wert));
	}
	public int getGroesse(){
		return kopf.getGroesse(0);
	}
	public String toString(){
		return kopf.toString();
	}
}
