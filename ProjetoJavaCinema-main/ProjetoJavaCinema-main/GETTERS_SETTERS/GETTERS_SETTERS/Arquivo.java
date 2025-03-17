package GETTERS_SETTERS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Arquivo {
    private File arq;

    public Arquivo(String caminho) {
        this.arq = new File(caminho);
    }

    public void criarArquivo() throws IOException {
        if (!arq.exists()) {
            arq.createNewFile();
        }
    }

    public void salvarDados(salasDeCinema[] salas) throws IOException {
        try (BufferedWriter buff = new BufferedWriter(new FileWriter(arq))) {
            for (salasDeCinema sala : salas) {
                buff.write(sala.exibirSalas());
                buff.newLine();
            }
        }
    }

    public void deletarArquivo() {
        if (arq.exists()) {
            arq.delete();
            System.out.println("Arquivo deletado com sucesso.");
        } else {
            System.out.println("O arquivo não existe.");
        }
    }
}
