// My Solution.  very easy implementation
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int pivot = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] = temp;
                pivot++;
            }
        }
        return A;
    }
}
