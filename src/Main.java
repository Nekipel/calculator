public class Main {
    public static void main(String[] args) {
        calc("4 / 2");
    }
    public static String calc(String input) {
        String[] example = input.split(" ");
        Integer result;
        Integer firstValue = Integer.valueOf(example[0]);
        Integer secondValue = Integer.valueOf(example[2]);
        switch (example[1]) {
            case "+":
                result = firstValue + secondValue;
                System.out.println(result);
                result.toString();
                break;
            case "-":
                result = firstValue - secondValue;
                System.out.println(result);
                result.toString();
                break;
            case "/":
                result = firstValue / secondValue;
                System.out.println(result);
                result.toString();
                break;
            case "*":
                result = firstValue * secondValue;
                System.out.println(result);
                result.toString();
                break;
        }

        String output = "";
        return output;
    }
}