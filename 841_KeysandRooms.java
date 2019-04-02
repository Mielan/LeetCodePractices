import java.util.ArrayList;
import java.util.*;

// accepted!
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // create an array for room has key & not entered, add all keys. 
        boolean[] array = new boolean[rooms.size()];
        visit(0, rooms, array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == false){
                return false;
            }
        }
        return true;
    }
    
    static void visit(int num, List<List<Integer>> rooms, boolean[] array){
        // for the room num, first get all keys in the room, then visit key if key not visited.
        array[num] = true;
        for(int i = 0; i < rooms.get(num).size(); i++){
            int key = rooms.get(num).get(i);
            if(array[key] == false){
                visit(key, rooms, array);
            }
        }
    }
    
}
