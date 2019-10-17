package practice01;

import java.util.HashMap;

public class MapTest {
	    static void changeMap(HashMap<String,String> person) {
	  	  person = new HashMap<String,String>();
	  	  person.put("이름","홍길동");
	    }
	    public static void main(String[] args) {
	  	  HashMap<String,String> person = new HashMap<String,String>();
	  	  changeMap(person);
	  	  System.out.println(person);
	    }
	}


