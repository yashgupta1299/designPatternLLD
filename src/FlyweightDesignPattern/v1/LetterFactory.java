package FlyweightDesignPattern.v1;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, ILetter> characterCache = new HashMap<>();
    public static ILetter createLetter(Character character){
        if(characterCache.containsKey(character)){
            return characterCache.get(character);
        }
        ILetter iLetter = new DocumentCharacter(character, "Arial", 20);
        characterCache.put(character, iLetter);
        System.out.println("Letter Created:" + character);
        return iLetter;
    }
}
