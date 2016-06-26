import org.junit.Test;

public class Page46_6 {
	public void rotate(int[][] mat,int n){
		for(int layer =0;layer<n/2;layer++){
			int first = layer;
			int last = n-layer-1;
			for(int i=first;i<last;i++){
				int top = mat[layer][i];
				mat[layer][i]=mat[last-i][layer];
				mat[last-i][layer]=mat[last][last-i];
				mat[last][last-i]=mat[first+i][last];
				mat[first+i][last]=top;
			}
		}
	}
	public void rotate2(int[][]mat,int n){
		for(int layer=0;layer<n/2;layer++){
			int top = layer;
			int left = layer;
			int bottom = n-1-layer;
			int right = n-1-layer;
			//System.out.println(top+" "+bottom);
			for(int i=0;i<(bottom-top);i++){
				//System.out.println("sss");
				int topnum = mat[top][left+i];
				mat[top][left+i]=mat[bottom-i][left];
				mat[bottom-i][left]=mat[bottom][right-i];
				mat[bottom][right-i]= mat[top+i][right];
				mat[top+i][right]=topnum;
			}
		}
	}
	@Test
	public void test(){
		int [][] m={{1,2,3},
				{4,5,6},
				{7,8,9}};
		rotate2(m, 3);
		for(int [] h:m){
			for(int s:h){
				System.out.print(s); 
			}
			System.out.println();
		}
	}

}
