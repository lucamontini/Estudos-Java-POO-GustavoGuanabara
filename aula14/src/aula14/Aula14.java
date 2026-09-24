package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 01 de POO");
        video[1] = new Video("Aula 12 de PHP");
        video[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Luca", 24, "M", "lucam");
        g[1] = new Gafanhoto("Ana", 23, "F", "anaf");
        g[2] = new Gafanhoto("Carlos", 30, "M", "carlitox");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], video[2]);
        vis[1] = new Visualizacao(g[0], video[1]);
        vis[2] = new Visualizacao(g[1], video[0]);
        vis[0].avaliar();
        vis[1].avaliar(35.0f);

        System.out.println("========== VÍDEOS ==========");
        for (Video v : video) {
            System.out.println(v.toString());
        }

        System.out.println("\n======== GAFANHOTOS ========");
        for (Gafanhoto gafanhoto : g) {
            System.out.println(gafanhoto.toString());
        }

        System.out.println("\n====== VISUALIZAÇÕES =======");
        for (Visualizacao visualizacao : vis) {
            System.out.println(visualizacao.toString());
        }
    }
}
