package GETTERS_SETTERS;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criando um array de salas
        salasDeCinema[] salas = new salasDeCinema[4];
        salas[0] = new salasDeCinema(1, 500, 11, "Sala IMAX");
        salas[1] = new salasDeCinema(2, 800, 12, "Sala IPOBRE");
        salas[2] = new salasDeCinema(3, 100, 13, "Sala IRICO");
        salas[3] = new salasDeCinema(4, 300, 14, "Sala IPRIV");

        // Instanciando a classe Arquivo com o caminho do arquivo
        Arquivo arquivo = new Arquivo("C:\\Users\\Gamer-PC\\Desktop\\cinema.txt");

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Escolha a opção que deseja executar:");
            System.out.println("Opção 1 | Criar e Salvar Dados do Arquivo");
            System.out.println("Opção 2 | Alterar Dados do Arquivo");
            System.out.println("Opção 3 | Deletar Arquivo");

            int numero = scan.nextInt();
            scan.nextLine();


            try {
                switch (numero) {
                    case 1:
                        arquivo.criarArquivo();
                        arquivo.salvarDados(salas);
                        System.out.println("Dados inseridos no arquivo.");
                        break;
                    case 2:
                        alterarDados(salas, scan);
                        arquivo.salvarDados(salas);
                        System.out.println("Dados alterados no arquivo.");
                        break;
                    case 3:
                        arquivo.deletarArquivo();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                System.out.println("deseja consinuar? S/N");
                continuar = scan.nextLine();
            } catch (IOException e) {
                System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
            }
        }
        scan.close();
    }
    private static void alterarDados(salasDeCinema[] salas, Scanner scan) {
        System.out.println("Opção 2 | Alterando Dados");
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Alterando dados da sala " + salas[i].getNome());
            System.out.print("Insira novo ID da sala: ");
            salas[i].setId(scan.nextInt());
            scan.nextLine();

            System.out.print("Insira novo nome da sala: ");
            salas[i].setNome(scan.nextLine());

            System.out.print("Insira novo ID do cinema: ");
            salas[i].setIdCinema(scan.nextInt());
            scan.nextLine();

            System.out.print("Insira nova capacidade da sala: ");
            salas[i].setCapacidade(scan.nextInt());
            scan.nextLine();
        }
    }
}
