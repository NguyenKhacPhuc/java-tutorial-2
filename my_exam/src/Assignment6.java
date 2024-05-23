public class Assignment6 {
    public static void main(String[] args) {
        lengthOfLastWord("   Hello     World    !");
    }

    public static void lengthOfLastWord(String s){
        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
        s = s.replaceAll("\\s+", " ");

        String[] words = s.split(" ");

        String lastWord = words[words.length -1];
        System.out.println(lastWord + " " + lastWord.length());
    }
}
