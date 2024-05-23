import java.util.Arrays;
import java.util.List;

import static java.util.Collections.replaceAll;

public class Assignment3 {
    public static void main(String[] args) {
        String myString = "   The   quick brown fox jumps over the lazy dog";
        String[] parts = myString.split(" ");
        for (int i = (parts.length - 1); i >= 0; i--) {
            System.out.print(parts[i] + " ");
        }

        List<String> list = Arrays.asList(parts);
        String result = String.join(" ", list);

        System.out.println();
        result = result.trim();
        result = result.replaceAll("[^a-zA-Z0-9\\s]", "");
        result = result.replaceAll("\\s+", " ");
        System.out.println(result);

    }
}
