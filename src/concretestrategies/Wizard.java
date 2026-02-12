package concretestrategies;

import interfaces.CharacterType;

public class Wizard implements CharacterType {
    @Override
    public String attack() {
        return "";
    }

    @Override
    public String defend() {
        return "";
    }
}
