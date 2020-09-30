import java.util.Scanner;

public class DAA002 {
    public static int checksum(int n)
    {
        int nsum = 0;
        while(n > 9){
            nsum += n % 10;
            n /= 10;
        }
        return (nsum += n);
    }
    public static int arranjadinhos(int n, int k){
        int nsum = checksum(++n);
        int dif;
        while(nsum != k){
           nsum = checksum(++n);
           if(nsum == k) return n;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases > 0){
            System.out.println(arranjadinhos(in.nextInt(), in.nextInt()));
            cases--;
        }
    }
}
