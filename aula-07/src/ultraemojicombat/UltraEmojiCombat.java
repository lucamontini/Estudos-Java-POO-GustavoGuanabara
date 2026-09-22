package ultraemojicombat;

import java.util.concurrent.ThreadLocalRandom;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[9];

        l[0] = new Lutador("Luca", "Brasil", 24, 1.72f, 72.0f, 11, 2, 1);
        l[1] = new Lutador("Leonardo", "Estados Unidos", 24, 1.88f, 60.0f, 9, 2, 3);
        l[2] = new Lutador("Pedro", "Argentina", 23, 1.93f, 87.0f, 6, 0, 8);
        l[3] = new Lutador("Vitor", "Israel", 25, 1.68f, 79.0f, 4, 7, 3);
        l[4] = new Lutador("Gabriel", "França", 26, 1.70f, 55.5f, 7, 1, 2);
        l[5] = new Lutador("Carlos", "México", 28, 1.75f, 68.0f, 10, 3, 1);
        l[6] = new Lutador("Mateus", "Japão", 29, 1.80f, 82.5f, 12, 4, 0);
        l[7] = new Lutador("Igor", "Rússia", 31, 1.90f, 105.0f, 15, 2, 1);
        l[8] = new Lutador("John", "Austrália", 30, 1.85f, 96.2f, 8, 5, 2);

        int idx1 = ThreadLocalRandom.current().nextInt(l.length);
        int idx2 = ThreadLocalRandom.current().nextInt(l.length);

        while (idx1 == idx2) {
            idx2 = ThreadLocalRandom.current().nextInt(l.length);
        }

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[idx1], l[idx2]);
        System.out.println(" ");
        UEC01.lutar();
    }

}
