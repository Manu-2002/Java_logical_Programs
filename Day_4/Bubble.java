import java.util.Scanner;

class Bubble {
    public static void main(String args[]) {
        Scanner mn = new Scanner(System.in);
        int n, i, j, t;


        System.out.println("Enter Array size:");
        n = mn.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the Array elements:");
        for (i = 0; i < n; i++) {
            a[i] = mn.nextInt();
        }

        System.out.println("The elements before sorting are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) { 
                if (a[j] > a[j + 1]) {
                  
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

     
        System.out.println("The elements after sorting are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
