import java.util.Scanner;

public class ED003 {
    static String m1;
    static String m2;
    static int[][] flags;


    public static void solve(){
        if(m1.charAt(0) >= 'A' && m1.charAt(0) <= 'Z')      flags[0][0] = 1; // 1 gen
        else if(m1.charAt(3) >= 'A' && m1.charAt(3) <= 'Z') flags[0][0] = 2; // 2 gen
        else if(m1.charAt(6) >= 'A' && m1.charAt(6) <= 'Z') flags[0][0] = 3; // 3 gen

        if(m2.charAt(0) >= 'A' && m2.charAt(0) <= 'Z')      flags[0][1] = 1;
        else if(m2.charAt(3) >= 'A' && m2.charAt(3) <= 'Z') flags[0][1] = 2;
        else if(m2.charAt(6) >= 'A' && m2.charAt(6) <= 'Z') flags[0][1] = 3;

        int sum = 0;
        int dif = 0;
        if (flags[0][0] == 1 && flags[0][1] = 1) { // m1 m2 sao da 1 gen
            dif = m1.charAt(1) - m2.charAt(1);
            sum += dif*1000;
            dif = m1.charAt(0) - m2.charAt(0);
            sum += dif*10000;
            dif

        }



    }

    public static void input(Scanner in)
    {
        m1 = in.next();
        m2 = in.next();
        flags = new int[1][2];

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases > 0){
            input(in);
            solve();
            cases--;
        }
    }
}
