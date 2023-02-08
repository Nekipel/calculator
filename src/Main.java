import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static boolean isRomanNumber = false;
    public static String[] arrRomanNumber = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public static String[] arrRomanNumberTen = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
    public static String[] arrArabicNumber = {"0","1","2","3","4","5","6","7","8","9","10"};
    public static String expression; // Создал переменную для уравнения
    public static void main(String[] args) {
        getExpression();
        checkExpression(expression);
    }
    public static void checkExpression (String arg) {
        String[] example = arg.split(" ");
        if (example.length != 3) {
            System.out.println("throws Exception");
            return;
        }
        String value1 = example[0];
        String value2 = example[2];
        String value3 = example[1];
        if ((Arrays.asList(arrRomanNumber).contains(value1)) & (Arrays.asList(arrRomanNumber).contains(value2))){
            isRomanNumber = true;
            String number1 = String.valueOf(Arrays.binarySearch(arrRomanNumber, value1));
            String number2 = String.valueOf(Arrays.binarySearch(arrRomanNumber, value2));
            int valueNumber1 = Integer.parseInt(number1) + 1;
            int valueNumber2 = Integer.parseInt(number2) + 1;
            example[0] = String.valueOf(valueNumber1);
            example[2] = String.valueOf(valueNumber2);
            if((Integer.parseInt(number1)) < (Integer.parseInt(number2)) & (Objects.equals(value3, "-"))) {
                System.out.println("throws Exception");
                return;
            }
            arg = String.join(" ", example);
            calc(arg);
            return;
        }
        if ((Arrays.asList(arrArabicNumber).contains(value1)) & (Arrays.asList(arrArabicNumber).contains(value2))) {
            arg = String.join(" ", example);
            calc(arg);
            return;
        }
        System.out.println("throws Exception");
    } // функция валидации выражения
    public static void getExpression () {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a expression: ");
        expression = in.nextLine();
    } //Функция ввода уравнения в консоль
    public static String calc(String input) {

        String[] example = input.split(" ");
        Integer result;
        Integer firstValue = Integer.valueOf(example[0]);
        Integer secondValue = Integer.valueOf(example[2]);
        switch (example[1]) {
            case "+" -> {
                result = firstValue + secondValue;
                if(isRomanNumber) {
                    translateToRomanFromArabic(result);
                } else {
                    System.out.println(result);
                }
                return result.toString();
            }
            case "-" -> {
                result = firstValue - secondValue;
                if(isRomanNumber) {
                    translateToRomanFromArabic(result);
                } else {
                    System.out.println(result);
                }
                return result.toString();
            }
            case "/" -> {
                result = firstValue / secondValue;
                if(isRomanNumber) {
                    translateToRomanFromArabic(result);
                } else {
                    System.out.println(result);
                }
                return result.toString();
            }
            case "*" -> {
                result = firstValue * secondValue;
                if(isRomanNumber) {
                    translateToRomanFromArabic(result);
                } else {
                    System.out.println(result);
                }
                return result.toString();
            }
            default -> {
                System.out.println("throws Exception");
            }
        }

        return "";
    } // Функция калькулирования арабский цифр
    public static String translateToRomanFromArabic (Integer input) {
        String Answer = input.toString();

        if(Answer.length() == 3){
            System.out.println(arrRomanNumberTen[10]);
            return arrRomanNumberTen[10];
        }
        if(Answer.length() == 1) {
            System.out.println(arrRomanNumber[Integer.parseInt(Answer) - 1]);
            return arrRomanNumber[Integer.parseInt(Answer) - 1];
        }
        String[] example = new String[Answer.length()];
        for (int i = 0; i < Answer.length(); i++ ) {
            example[i] = String.valueOf(Answer.charAt(i));
        }
        if(input % 10 == 0){
            Answer = arrRomanNumberTen[Integer.parseInt(example[0])];
        } else {
            Answer = arrRomanNumberTen[Integer.parseInt(example[0])] + arrRomanNumber[Integer.parseInt(example[1]) - 1];
        }
        System.out.println(Answer);
        return Answer;
    } // функция возврата римского числа
}