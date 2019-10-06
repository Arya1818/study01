package study01.test07;

public class home {

    public static void numbering(int init, int limit) {
        int i = init;               // int i = 1
        while (i < limit) {         // 1<5  
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5);
    }
    
 
}
