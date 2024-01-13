public class CountRotaionArray {
    public static void main(String[] arg) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotationArray(arr));
    }

    static int countRotationArray(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) return 0;
        return peek(arr) + 1;
    }

    static int peek(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[0]) {
                end = mid;
                continue;
            }
            ans = mid;
            st = mid + 1;
        }
        return ans;
    }
}
