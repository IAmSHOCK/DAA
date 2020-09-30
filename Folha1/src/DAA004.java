import java.util.Scanner;

public class DAA004 {


    public static long checksum(long n)
    {
        long nsum = 0;
        while(n > 9){
            nsum += n % 10;
            n /= 10;
        }
        return (nsum += n);
    }
    public static long arranjadinhos(long n, long k){
        long nsum = checksum(++n);
        long dif;
        while(nsum != k){
            nsum = checksum(++n);
            if(nsum == k) return n;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases >= 0) {
            System.out.println(arranjadinhos(in.nextLong(), in.nextLong()));
            cases--;
        }
    }
}
