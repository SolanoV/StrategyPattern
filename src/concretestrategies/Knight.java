package concretestrategies;

import interfaces.CharacterType;

public class Knight implements CharacterType {
    @Override
    public String attack() {
        return "Knight attacks with a sword!\n";
    }

    @Override
    public String defend() {
        String output = "Knight:\n";
        output += "Using a shield to defend!\n";
        output += "Dodgin to avoid attack!\n";
        output += "Creating a magic barrier for defense!";
        return output;
    }
}
