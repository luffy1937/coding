import org.junit.Test;
public class Page46_8 {

	public boolean isSubstring(String s1,String s2){
		return true;
	}
	public boolean isRotation(String s1, String s2){
		int len  = s1.length();
		if (s2.length()==len&&len>0){
			return isSubstring(s1+s1,s2);
		}
		return false;
	}
}
