package hu.nive.ujratervezes.lettermultiplier;


import java.util.ArrayList;
import java.util.List;

public class LetterMultiplier {
    public String multiply(String input, int number) {
        if (input == null || input.equals("")) {
            throw new IllegalArgumentException("no word is given!");
        }
        if (number < 0) {
            throw new IllegalArgumentException("Invaid number!");
        }
        String result = "";
        List<String> newWord = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            String letter = input.substring(i, i + 1);
            newWord.add(letter);

            result = letter.repeat(number);
        }
        return result;
    }

}


