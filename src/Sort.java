import java.util.ArrayList;
public class Sort {
    public static void sort(int[] numbers) {
        for(int i = 0; i < numbers.length-1; i++){
            int min = i;
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[min]>numbers[j]){
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    }
    // PART A.  Which Sort is Which?
    public static void selectionSort(int[] elements) {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                count++;
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(count);
    }

    public static void insertionSort(int[] elements) {
        int count = 0;
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            elements[possibleIndex] = temp;

        }
        System.out.println(count);
    }

    // PART B.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int j = 1; j < words.size(); j++) {
            String temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            elements[possibleIndex] = temp;

        }
        System.out.println(count);
    }

    public static void insertionSortWordList(ArrayList<String> words) {
        // insertionSort(words);
    }
}
