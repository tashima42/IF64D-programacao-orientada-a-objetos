package org.example;

public class Pokemon extends Monster {
    public Pokemon(String name, String life, String atk) {
        this.name = name;
        this.life = life;
        this.atk = atk;
    }

    @Override
    public void attack() {
        System.out.println("Vai, pokemon!");
    }
}
