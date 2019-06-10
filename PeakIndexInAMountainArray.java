public class PeakIndexInAMountainArray{

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

    private int peakIndexInMountainArray(int[] A){
        int n = A.length;
        for(int i = 0; i < n; i++){
            if(A[i] >= A[i +  1]){
                return i;
            }
        }
        return n;
    }

}
