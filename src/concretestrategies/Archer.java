package concretestrategies;

import interfaces.CharacterType;

public class Archer implements CharacterType {
    @Override
    public String attack() {
        return "Archer shoots an arrow!\n";
    }

    @Override
    public String defend() {
        return "Archer:\nUsing a shield to defend!";
    }
}
