import java.util.Random;

public class InsertionSortTest {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] generateRandomArray(int size, int range) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(range);
        }
        return arr;
    }

    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i; 
        }
        return arr;
    }

    public static long measureInsertionSortTime(int[] arr) {
        long start = System.nanoTime();
        insertionSort(arr);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        int[] sizes = {10, 100, 500, 1000, 2000, 5000};

        System.out.printf("%-10s %-20s %-20s\n", "N", "Ordenado(ns)", "Desordenado(ns)");
        for (int n : sizes) {
            int[] sortedArray = generateSortedArray(n);
            int[] randomArray = generateRandomArray(n, 100000);

            long timeSorted = measureInsertionSortTime(sortedArray);

            long timeRandom = measureInsertionSortTime(randomArray);

            System.out.printf("%-10d %-20d %-20d\n", n, timeSorted, timeRandom);
        }
    }
}

// Pergunta 4 -Qual e a complexidade de pior caso do Insertion sort (em termos de big-O e θ)?

// Resposta: Tempo linear 𝑂(𝑛)

// Pergunta 5 -Qual e a complexidade do melhor caso do Insertion sort (em termos de big-O, θ e Ω)?

// Resposta: Tempo quadrático (O(n²))