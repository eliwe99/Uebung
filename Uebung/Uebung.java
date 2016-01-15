
public class Uebung {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(8));
	}
		
	static long fibonacci (long i){
		if(i<=0){return 0;}
		else {
			if(i==1 || i==2){return 1;}
			else {return (fibonacci(i-2)+fibonacci(i-1));}
		}
	}
}
	

	



