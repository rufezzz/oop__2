public class Main {
    public static void main(String[] args) {

        System.out.println("А) Числа от 0 до 300, которые делятся на 4, но не делятся на 6 и сумма цифр которых < 10:");
        printFilteredNumbers();

        System.out.println("\n");
        System.out.println("B) Два средних знака строки 'string': " + getMiddleCharacters("string"));
        System.out.println("Два средних знака строки 'code': " + getMiddleCharacters("code"));
        System.out.println("Два средних знака строки 'Practice': " + getMiddleCharacters("Practice"));


        System.out.println("\nC) Слово с минимальным числом различных символов: " + findWordWithMinUniqueChars("fda ab fa aaaaaaaaa 1234 jkjk"));


        System.out.println("\n D) Количество слов, содержащих только символы латинского алфавита: " + countLatinWords("One two three раз два три one1 two2 123"));
    }


    public static void printFilteredNumbers() {
        for (int i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0 && sumOfDigits(i) < 10) {
                System.out.print(i + " ");
            }
        }
    }


    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public static String getMiddleCharacters(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Длина строки должна быть четной.");
        }
        int midIndex = length / 2;
        return str.substring(midIndex - 1, midIndex + 1);
    }


    public static String findWordWithMinUniqueChars(String str) {
        String[] words = str.split(" ");
        String minWord = "";
        int minUniqueCount = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueCount = (int) word.chars().distinct().count();
            if (uniqueCount < minUniqueCount) {
                minUniqueCount = uniqueCount;
                minWord = word;
            }
        }
        return minWord;
    }

    public static int countLatinWords(String str) {
        String[] words = str.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                count++;
            }
        }
        return count;
    }
}
