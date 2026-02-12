package concretestrategies;

import interfaces.CharacterStrategy;

public class Wizard implements CharacterStrategy {
    @Override
    public String attack() {
        return "Wizard casts a spell!\n";
    }

    @Override
    public String defend() {
        return "Wizard:\nCreating a magic barrier for defense!";
    }
}
