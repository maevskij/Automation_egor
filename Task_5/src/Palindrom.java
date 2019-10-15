import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args){
        System.out.println("Введите слово в нижнем регистре:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        isPalindrom (s);
    }
    public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;


    }
    public static void isPalindrom (String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Палиндром");
        }else{
            System.out.println("Не палиндром");
        }
        reverseString(s);

    }

}
