package Day2;

public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

