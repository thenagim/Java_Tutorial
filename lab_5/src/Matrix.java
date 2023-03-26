public class Matrix {
    public static void main(String[] args) {
       int [][] arr = new int [10][10];
       int sum = 0;

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j< arr[i].length; j++) {
               if (i==j) {
                   arr[i][j] =i;
                   sum +=i;
               }
           }
       }
        for (int[] x : arr)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Sum is: " + sum );

    }
}
