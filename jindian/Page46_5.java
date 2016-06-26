import org.junit.Test;
public class Page46_5 {
	int countCompression(String str){
		if(str == null||str.isEmpty()) return 0;
		char last = str.charAt(0);
		int size =0;
		int count=1;
		for(int i =1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count=1;
			}
		}
		size += 1+String.valueOf(count).length();
		return size;
	}
	String compressBetter(String str){
		int size =countCompression(str);
		if(size>=str.length()){
			return str;
		}
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count =1;
		for(int i =1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				mystr.append(last);
				mystr.append(String.valueOf(count));
				count=1;
				last = str.charAt(i);
			}
		}
		mystr.append(last);
		mystr.append(String.valueOf(count));
		return mystr.toString();
	}
	@Test
	public void test (){
		System.out.println(compressBetter("aaabbb"));
	}

}
