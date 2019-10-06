package practice;

import java.util.Scanner;

public class Practice04 {
	
    public static String[] getMembers() {
        String[] members = { "유진", "지수", "혜인" };
        return members;
    }
 
    public static void main(String[] args) {
       String[] members = getMembers(); 
       System.out.println(members);
       
       //정해져있지 않은 데이터 타입은 원래 출력하면 java에서 기억하는 메모리 주소가 나옴.
       Scanner s = new Scanner(System.in);
       System.out.println(s);
       Practice04 pr = new Practice04();
       System.out.println(pr);
       //이런식으로 예외로 String은 원래 정해져있지 않은 데이터 타입이지만
       //정해져있는 데이터타입의 변수처럼 스트링 자체를 집어 넣을 수가 있기 때문에
       //대입한 스트링 값이 그대로 출력됨. 이건 나중에 배울 toString() 때문에 그럼.
       String str = "abc";
       System.out.println(str);
       //String[] <-- 데이터타입이 스트링이 아닌 스트링 배열 이기 때문에 
       //저 변수가 가지고 있는 값이 출력되는것이 아니라
       //자바에서 기억하고 있는 메모리 주소가 나옴.
       System.out.println(members);
       //String[] 배열 변수 안에 있는 스트링을 출력하고 싶다면 하나하나 꺼내서 출력해야 함.
       for(int i=0;i<members.length;i++) {
    	   System.out.println(members[i]);
       }
    }
}