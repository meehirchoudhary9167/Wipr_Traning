package Day2;

public class CompareStrings {
    public static void main(String[] args) {
        // String is immutable
        String str = "Java";
        str.concat(" World");  // This doesn't change the original string
        System.out.println("String (immutable): " + str);  // Output: Java

        // StringBuffer is mutable and thread-safe
        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" World");  // Modifies the original object
        System.out.println("StringBuffer (mutable): " + sb1);  // Output: Java World

        // StringBuilder is mutable and not thread-safe
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" World");  // Modifies the original object
        System.out.println("StringBuilder (mutable): " + sb2);  // Output: Java World
    }
}
