package concretestrategies;

import interfaces.CharacterType;

public class Wizard implements CharacterType {
    @Override
    public String attack() {
        return "Wizard casts a spell!\n";
    }

    @Override
    public String defend() {
        return "Wizard:\nCreating a magic barrier for defense!";
    }
}
