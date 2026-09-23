package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 01 de POO");
        video[1] = new Video("Aula 02 de POO");
        video[2] = new Video("Aula 14 de POO");

        System.out.println(video[0].toString());
    }
}
