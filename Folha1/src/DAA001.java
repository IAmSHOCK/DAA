import java.util.Arrays;
import java.util.Scanner;
public class ED001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (in.hasNextInt()){
           int n = in.nextInt();
           if(n == 42) count++;
        }
        System.out.println(count);
    }
}
