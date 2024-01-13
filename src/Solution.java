class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (letters[mid] > target) end = mid - 1;
            else st = mid + 1;

        }
        return letters[st % letters.length];
    }

    public int nextGreatestNum(int[] letters, int target) {
        int st = 0;
        int end = 0;
        int mid = 0;
        if (target > letters[letters.length - 1]) return letters[0];
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (letters[mid] > target) st = mid + 1;
            else if (letters[mid] < target) end = mid - 1;
            else {
                return letters[mid];
            }
        }
        return letters[st + 1];
    }
}