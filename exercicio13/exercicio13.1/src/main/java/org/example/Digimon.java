package org.example;

public class Digimon extends Monster {
    public Digimon(String name, String life, String atk) {
        this.name = name;
        this.life = life;
        this.atk = atk;
    }

    @Override
    public void attack() {
        System.out.println("iiiiirrrááá!");
    }
}
