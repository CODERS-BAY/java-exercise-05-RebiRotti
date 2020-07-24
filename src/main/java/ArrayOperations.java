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
        /**
             for every entry in numbers i
                 int highest is i
                 for every entry is j = i
                     if numbers[j] > numbers[highest]
                        highest = j
                     endif
                 end for
                 int memory = numbers[i]
                 numbers[i] = numbers[highest]
                 numbers[highest] = memory
             end for
         */
        for (int entry:numbers) {
            System.out.print(entry + " ");
        }
        System.out.println();
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
        for (int entry:numbers) {
            System.out.print(entry + " ");
        }
        System.out.println();
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
        boolean searched = false;
        for(int i = 0; i < numbers.length; i++) {
            // Frage an Lukas: Wieso gibt er das im Test 2x aus? hab als result somit ein True und ein False...??
            // System.out.println("Array: " + numbers[i] + " \ngesuchter Wert: " + value);
            if(numbers[i] == value) {
                searched = true;
            }
        }
        System.out.println("searched value is: " + searched + " " + value);
        return searched;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        // Default Wert gehört geändert
        return sum/numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {

        // Default Wert gehört geändert
        return 0.0;
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {

        // Default Wert gehört geändert
        return 0;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {

        // Default Wert gehört geändert
        return 0;
    }
    
     /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private void someHelper() {
        // ...
    }
}
