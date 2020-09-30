import java.util.Scanner;

public class DAA003 {
    static String m1;
    static String m2;


    public static void solve(){
        int mat1 = 0;
        int mat2 = 0;
        if(m1.charAt(0) >= 'A' && m1.charAt(0) <= 'J' && m1.charAt(6) >= '0' &&  m1.charAt(6) <= '9')      mat1 += ((m1.charAt(0)) - 'A') * 10000;
        else if(m1.charAt(0) >= 'L' && m1.charAt(0) <= 'V' && m1.charAt(6) >= '0' &&  m1.charAt(6) <= '9') mat1 += ((m1.charAt(0)) - 'A' - 1) * 10000;
        else if(m1.charAt(0) == 'X' && m1.charAt(6) >= '0' &&  m1.charAt(6) <= '9')                        mat1 += 22;
        else if(m1.charAt(0) == 'Z' && m1.charAt(6) >= '0' &&  m1.charAt(6) <= '9')                        mat1 += 23;

        else if(m1.charAt(6) >= 'A' && m1.charAt(6) <= 'J' && m1.charAt(3) >= '0' &&  m1.charAt(3) <= '9') mat1 += ((m1.charAt(6)) - 'A') * 10000 + 59000;
        else if(m1.charAt(6) >= 'L' && m1.charAt(6) <= 'V' && m1.charAt(3) >= '0' &&  m1.charAt(3) <= '9') mat1 += ((m1.charAt(6)) - 'A' - 1) * 10000 + 59000;
        else if(m1.charAt(6) == 'X' && m1.charAt(3) >= '0' &&  m1.charAt(3) <= '9')                        mat1 += 59000 + 22;
        else if(m1.charAt(6) == 'Z' && m1.charAt(3) >= '0' &&  m1.charAt(3) <= '9')                        mat1 += 59000 + 23;

        else if(m1.charAt(3) >= 'A' && m1.charAt(3) <= 'J') mat1 += ((m1.charAt(3)) - 'A') * 10000 + 59000 + 59000;
        else if(m1.charAt(3) >= 'L' && m1.charAt(3) <= 'V') mat1 += ((m1.charAt(3)) - 'A' - 1) * 10000 + 59000;
        else if(m1.charAt(3) == 'X')                        mat1 += 59000 + 59000 + 22;
        else if(m1.charAt(3) == 'Z')                        mat1 += 59000 + 59000 + 23;

        else if

        else if(m2.charAt(0) >= 'A' && m2.charAt(0) <= 'J' && m2.charAt(6) >= '0' &&  m2.charAt(6) <= '9') mat2 += ((m2.charAt(0)) - 'A') * 10000;
        else if(m2.charAt(0) >= 'L' && m2.charAt(0) <= 'V' && m2.charAt(6) >= '0' &&  m2.charAt(6) <= '9') mat2 += ((m2.charAt(0)) - 'A' - 1) * 10000;
        else if(m2.charAt(0) == 'X' && m2.charAt(6) >= '0' &&  m2.charAt(6) <= '9')                        mat2 += 22;
        else if(m2.charAt(0) == 'Z' && m2.charAt(6) >= '0' &&  m2.charAt(6) <= '9')                        mat2 += 23;

        else if(m2.charAt(6) >= 'A' && m2.charAt(6) <= 'J' && m2.charAt(3) >= '0' &&  m2.charAt(3) <= '9') mat2 += ((m2.charAt(6)) - 'A') * 10000 + 59000;
        else if(m2.charAt(6) >= 'L' && m2.charAt(6) <= 'V' && m2.charAt(3) >= '0' &&  m2.charAt(3) <= '9') mat2 += ((m2.charAt(6)) - 'A' - 1) * 10000 + 59000;
        else if(m2.charAt(6) == 'X' && m2.charAt(3) >= '0' &&  m2.charAt(3) <= '9')                        mat2 += 59000 + 22;
        else if(m2.charAt(6) == 'Z' && m2.charAt(3) >= '0' &&  m2.charAt(3) <= '9')                        mat2 += 59000 + 23;

        else if(m2.charAt(3) >= 'A' && m2.charAt(3) <= 'J') mat2 += ((m2.charAt(3)) - 'A') * 10000 + 59000 + 59000;
        else if(m2.charAt(3) >= 'L' && m2.charAt(3) <= 'V') mat2 += ((m2.charAt(3)) - 'A' - 1) * 10000 + 59000;
        else if(m2.charAt(3) == 'X')                        mat2 += 59000 + 59000 + 22;
        else if(m2.charAt(3) == 'Z')                        mat2 += 59000 + 59000 + 23;

        else if()
        
        if(mat1 > mat2) System.out.println(mat1-mat2);
        else if(mat2 > mat1) System.out.println(mat2-mat1);
        else System.out.println(mat1);
    }

    public static void input(Scanner in)
    {
        m1 = in.next();
        m2 = in.next();
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
