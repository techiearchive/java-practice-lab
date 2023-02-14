package techiearchive.lab;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("prahlad")); // true
        System.out.println(stringContainsVowels("tv")); // false
    }
    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
