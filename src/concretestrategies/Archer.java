package concretestrategies;

import interfaces.CharacterStrategy;

public class Archer implements CharacterStrategy {
    @Override
    public String attack() {
        return "Archer shoots an arrow!\n";
    }

    @Override
    public String defend() {
        return "Archer:\nUsing a shield to defend!";
    }
}
