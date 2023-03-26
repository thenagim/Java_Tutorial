import java.util.Random;

public class FindMinMaxArray {
    public static void main(String[] args) {
       int [] arr = new int [10];
        int min = 101;
        int max = 0;

       Random random = new Random();
       for (int i =0; i<arr.length; i++) {
           arr[i]= random.nextInt(100) + 1;
           System.out.print(arr[i] + " ");
           if(arr[i]<min) {
               min = arr[i];
           }
           if(arr[i]>max) {
               max = arr[i];
           }
       }
        System.out.println();
        System.out.println("Min value is: "+ min);
        System.out.println("Min value is: "+ max);

    }
}
