import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class P_1712A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            Vector<Integer> v = new Vector<Integer>(n);

            for (int i = 0; i < n; i++) v.add(sc.nextInt());

            if (n==k) {
                System.out.println("0");
                continue;
            }

            Set<Integer> st = new HashSet<Integer>();

            for(int i=0; i < k; i++) st.add(v.get(i));

            int minOp = 0;

            for (int i = 1; i <= k; i++){
                if(st.contains(i)) continue;
                else
                    minOp++;

            }

            System.out.println(minOp);


        }
    }
}
