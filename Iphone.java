import java.util.Scanner;

public class Iphone{
    private static boolean ligado = false;
    int numero = 0;


    public boolean ligar(){
        System.out.println("Ligando Iphone");
        ligado = true;
        System.out.println("Telefone está ligado? "+ligado);
        return ligado = true;
    }

    public boolean desligar(){
        System.out.println("Desligando aparelho");
        ligado = false;
        System.out.println("Telefone está ligado? "+ligado);
        return ligado = false;
    }

    public void ligacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Disque o número");
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println("Ligando para " + numero);
    }

    public void reproduzirMusica() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o nome da música: ");
        String musica = scanner2.next();
        scanner2.close();
        System.out.println("Tocando agora: " + musica);
    }

    public void pararMusica(){
    System.out.println("Parando a reprodução da música...");
    }

    public void pesquisar(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite o que quer pesquisar");
        String termoPesquisado = scanner3.next();
        scanner3.close();
        System.out.println("Pesquisando por " + termoPesquisado);
    }
}
