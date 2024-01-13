public class MountainArray {
    public static void main(String[] arg) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
        System.out.println(findMountainArray(arr, target));
    }

    static int findMountainArray(int[] arr, int target) {
        int index = PeekMountain(arr);
        int min = asBinarySearch(arr, target, 0, index);
        if (min != -1) return min;
        for (int i = index + 1; i < arr.length; i++) System.out.printf(" " + arr[i]);
        System.out.println();
        return desBinarySearch(arr, target, index, arr.length - 1);
    }

    static int asBinarySearch(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) end = mid - 1;
            else if (arr[mid] < target) st = mid + 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    static int desBinarySearch(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) st = mid + 1;
            else if (arr[mid] < target) end = mid - 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    static int PeekMountain(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
}