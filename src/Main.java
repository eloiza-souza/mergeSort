import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numerosAleatorios = {5, 8, 4, 1, 6, 9, 7, 4, 2, 3};

        System.out.print("Números aleatórios: ");
        for(int numero:numerosAleatorios){
            System.out.print(numero + " ");
        }
        System.out.println(" ");

        int[] numerosOrdenados = mergeSort(numerosAleatorios);
        System.out.print("Números ordenados: ");
        for(int numero:numerosOrdenados){
            System.out.print(numero + " ");
        }
        System.out.println(" ");
    }


    public static int[] mergeSort(int[] vector) {
        if (vector.length <= 1) {
            return vector;
        }
        int[] vector1 = Arrays.copyOfRange(vector, 0, vector.length/2);

        System.out.print("Vetor1: ");
                for(int numero:vector1){
            System.out.print(numero + " ");
        }
        System.out.println(" ");


        int[] vector2 = Arrays.copyOfRange(vector, vector.length/2, vector.length);

        System.out.print("Vetor2: ");
        for(int numero:vector2){
            System.out.print(numero + " ");
        }

        System.out.println(" ");


       return merge(mergeSort(vector1),mergeSort(vector2));
    }

    public static int[] merge(int[] vetor1, int[] vetor2){
        int[] vetorMerge = new int[vetor1.length + vetor2.length];
        int i = 0,j = 0, k = 0;

        while ( i < vetor1.length && j < vetor2.length){
            if(vetor1[i] <= vetor2[j]){
                vetorMerge[k] = vetor1[i];
                i++;
            }
            else{
                vetorMerge[k] = vetor2[j];
                j++;
            }
            k++;
        }

        while (i < vetor1.length) {
            vetorMerge[k] = vetor1[i];
            i++;
            k++;
        }

        while (j < vetor2.length) {
            vetorMerge[k] = vetor2[j];
            j++;
            k++;
        }

        return vetorMerge;
    }

}