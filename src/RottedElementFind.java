public class RottedElementFind {
    public static void main(String[] arg) {
        int[] arr = {2, 2, 2, 7, 9, 9, 2, 2, 2};
        int target = 9;
        System.out.println(findMountainArray(arr, target));
    }

    static int findMountainArray(int[] arr, int target) {
        int index = peek(arr);
        int val = asBinarySearch(arr, target, 0, index);
        if (val != -1) return val;
        return asBinarySearch(arr, target, index + 1, arr.length - 1);
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

    static int peek(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[st])
                end = mid;
            else if (arr[mid] == arr[end]) {
                end -= 1;
            } else if (arr[mid] == arr[st]) {
                st += 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }

}