// First try; does not work and miss understood the prompt: want to check if the BINARY (not decimal) number divisible by 5!!

import java.util.ArrayList;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<Boolean>();
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}


// https://www.geeksforgeeks.org/decimal-representation-given-binary-string-divisible-5-not/
// Above is an interesting way to check if binary number divisible by 5. .. not fully understood, pls reread 

// Could potentialy work, but hard to implement

-------------
// Mind blowing way of solving problem!!!
import java.util.ArrayList;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<Boolean>();
        int num = 0;
            for(int i = 0; i < A.length; i++){
                num = (num * 2 + A[i]) % 5;
                result.add(num == 0);
            }
        return result;
    }
  
}


