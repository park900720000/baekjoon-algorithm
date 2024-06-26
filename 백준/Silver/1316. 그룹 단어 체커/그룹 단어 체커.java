import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int count = 0;
        for (int i=0; i<num; i++) {
            if (check() == true) {
                count++;
            }
        }
        
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] arr = new boolean[26];
        String str = sc.next();
        int prev = 0;
        for (int i=0; i<str.length(); i++) {
            int now = str.charAt(i);
            if (prev != now) {
                if (arr[now - 'a'] == false) {
                    arr[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}