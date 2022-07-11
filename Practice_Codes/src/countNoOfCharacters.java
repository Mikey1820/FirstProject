import java.io.*;
import java.util.*;
	
public class countNoOfCharacters {
	    static void characterCount(String inputString)
	    {
	    	HashMap<Character,Integer> countOfCharacterMap=new HashMap<Character,Integer>();
	    	
	    	char[] charArray=inputString.toCharArray();
	    	
	    	for(char c:charArray) {
	    		if(countOfCharacterMap.containsKey(c)) {
	    			countOfCharacterMap.put(c, countOfCharacterMap.get(c)+1);
	    		}else {
	    			countOfCharacterMap.put(c,1);
	    		}
	    	}
	    	
	    	for(Map.Entry m:countOfCharacterMap.entrySet()) {
	    		System.out.println(m.getKey()+" : "+m.getValue());
	    	}
	    }
	    public static void main(String[] args) {
	    	String s="rutherford";
	    	characterCount(s);
	    }
	}
