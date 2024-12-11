import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("А) Числа от 0 до 300, которые делятся на 4, но не делятся на 6 и сумма цифр которых < 10:");
        printFilteredNumbers();

        System.out.println("\n");
        System.out.println("B) Два средних знака строки 'string': " + getMiddleCharacters("string"));
        System.out.println("Два средних знака строки 'code': " + getMiddleCharacters("code"));
        System.out.println("Два средних знака строки 'Practice': " + getMiddleCharacters("Practice"));


        System.out.println("\n C) Слово с минимальным числом различных символов: " + findWordWithMinUniqueChars("fda ab fa aaaaaaaaa 1234 jkjk"));


        System.out.println("\n D) Количество слов, содержащих только символы латинского алфавита: " + countLatinWords("One two three раз два три one1 two2 123"));
    }
}
