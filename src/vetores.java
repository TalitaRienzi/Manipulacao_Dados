import java.lang.reflect.Array;
import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {

        //Na primeira opção definimos o tamanho do arrays que é um vetor de
        //5 campos para ser preenchido, porém um array sempre inicia do 0.

        //Na segunda opção simplificamos o codigo e não definimos o tamanho que queremos da lista
        //podendo assim ir acrescentando itens


        String[] frutas = new String[5];
        frutas [0] = "Abacaxi";
        frutas [1] = "Banana";
        frutas [2] = "Carambola";
        frutas [3] = "Damasco";
        frutas [4] = "Embu";
        for (int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
            System.out.println();

        }

        String[] letras = {"A", "B", "C", "D", "J", "U"};
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
            System.out.println();
        }

        // aqui faremos uma impressão na tela diferente, ao invés de imprimir um abaixo
        //do outro, iremos imprimir um ao lado do outro
        System.out.println(Arrays.toString(letras));
        System.out.println();


        //aqui faremos comparação de número maior e menor da lista
        int [] numeros = {9, 10, 12, 67, 4};
        int maior = numeros [0];
        int menor = numeros [0];
        int media = 0;

        for (int i=0; i < numeros.length;i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }

            media += numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/ numeros.length);


    }
}
