import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size of First Array: ");
        int n1 = sc.nextInt();

        int a[] = new int[n1];

        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Size of Second Array: ");
        int n2 = sc.nextInt();

        int b[] = new int[n2];

        for(int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n1 + n2];

        for(int i = 0; i < n1; i++) {
            c[i] = a[i];
        }

        for(int i = 0; i < n2; i++) {
            c[n1 + i] = b[i];
        }

        System.out.println("Merged Array:");

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}