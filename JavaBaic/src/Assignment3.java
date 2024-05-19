public class Assignment3 {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        String[] a;
        a = inputString.split(" ");

        for (int i = (a.length -1 ); i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
