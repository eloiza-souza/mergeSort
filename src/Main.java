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

    git add

    public static int[] mergeSort(int[] vector) {

        if (vector.length <= 1) {
            return vector;
        }

         // Divide o vetor ao meio
        int[] left = Arrays.copyOfRange(vector, 0, vector.length/2);
        int[] right = Arrays.copyOfRange(vector, vector.length/2, vector.length);


       return merge(mergeSort(left),mergeSort(right));
    }


    public static int[] merge(int[] left, int[] right){
        int[] vetorMerge = new int[left.length + right.length];
        int i = 0,j = 0, k = 0;

        while ( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                vetorMerge[k] = left[i];
                i++;
            }
            else{
                vetorMerge[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            vetorMerge[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            vetorMerge[k] = right[j];
            j++;
            k++;
        }

        return vetorMerge;
    }

}