package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] abc = new int[length];
        for (int i = 0; i < length; i++) {
            abc[i] = i + 1;
        }
        return abc;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result = i;
            } else {
                result = -1;
            }
        }
        return result;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] resultArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[resultArr.length - 1 - i] = arr[i];
        }
        return resultArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        //evalute size of new array to store postitive values
        int newArraySize = 0;
        for (int a : arr) {
            if (a > 0) {
                newArraySize++;
            }
        }

        //get positive value and write to new array
        int[] newArray = new int[newArraySize];
        int j = 0;
        for (int a : arr) {
            if (a > 0) {
                newArray[j] = a;
                j++;
            }
        }
        return newArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        //sort each inner array asc
        for (int i = 0; i < arr.length; i++) {
            for (int l = 0; l < arr[i].length - 1; l++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        int tempInt = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = tempInt;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int[] tempArray1;
                if (arr[j].length > arr[j + 1].length) {
                    tempArray1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempArray1;
                }
            }
        }
        return arr;
    }
}
