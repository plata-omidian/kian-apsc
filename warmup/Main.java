package warmup;

public class Main {

    public static void main(String[] args) {
        // Your code here.
        int j=0;
        int sum=0;
        while (j<1000){
            if(j%3==0||j%5==0){
                sum+=j;
            }
            j++;
        }
        System.out.println(sum);
    }
}
//hi