/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */
    public void print() {
        for (int entry : numbers) {
            System.out.println(entry);
        }
    }

    /**
     * @return the sorted numbers array.
     */
    public int[] sort() {
        for(int i = 0; i < numbers.length; i++) {
            int smallest = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[smallest]) {
                    smallest = j;
                }
            }
            int memory = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = memory;
        }
        return numbers;
    }

    /**
     * Choose some sorting algorithm you like.
     * Some examples with pseudo code can be found here:
     *
     * @return the sorted array in reverted order
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] revertSort() {
//        for (int entry:numbers) {
//            System.out.print(entry + " ");
//        }
//        System.out.println();
        for(int i = 0; i < numbers.length; i++) {
            int highest = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] > numbers[highest]) {
                    highest = j;
                }
            }
            int memory = numbers[i];
            numbers[i] = numbers[highest];
            numbers[highest] = memory;
        }
        // Default Wert gehört geändert
//        for (int entry:numbers) {
//            System.out.print(entry + " ");
//        }
//        System.out.println();
        return numbers;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {

        // Default Wert gehört geändert
        return null;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum = (sum + numbers[i])/numbers.length;
        }
        // Default Wert gehört geändert
        return sum;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        double trimmedMeanInt = 0;
        int[] helper = sort();
        int memory = helper.length - 1;
        helper[0] = 0;
        helper[memory] = 0;
        for(int i = 0; i < helper.length; i++) {
            trimmedMeanInt = trimmedMeanInt + helper[i];
            System.out.println(helper[i]);
        }
        trimmedMeanInt = (trimmedMeanInt) / (helper.length-2);
        // Default Wert gehört geändert
        return trimmedMeanInt;
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        int maxInt = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(maxInt < numbers[i]) {
                maxInt = numbers[i];
            }
        }

        return maxInt;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        int minInt = 1000000;

        for(int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i] + " " + minInt);
            if(minInt > numbers[i]) {
                minInt = numbers[i];
            }
        }

        return minInt;
    }
    
     /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private void someHelper() {
        // ...
    }
}
