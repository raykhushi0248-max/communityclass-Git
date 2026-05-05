public class practice {
    public static void main(String[] args) {
        String text = "To  My  Friend ";
        text = text.replace( " ",  "_");
        System.out.println(text);
        // problem 2
        String letter = "hello dear <|name|>, how are you ";
        letter = letter.replace( "<|name|>" ,  "khushi");
        System.out.println(letter);
    }
}
