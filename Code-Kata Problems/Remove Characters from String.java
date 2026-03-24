import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean[] remove = new boolean[256];

        for(int i = 0; i < s2.length(); i++){
            remove[s2.charAt(i)] = true;
        }

        String result = "";

        for(int i = 0; i < s1.length(); i++){
            if(!remove[s1.charAt(i)]){
                result += s1.charAt(i);
            }
        }

        if(result.length() == 0){
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}