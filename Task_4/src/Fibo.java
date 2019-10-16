import java.util.Scanner;

public class Fibo {
    public static void main (String[] args) {
        System.out.println("Введите n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x0 = 1;
        int x1 = 1;
        int x2;
        System.out.print(x0+" "+x1+" ");
        for(int i = 3; i <= n; i++){
            x2= x0+x1;
            System.out.print(x2+" ");
            x0=x1;
            x1=x2;
        }
        System.out.println();
    }
}