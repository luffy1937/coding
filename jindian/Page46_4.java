import org.junit.Test;
public class Page46_4 {
	public char[] space2other(char[] chars,String other){
		int countspace=0;
		for(char c:chars){
			if(c==' '){
				countspace++;
			}
		}
		System.out.println(countspace);
		int newlen = chars.length+countspace*(other.length()-1);
		System.out.println(newlen);
		char [] newchars = new char[newlen];
		for(int i=newlen-1,j=chars.length-1;i>=0&&j>=0;){
			if(chars[j]==' '){
				for(int k=other.length()-1;k>=0;k--){
					newchars[i]=other.charAt(k);
					i--;
				}
				j--;
			}
			else{
				newchars[i]=chars[j];
				i--;
				j--;
			}
		}
		return newchars;
	}

	
	
    @Test
    public void test(){
    	char [] chars =space2other("sdf sdf dd  ".toCharArray(),"%%%%%");
    	for(char c :chars){
    		System.out.print(c);
    	}
    }
}
