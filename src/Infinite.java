public class Infinite {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
        System.out.println("infinte binary " + binary(arr, target));

    }

    static int binary(int[] arr, int target) {
        int ans = -1;
        int st = 0;
        int end = 1;
        int i = 0;
        while (arr[end] < target) {
            st = end;
            end = end * 2;
            System.out.println("steps :" + i + arr[end] + "<" + target + ":ans " + (arr[end] > target));
            i += 1;
        }
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
}
