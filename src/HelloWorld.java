import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            if (a%2==0) System.out.println("0");
            else System.out.println("1");
        }
    }
}
