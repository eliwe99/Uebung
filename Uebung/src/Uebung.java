
public class Uebung {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(120));
	}
		
		/*System.out.println(fac(5));	
	}
	
	static int fac (int x){
		
		int e = x;
		while(x>=2){
			x=x-1;
			e=e*x;
		}
		if(x==0)return 1;
		else return e;
	}*/
	
	static long fibonacci (long i){
		if(i<=0){return 0;}
		else {
			if(i==1 || i==2){return 1;}
			else {return (fibonacci(i-2)+fibonacci(i-1));}
		}
	}
}
	

	



