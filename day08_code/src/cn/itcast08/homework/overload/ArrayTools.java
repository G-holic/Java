package cn.itcast08.homework.overload;

public class ArrayTools {
    int binarySearch(int[] arr, int Value) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == Value) {
                return mid;
            } else if (arr[mid] > Value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    int binarySearch(char[] arr, char Value) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == Value) {
                return mid;
            } else if (arr[mid] > Value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    int binarySearch(double[] arr, double Value) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == Value) {
                return mid;
            } else if (arr[mid] > Value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    void sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    void sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    String toString(int[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += arr[i];
            } else {
                result += "," + arr[i];
            }
//            if (i < arr.length - 1) {
//                result += arr[i] + ",";
//            } else {
//                result += arr[i];
//            }
        }
        result += "}";
        return result;
    }

    String toString(char[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i];
            }
        }
        result += "}";
        return result;
    }

    String toString(double[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i];
            }
        }
        result += "}";
        return result;
    }
}
