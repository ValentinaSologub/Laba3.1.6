public class Main {
    public static void main(String[] args) {
        int A = 2;
        int B = 5;

        int[] array = {3, 2, 1, 4, 5, 8, 6};

        int countInRange = countElementsInRange(array, A, B);
        System.out.println("Кількість елементів у діапазоні від " + A + " до " + B + ": " + countInRange);

        int sumAfterMax = getSumAfterMax(array);
        System.out.println("Сума елементів після максимального: " + sumAfterMax);

        sortDescendingByAbsoluteValue(array);
        System.out.print("Відсортований масив за спаданням модулів: ");
        printArray(array);
    }

    public static int countElementsInRange(int[] arr, int A, int B) {
        int count = 0;
        for (int num : arr) {
            if (num >= A && num <= B) {
                count++;
            }
        }
        return count;
    }

    public static int getSumAfterMax(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int sum = 0;
        for (int i = maxIndex + 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void sortDescendingByAbsoluteValue(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}