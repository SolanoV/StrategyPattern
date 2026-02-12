package context;
import interfaces.CharacterStrategy;

public class Character {
    private CharacterStrategy type;

    public Character(CharacterStrategy type) {
        this.type = type;
    }

    public String attack(){
        return type.attack();
    }

    public String defend(){
        return type.defend();
    }
}
