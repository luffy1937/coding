import org.junit.Test;
public class Page46_3 {
	public boolean simichars(String s1,String s2){
		int [] charcount = new int[256];
		char[] s1chars = s1.toCharArray();
		for(char c:s1chars){
			charcount[c]++;
		}
		for(char c :s2.toCharArray()){
			if(--charcount[c] <0){
				return false;
			}
		}
		return true;
	}
	@Test
	public void test_simichars(){
		System.out.println(simichars("133","321"));
		
	}

}
