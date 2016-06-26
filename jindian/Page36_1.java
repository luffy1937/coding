/**
 * 交换数组中最大值和最小值
 * @author liuyuefeng
 *
 */
import org.junit.Test;

public class Page36_1 {
	public void swapMinMax(int[] array){
		int minIndex = 0;
		for (int i =1;i<array.length;i++){
			if(array[i]<array[minIndex]){
				minIndex = i;
			}
		}
		int maxIndex = 0;
		for(int i =1; i<array.length;i++){
			if(array[i]>array[maxIndex]){
				maxIndex = i;
			}
		}
		int temp = array[minIndex];
		array[minIndex]=array[maxIndex];
		array[maxIndex]=temp;
	}
	
	public static int getMinIndex(int[] array){
		int minIndex=0;
		for (int i=1;i<array.length;i++){
			if (array[i]<array[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	public static int getMaxIndex(int[] array){
		int maxIndex=0;
		for (int i=1;i<array.length;i++){
			if(array[i]>array[maxIndex]){
				maxIndex=i;
			}
		}
		return maxIndex;
	}
    public static void swap(int [] array,int m ,int n){
    	int temp = array[m];
    	array[m]=array[n];
    	array[n]=temp;
    }
    public static void swapMinMaxBetter(int [] array){
    	int minIndex = getMinIndex(array);
    	int maxIndex = getMaxIndex(array);
    	swap(array,minIndex,maxIndex);
    }
    @Test
    public void test(){
    	int [] a ={1,2,5,8,9};
    	swapMinMaxBetter(a);
    	for(int i:a){
    		System.out.println(i);
    	}
    }
}
