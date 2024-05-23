public class Main {
    public static void main(String[] args) {
        String input = "   This is !@#$% a  string ^&*() with #$%^& special characters and extra spaces.   ";

        // Loại bỏ khoảng trắng thừa ở đầu và cuối
        input = input.trim();

        // Loại bỏ các ký tự đặc biệt
        input = input.replaceAll("[^a-zA-Z0-9\\s]", "");

        // Loại bỏ khoảng trắng thừa giữa các từ
        input = input.replaceAll("\\s+", " ");

        System.out.println(input);
    }
}
