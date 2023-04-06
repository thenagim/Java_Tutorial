import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

      //  int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Before: ");
        System.out.println(Arrays.toString(arr));
        /*************Task 1.A ********************/
 /*           for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int greater = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = greater;

                }

            }
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));

        }
} */
        /***********Task 1.B *************************/

/*         for (int i = 0; i < arr.length-1; i++) {
            counter++;
            for (int j = 0; j < arr.length - i; j++) {
                counter++;
                if (arr[j] > arr[j + 1]) {
                    counter++;
                    int greater = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = greater;

                }

            }

        }
        System.out.println("After: " + Arrays.toString(arr));
        System.out.println("Number of actions: " + counter);
    }
} */
        /***********Task 1.C *************************/

/*        for (int i = 1; i < arr.length; i++) {
            counter++;
            for (int j = 0; j < arr.length - i; j++) {
                counter++;
                if (arr[j] > arr[j + 1]) {
                    counter++;
                    int greater = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = greater;

                }

            }

        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Value of the counter: "+ counter);
    }
} */
        /***********Task 1.D ver.2 *************************/
        boolean toSort;

        for (int i = 1; i < arr.length; i++) {
            counter++;
            toSort = false;
            for (int j = 0; j < arr.length - i; j++) {
                counter++;
                if (arr[j] > arr[j + 1]) {
                    counter++;
                    int greater = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = greater;

                    toSort = true;
                }
            }
            if (!toSort) break;
        }

        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of actions: " + counter);
    }
}






