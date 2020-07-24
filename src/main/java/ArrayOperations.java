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
//      For I = 0 to N-1 do:
        for(int i = 0; i < numbers.length; i++) {
//          Smallsub = I
            int smallsub = i;
//          For J = I + 1 to N-1 do:
            for(int j = i + 1; j < numbers.length; j++) {
//              If numbers(J) < numbers(Smallsub)
                if(numbers[j] < numbers[smallsub]) {
//                  Smallsub = J
                    smallsub = j;
                }
//          End-For
            }
//          Temp = numbers(I)
            int temp = numbers[i];
//          numbers(I) = numbers(Smallsub)
            numbers[i] = numbers[smallsub];
//          numbers(Smallsub) = Temp
            numbers[smallsub] = temp;
//      End-For
        }
        // Default Wert gehört geändert
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

        // Default Wert gehört geändert
        return null;
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

        // Default Wert gehört geändert
        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {

        // Default Wert gehört geändert
        return 0.0;
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
