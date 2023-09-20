import java.util.Random;
import java.util.Scanner;

public class lotofacil {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int opcao;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            opcao = ler.nextInt(); // Adicione esta linha para ler a opção do usuário
            switch (opcao) {
                case 1:
                    int apostarNum;
                    System.out.print("Digite um número de 0 a 100: ");
                    apostarNum = ler.nextInt();

                    if (apostarNum < 0 || apostarNum > 100) {
                        System.out.println("O número é inválido, digite um número de 0 a 100.");
                    } else {
                        int numSorteado = random.nextInt(101);
                        System.out.println("Número sorteado: " + numSorteado);

                        if (apostarNum == numSorteado) {
                            System.out.println("Seu número foi sorteado! Você ganhou R$ 10.000,00 !");
                        } else {
                            System.out.println("Seu número não foi sorteado. Tente novamente.");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite um intervalo de caracteres (de A a Z): ");
                    char inicio = 'A';
                    char fim = 'Z';
                    char caractereUsuario = ler.next().toUpperCase().charAt(0); // Corrigido para ler o caractere do usuário

                    if (caractereUsuario >= inicio && caractereUsuario <= fim) {
                        char caractereAleatorio = (char) (inicio + random.nextInt(fim - inicio + 1));
                        System.out.println("Caractere gerado aleatoriamente: " + caractereAleatorio);

                        if (caractereUsuario == caractereAleatorio) {
                            System.out.println("Parabéns! Você ganhou um prêmio!");
                        } else {
                            System.out.println("Desculpe, você não ganhou desta vez. Tente novamente.");
                        }
                    } else {
                        System.out.println("Intervalo de caracteres inválido. Por favor, insira um intervalo válido (de A a Z).");
                    }
                    break;
                case 3:
                    System.out.print("Escolha entre 'Par' ou 'Ímpar': ");
                    String escolhaUsuario = ler.next().toLowerCase();

                    if (escolhaUsuario.equals("par") || escolhaUsuario.equals("ímpar")) {
                        int numeroSorteado = random.nextInt(101); // Gera um número aleatório de 0 a 100

                        System.out.println("Número sorteado: " + numeroSorteado);

                        if ((numeroSorteado + 1) % 2 == 0 && escolhaUsuario.equals("par") ||
                                (numeroSorteado + 1) % 2 != 0 && escolhaUsuario.equals("ímpar")) {
                            System.out.println("Parabéns! Você ganhou um prêmio!");
                        } else {
                            System.out.println("Desculpe, você não ganhou desta vez. Tente novamente.");
                        }
                    } else {
                        System.out.println("Escolha inválida. Por favor, escolha entre 'Par' ou 'Ímpar'.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        ler.close();
    }
}
