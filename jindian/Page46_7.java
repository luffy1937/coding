import org.junit.Test;
public class Page46_7 {
	public void setZeros(int[][] matrix){
		boolean [] row = new boolean[matrix.length];
		boolean [] column = new boolean[matrix[0].length];
		for (int i =0; i<row.length; i++){
			for (int j =0; j< column.length; j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		for(int i =0;i<row.length;i++){
			for (int j =0;j<column.length;j++){
				if (row[i]==true||column[j]==true){
					matrix[i][j]=0;
				}
			}
		}
	}

}
