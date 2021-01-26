package algorithms;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int element = 3;
        int index = linearSearch(arr, element);
        System.out.println("arr = " + Arrays.toString(arr) + ", element = " + element + ", index = " + index);
        int indexBinary = binarySearch(arr, 0, arr.length - 1, element);
        System.out.println("arr = " + Arrays.toString(arr) + ", element = " + element + ", index = " + indexBinary);
        int indexJump = jumpSearch(arr, element);
        System.out.println("arr = " + Arrays.toString(arr) + ", element = " + element + ", index = " + indexJump);
        int exponentialIndex = exponentialSearch(arr, element);
        System.out.println("arr = " + Arrays.toString(arr) + ", element = " + element + ", index = " + exponentialIndex);
        boolean subString = patternSearch("kbcdfgabcv", "abc");
        System.out.println("pattern = " + subString);
        String child = txtChild("avabcdjkomokmimmkijefghjklk");
        System.out.println("child = " + child);

        String duplicateWords = "umair i am i am i am not a good man";
        String words = duplicateWords(duplicateWords);
        System.out.println("Duplicate Words = \n" + words);
    }

    private static int linearSearch(int[] arr, int element) {
        long startTime = System.currentTimeMillis();
        int size = arr.length;
        for ( int i = 0; i < size; i++) {
            if (arr[i] == element) {
                long endTime = System.currentTimeMillis() - startTime;
                System.out.println("take time = " + endTime);
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] arr, int left, int right,  int element) {
        long startTime = System.currentTimeMillis();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element) {
                long endTime = System.currentTimeMillis() - startTime;
                System.out.println("take time = " + endTime);
                return mid;
            } else if (arr[mid] > element) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    private static int jumpSearch(int[] arr, int element) {
        int m = (int)Math.sqrt(arr.length);
        int currentIndex = m - 1;

        while (currentIndex <= arr.length && element > arr[currentIndex]) {
            currentIndex += m;
        }
        for (int i = 0; i <= currentIndex && i < arr.length; i++) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int exponentialSearch(int[] arr, int element) {
        if (arr[0] == element)
            return 0;
        int length = arr.length;
        int m = 1;
        while (m<length && arr[m] <= element) {
            m=m*2;
        }
        return binarySearch(arr, m/2, Math.min(m, length - 1), element);
    }

    private static boolean patternSearch(String txt, String pattern) {
        int lengthTxt = txt.length();
        int lengthPattern = pattern.length();
        for (int i = 0; i <= lengthTxt - lengthPattern; i++) {
            int j;
            for (j = 0; j < lengthPattern; j++) {
                if (txt.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == lengthPattern) {
                return true;
            }
        }
        return false;
    }

    private static String txtChild(String txt) {
        String child;
        int length = txt.length();
        int indexDup = 0;

        for (int i = 0; i < length; i++) {
            if (i + 1 != length && txt.charAt(i) == txt.charAt(i + 1)) {
                indexDup = i + 1;
                break;
            }
        }
        if (indexDup == 0)
            return txt;
        String left = txt.substring(0, indexDup);
        String right = txt.substring(indexDup, length);
        child = left.length() < right.length() ? left : right;
        return txtChild(child);
    }

    private static String duplicateWords(String word) {
        String regEX = "\\b(\\w+)(?:\\W+\\1\\b)+";

        Pattern p = Pattern.compile(regEX, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(word);
        while (m.find()) {
            word = word.replaceAll(m.group(), m.group(1));
        }
        return word;
    }
}
