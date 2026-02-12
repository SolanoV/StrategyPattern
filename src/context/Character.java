package context;
import interfaces.CharacterType;

public class Character {
    private CharacterType type;

    public Character(CharacterType type) {
        this.type = type;
    }

    public String attack(){
        return type.attack();
    }

    public String defend(){
        return type.defend();
    }
}
