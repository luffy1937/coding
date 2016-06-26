/**
 * 检查某个二进制数（以字符串形式传入),是否等于以字符串表示的十六进制数。
 * @author liuyuefeng
 *
 */
import org.junit.Test;
public class Page35_1 {
	@Test
	public  void test(){
			
		System.out.println(compareBinToHex("1010","a"));
	}
	public boolean compareBinToHex(String binary, String hex){
		int n1 = convertToBase(binary, 2);
		int n2 = convertToBase(hex, 16);
		if(n1 < 0 || n2 < 0){
			return false;
		}
		else{
			return n1 == n2;
		}
	}
	public int convertToBase(String number, int base){
		if(base < 2 || (base >10 && base!= 16)) return -1;
		int value = 0;
		for (int i = number.length() - 1; i >= 0; i--){
			int digit = digitToValue(number.charAt(i));
			if (digit < 0 || digit >= base){
				return -1;
			}
			int exp = number.length()-1 -i;
			value += digit*Math.pow(base,exp);
		}
		return value;
	}
    public int digitToValue(char c){
    	if (c >= '0' && c<='9') return c-'0';
    	else if (c>='A'&&c<='F') return 10+c-'A';
    	else if (c>='a'&&c<='f')return 10+c-'a';
    	return -1;
    }
}
