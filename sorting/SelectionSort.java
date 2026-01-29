package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
       for(int i=0;i<input.length;i++){
        int small=i;
        for(int j=i+1;j<input.length;j++){
            if(input[j]<input[small]){
                small=j;
            }
        }
        int temp=input[i];
        input[i]=input[small];
        input[small]=temp;
       }
    }
}
