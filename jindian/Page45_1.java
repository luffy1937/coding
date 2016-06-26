import java.util.ArrayList;
import java.util.HashMap;

/**
 * 使用散列表
 * 
 * @author liuyuefeng
 *
 */
public class Page45_1 {
	class Student{
		private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
	}
	public HashMap<Integer,Student> buildMap(Student[] students){
		HashMap<Integer,Student> map = new HashMap<Integer,Student>();
		for (Student s:students){
			map.put(s.getId(),s);
		}
		return map;
	}
	/**
	 * 使用ArrayList
	 * @param words
	 * @param more
	 * @return
	 */
	public ArrayList<String> merge(String[] words,String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w:words) sentence.add(w);
		for (String w :more) sentence.add(w);
		return sentence;
	}
	/**
	 * 每次拼接都会产生一个新的字符串
	 * @param words
	 * @return
	 */
	public String joinWords(String[] words){
		String sentence ="";
		for(String s:words){
			sentence +=s;
		}
		return sentence;
	}
	/**
	 * 创建一个可以容纳所有字符串的数组，等到拼接完成才将这些字符串转化成一个字符串
	 * @param words
	 * @return
	 */
	public String joinWords2(String[] words){
		StringBuffer sentence = new StringBuffer();
		for (String s:words){
			sentence.append(s);
		}
		return sentence.toString();
	}
	
}
