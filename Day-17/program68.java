import java.util.Scanner;

public class Program68 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = {10, 20, 30, 40};
        int b[] = {30, 40, 50, 60};

        System.out.println("Common Elements:");

        for(int i = 0; i < a.length; i++) {

            for(int j = 0; j < b.length; j++) {

                if(a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }

        sc.close();
    }
}