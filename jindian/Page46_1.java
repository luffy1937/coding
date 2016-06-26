/**
 * 确定一个字符串的所有字符是否完全不同。如果不允许使用额外的数据结构，又该如何处理。
 * @author liuyuefeng
 *
 */
import org.junit.Test;
public class Page46_1 {
	/**
	 * 假设字符集是asc2
	 * @param s
	 * @return
	 */
	public boolean allDiff(String s){
		if (s.length()>256) return false;
		boolean[] char_set = new boolean[256];
		for(int  i = 0;i<s.length();i++){
			int val =s.charAt(i);
			if(char_set[val])return false;
			else char_set[val]=true;
		}
		return true;
	}
	@Test
	public void test1(){
		String s= "safjb889q";
		System.out.println(allDiff(s));
	}
}
