public class Assignment3 {
    public static void main(String[] args) {
        String myString = "The quick brown fox jumps over the lazy dog";
        String[] parts = myString.split(" ");
        for (int i = (parts.length - 1); i >= 0; i--) {
            System.out.print(parts[i] + " ");
        }
    }
}
