
public class MehrdimensionaleArreys {

	public static void main(String[] args) {
		
		int p=1;
		int[][] arrey= new int [500][500];
			for(int i=0; i<arrey.length; i++){
			for(int j=0; j<arrey[i].length; j++){		
				arrey[i][j]=p;p++;
			}}
			
			
			for(int i=0; i<arrey.length; i++){
			for(int j=0; j<arrey[i].length; j++){	
										
					System.out.print(" "+arrey[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
