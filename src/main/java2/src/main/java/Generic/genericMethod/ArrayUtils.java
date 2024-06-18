package Generic.genericMethod;

public class ArrayUtils {
    public static <T> void max(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
}
