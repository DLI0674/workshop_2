package workshop_2;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String word = null;

        Optional<String> checkNull = Optional.ofNullable(word);

        if (checkNull.isPresent()) {
            String s = word.toLowerCase();
            System.out.print(s);
        }
        else
            System.out.println("word is null");
    }
}
