public class DreiDimensional {

	public static void main(String[] args) {
		
		int p=1;
		int[][][] arrey= new int [10][10][10];
			for(int i=0; i<arrey.length; i++){
			for(int j=0; j<arrey[i].length; j++){	
			for(int k=0; k<arrey[i].length; k++){
				arrey[i][j][k]=p;p++;
			}}}
			
			
			for(int i=0; i<arrey.length; i++){
			for(int j=0; j<arrey[i].length; j++){	
			for(int k=0; k<arrey[i].length; k++){
										
					System.out.print(" "+arrey[i][j][k]+" ");
				
			}
			System.out.println();
		}
	}
}
}
