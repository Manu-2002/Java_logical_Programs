import java.util.Scanner;
public class Mulmatrix
 {
 public static void main(String args[])
 {
 int n;
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the base of squared matrices");
 n = scan.nextInt();
 int[][] a = new int[n][n];
 int[][] b = new int[n][n];
 int[][] c = new int[n][n];
 System.out.println("Enter the elements of 1st martix row wise \n");
 for (int i = 0; i < n; i++)
 {
 for (int j = 0; j < n; j++)
 {
 a[i][j] = scan.nextInt();
 }
 }
System.out.println("Enter the elements of 2nd martix row wise \n");
 for (int i = 0; i < n; i++)
 {
 for (int j = 0; j < n; j++)
 {
 b[i][j] = scan.nextInt();
 }
 }
System.out.println("Multiplying the matrices...");
 for (int i = 0; i < n; i++)
 {
 for (int j = 0; j < n; j++)
 {
 for (int k = 0; k < n; k++)
 {
 c[i][j] = c[i][j] + a[i][k] * b[k][j];
 }
 }
 }
System.out.println("The product is:");
for (int i = 0; i < n; i++)
 {
 for (int j = 0; j < n; j++)
 {
 System.out.print(c[i][j] + " ");
 }
 System.out.println();
 }
 scan.close();
 }
}
