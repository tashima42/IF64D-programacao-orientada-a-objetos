package org.example;

enum Movimento {
    ANDAR,
    VOAR,
    NADAR,
    TELETRANSPORTAR
}

public class Heroi {
    private String nome;
    private String poder;
    private static int instancias = 0;

    public Heroi(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
        this.instancias++;
    }

    public void mover(Movimento movimento) {
        switch (movimento) {
            case ANDAR -> System.out.println("Andando...");
            case VOAR -> System.out.println("Voando...");
            case NADAR -> System.out.println("Nadando...");
            case TELETRANSPORTAR -> System.out.println("Teletransportando...");
        }
    }

    public static int getInstancias() {
        return instancias;
    }
}
