import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите n:");
        var n = s.nextInt();
        var randomArray = getRandomIntArray(n);
        var operation = getOperation();

        DisplayResult(calc(operation, randomArray));
    }

    private static ArrayList<Integer> getRandomIntArray(int count) {
        var arr = new ArrayList<Integer>();
        var rnd = new Random();
        for (int i = 0; i < count; i++) {
            var randomNumber = rnd.nextInt();
            arr.add(randomNumber);
            System.out.println(randomNumber);
        }
        System.out.println("Числа в массиве сгенерированы.");
        return arr;
    }

    private static char getOperation() {
        System.out.println("Введите операцию: 1- четное, 2 - нечетное, 3 - делится на 3, 4 - делится на 5");
        char operation;
        if(s.hasNext()){
            operation = s.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            s.next();
            operation = getOperation();
        }
        return operation;
    }

    private static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> randomArray)
    {
        var result = new ArrayList<Integer>();
        for (var element : randomArray)
        {
            if (element%2 == 0)
            {
                result.add(element);
            }
        }
        return result;
    }

    private static ArrayList<Integer> getOddNumbers(ArrayList<Integer> randomArray)
    {
        var result = new ArrayList<Integer>();
        for (var element : randomArray)
        {
            if (element%2 != 0)
            {
                result.add(element);
            }
        }
        return result;
    }

    private static ArrayList<Integer> getMultipleOfThreeNumbers(ArrayList<Integer> randomArray)
    {
        var result = new ArrayList<Integer>();
        for (var element : randomArray)
        {
            if (element%3 == 0)
            {
                result.add(element);
            }
        }
        return result;
    }

    private static ArrayList<Integer> getMultipleOfFiveNumbers(ArrayList<Integer> randomArray)
    {
        var result = new ArrayList<Integer>();
        for (var element : randomArray)
        {
            if (element%5 == 0)
            {
                result.add(element);
            }
        }
        return result;
    }

    private static ArrayList<Integer> calc (char operation, ArrayList<Integer> randomArray)  {
        ArrayList<Integer> result;
        switch (operation){
            case '1':
                result = getEvenNumbers (randomArray);
                break;
            case '2':
                result = getOddNumbers (randomArray);
                break;
            case '3':
                result = getMultipleOfThreeNumbers (randomArray);
                break;
            case '4':
                result = getMultipleOfFiveNumbers (randomArray);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc (getOperation (), randomArray);
        }
        return result;

    }

    private static void DisplayResult (ArrayList<Integer> result){
        System.out.println("Вывод результата:");
        for (var element : result)
        {
            System.out.println(element);
        }
    }

}
