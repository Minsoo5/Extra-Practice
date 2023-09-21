package WhiteBoard;

import java.util.Arrays;

public class ArrayManipulation {

    // Given an array of int
    //Pass in int index and int value
    //add the value into the index position
    //and return an array

    //123456 index 3 value 9
    //result = 1239456
    //12394

    public int[] addValue(int[] baseArray, int index, int value) {
        // set up new array
        int[] resultArray = new int[baseArray.length + 1];

        for (int i = 0; i < resultArray.length; i++) {
            if (i < index) {
                resultArray[i] = baseArray[i];
            } else if (i == index) {
                resultArray[i] = value;
            } else if (i > index) {
                resultArray[i] = baseArray[i -1];
            }
        }
        return resultArray;
    }


    public int[] addValueForLoops(int[] baseArray, int index, int value) {
        // set up new array
        int[] resultArray = new int[baseArray.length + 1];
        resultArray[index] = value;

        for (int i = 0; i < index; i++) {
            resultArray[i] = baseArray[i];
        }
        for (int i = index + 1; i < resultArray.length; i++) {
            resultArray[i] = baseArray[i-1];
        }

        return resultArray;
    }

    public int[] addValueWhile(int[] baseArray, int index, int value) {
        // set up new array
        int[] resultArray = new int[baseArray.length + 1];
        resultArray[index] = value;

        for (int i = 0; i < resultArray.length; i++) {

            while(i < index) {
                resultArray[i] = baseArray[i];
                break;
            }

            while(i > index) {
                resultArray[i] = baseArray[i - 1];
                break;
            }
        }
        return resultArray;

    }

    public int[] addValueStream(int[] baseArray, int index, int value) {
        // set up new array
        int[] resultArray = new int[baseArray.length + 1];


        return resultArray;
    }


    public static double[] wtf(double[] og) {

        double[] retArray = Arrays.copyOf(og, og.length);
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = Math.pow(retArray[i], 3);
        }
        for (int Joe = 0; Joe < retArray.length; Joe++) {
            retArray[Joe] = retArray[Joe] - (og[Joe] / 3);
        }
        return retArray;
    }


    public static boolean onlyContainsOdd(int[] input) {

        boolean contains = Arrays.stream(Arrays.stream(input).toArray())
                .allMatch(e -> e % 2 == 1);
        return contains;
    }

    public static int[] sortOrderDesc(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

//    public static int[] crissCrossMerge(int[] a, int[] b) {
//        //a {1, 3, 5, 7, 9}
//        //b {2, 4, 6}
//        //c {1, 2, 3, 4, 5, 6, 7, }
//        int[] resultArray = new int[a.length + b.length];
//
//        for (int i = 0; i < resultArray.length; i++) {
//            if (i < a.length && i < b.length) {
//                resultArray[i + i] = a[i];
//                resultArray[i + i + 1] = b[i];
//            } if (i >= a.length) {
//
//            } else if (i >= b.length) {
//                while (i < a.length) {
//                    resultArray[i + i] = a[i];
//                    resultArray[i + i + 1] = a[i + 1];
//                }
//            }
//
//        }
//        return resultArray;
//    }

    public static int[] joesBubbleSort(int[] input) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < input.length -1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return input;
    }

    public static void replaceAllWith0(int[] input) {
        Arrays.stream(input).forEach(i -> i = 0);
    }

    public static Integer[] twoSumLeetCode(Integer[] nums, Integer target) {
        Integer[] ans = new Integer[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target ) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }





}