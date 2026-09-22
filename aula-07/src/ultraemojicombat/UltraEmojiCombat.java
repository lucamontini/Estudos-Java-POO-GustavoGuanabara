package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Luca", "Brasil", 24, 1.72f, 72, 11, 2, 1);
        l[1] = new Lutador("Leonardo", "Estados Unidos", 24, 1.88f, 60, 9, 2, 3);
        l[2] = new Lutador("Pedro", "Argentina", 23, 1.93f, 87, 6, 0, 8);
        l[3] = new Lutador("Vitor", "Israel", 25, 1.68f, 79, 4, 7, 3);

        for (int i = 0; i < 4; i++) {
            l[i].apresentar();
            l[i].status();
            System.out.println("   ");
        }

    }

}
