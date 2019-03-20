// make sure contains!! not contain. Interesting use of HashSet.
class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < fronts.length; i++){
            if(fronts[i] == backs[i]){
                set.add(fronts[i]);
            }
        }
        int minN = 2500;
        for(int i : fronts){
            if(!set.contains(i)){
                minN = Math.min(minN, i);
            }
        }
        for(int i : backs){
            if(!set.contains(i)){
                minN = Math.min(minN, i);
            }
        }
        return minN % 2500;
    }
}
