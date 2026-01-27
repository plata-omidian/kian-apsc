package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        int[] temp;
        int j=1;
        System.out.println("Insertion Sort!!!");
        for(int i=0;i<input.length;i++){
            if(input[i]>input[i+j]){
                j++;

            }
        }
    }
}
