import java.util.Arrays;

public class Sort {


    public static long bubbleSort(Integer[] arr) {
        long time1 = System.nanoTime();
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }


            }
        }
        System.out.println("\n сортировал пузырьком массив за время " + (System.nanoTime() - time1));
        return (System.nanoTime() - time1);

    }

    public static long mySort(Integer[] arr) {
        long time1 = System.nanoTime();

        Arrays.sort(arr);
        System.out.println("\n сортировал стандартным методом сорт массив за время " + (System.nanoTime() - time1));
        return (System.nanoTime() - time1);
    }

    public static long sortByChoice(Integer[] arr) {
        long time1 = System.nanoTime();

        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
        System.out.println("\n сортировал выбором массив за время " + (System.nanoTime() - time1));
        return (System.nanoTime() - time1);

    }

    public static long insertSort(Integer[] arr) {
        long time1 = System.nanoTime();

        int in, buf;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            buf = arr[i];
            in = i;
            while (in > 0 && arr[in - 1] >= buf) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = buf;
        }
        System.out.println("\n сортировал вставками массив за время " + (System.nanoTime() - time1));
        return (System.nanoTime() - time1);

    }
}





