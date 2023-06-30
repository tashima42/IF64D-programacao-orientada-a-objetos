package org.example;

public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Batman", "Dinheiro");
        Heroi heroi2 = new Heroi("Superman", "Super força");
        Heroi heroi3 = new Heroi("Mulher Maravilha", "Super força");
        Heroi heroi4 = new Heroi("Flash", "Super velocidade");
        Heroi heroi5 = new Heroi("Aquaman", "Super força");
        Heroi heroi6 = new Heroi("Ciborgue", "Super força");
        Heroi heroi7 = new Heroi("Lanterna Verde", "Super força");
        Heroi heroi8 = new Heroi("Shazam", "Super força");
        Heroi heroi9 = new Heroi("Arqueiro Verde", "Super força");
        Heroi heroi10 = new Heroi("Capitão América", "Super força");
        Heroi heroi11 = new Heroi("Homem de Ferro", "Super força");
        Heroi heroi12 = new Heroi("Thor", "Super força");
        Heroi heroi13 = new Heroi("Hulk", "Super força");

        heroi1.mover(Movimento.ANDAR);
        heroi2.mover(Movimento.VOAR);
        heroi3.mover(Movimento.NADAR);
        heroi4.mover(Movimento.TELETRANSPORTAR);
        heroi5.mover(Movimento.ANDAR);
        heroi6.mover(Movimento.VOAR);
        heroi7.mover(Movimento.NADAR);
        heroi8.mover(Movimento.TELETRANSPORTAR);
        heroi9.mover(Movimento.ANDAR);
        heroi10.mover(Movimento.VOAR);
        heroi11.mover(Movimento.NADAR);
        heroi12.mover(Movimento.TELETRANSPORTAR);
        heroi13.mover(Movimento.ANDAR);

        System.out.println("Instâncias: " + Heroi.getInstancias());
   }
}