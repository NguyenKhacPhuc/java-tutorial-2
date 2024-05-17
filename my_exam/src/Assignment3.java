public class Assignment3 {
    public static void main(String[] args) {
        String myString = "The quick brown fox jumps over the lazy dog";
        String[] parts = myString.split(" ");
        for(String s : parts){
            System.out.print( s + " ");
        }
    }
}
