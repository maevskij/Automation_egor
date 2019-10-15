import java.util.Random;
import  java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i]=rnd.nextInt();
            System.out.println("arr["+i+"]="+arr[i]);
        }
        System.out.println("Числа в массиве сгенерированы.");
    }
}

