package insertionsort;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Executar no Windows e Linux
 * 
 * 10, 100, 1000, 10000, 100000, 50000, 1000000
 *  
 * Fazer a comparação no mesmo gráfico.
 * 
 * Fazer 6 Gráficos.
 * 
 * Colocar detalhes da máquina.
 * @author ennio
 */
public class InsertionSort {

    public static void insertionSort(int[] vetor, int tamanho) {
        int j;
        int key;
        int i;

        for (j = 1; j < tamanho; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    public static void mostra_vetor(int[] vetor, int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

    }

    public static void main(String[] args) throws IOException {

         //O nome da pasta onde estão os arquivos:
        String folderBaseName = "C:\\Users\\Taffarel\\Documents\\NetBeansProjects\\InsertionSort\\src\\insertionsort\\";

        String nome_arquivo = folderBaseName + "arquivo.txt";
        
        Scanner scanner = new Scanner(new FileReader(nome_arquivo));
        int[] vetor = Converter.converter(scanner.nextLine().split(" "));

        int tamanho = 1000000;
        System.out.println("Antes");
        //mostra_vetor(vetor, tamanho);
        long tempoInicial = System.currentTimeMillis();
        insertionSort(vetor, tamanho);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("\nDepois");
        //mostra_vetor(vetor, tamanho);

        System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");

    }

}
