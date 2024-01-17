public class MaxSumOfArray {
    public static int splitArray(int[]nums, int k) {
        int st=0;
        int end=0;
        for(int num:nums){
            st=Math.max(st,num);
            end+=num;
        }
        while(st<end){
            int mid = st+(end-st)/2;
            if(canSplit(nums,mid,k)){
                end=mid;
                continue;
            }
            st=mid+1;
        }
        return st;
    }
    public static boolean canSplit(int[]nums,int mid,int k){
        int total=0;
        int count=0;
        for(int num:nums){
            total+=num;
            if(total>mid){
                total=num;
                count+=1;
                if(count>=k)return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 3, 3, 4, 4, 1};
        int k1 = 4;
        System.out.println("\nResult 1: " + splitArray(nums1, k1));

    }
}
