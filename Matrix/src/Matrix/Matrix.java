package Matrix;

public class Matrix {

	public static void main(String[] args) {
		int row=0;
		int col=0;
		int[][] M1= {{3,4},{5,8}};
		int[][] M2= {{4,9},{5,7}};
		int[][] M3= new int[2][2];
		for(int i=1;i<M3.length;i++) {
		for(row=0;row<M1.length;row++){
			for(col=0;col<M2.length;col++) {
				 M3[row][col]=M1[row][col]*M2[row][col];
				 System.out.println(M3[row][col]);
			}
			 
		}

	}
}
}


