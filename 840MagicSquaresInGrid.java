// First try. seems does not work. !

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++){
            for(int j = 0; j < grid[0].length - 2; j++){
                int[][] newGrid = new int[3][3];
                newGrid[0][0] = grid[i][j];
                newGrid[0][1] = grid[i][j+1];
                newGrid[0][2] = grid[i][j+2];
                newGrid[1][0] = grid[i+1][j];
                newGrid[1][1] = grid[i+1][j+1];
                newGrid[1][2] = grid[i+1][j+2];
                newGrid[2][0] = grid[i+2][j];
                newGrid[2][1] = grid[i+2][j+1];
                newGrid[2][2] = grid[i+2][j+2];
                if(isMagicGrid(newGrid)){
                    count++;
                }
            }
        }
        return count;
    }
    
    boolean isMagicGrid(int[][] grid){
        int sum = 15;
        //int rowSum = 0;
        for(int i = 0; i < grid.length; i++){
            int rowSum = grid[i][0] + grid[i][1] + grid[i][2];
            if(rowSum != sum) return false;
            int colSum = grid[0][i] + grid[1][i] + grid[2][i];
            if(colSum != sum) return false;
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] > 9 || grid[i][j] < 1) return false;
            }
        }
        int diaSum1 = grid[0][0] + grid[1][1] + grid[2][2];
        if(diaSum1 != sum) return false;
        int diaSum2 = grid[0][2] + grid[1][1] + grid[2][0];
        if(diaSum2 != sum) return false;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int u = 0; u < 3; u++){
                    for(int o = 0; o < 3; o++){
                        if(grid[i][j] == grid[u][o]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

// Debug was quick! was just off by one error. make sure to be careful when considering the equal statements. 
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++){
            for(int j = 0; j < grid[0].length - 2; j++){
                int[][] newGrid = new int[3][3];
                newGrid[0][0] = grid[i][j];
                newGrid[0][1] = grid[i][j+1];
                newGrid[0][2] = grid[i][j+2];
                newGrid[1][0] = grid[i+1][j];
                newGrid[1][1] = grid[i+1][j+1];
                newGrid[1][2] = grid[i+1][j+2];
                newGrid[2][0] = grid[i+2][j];
                newGrid[2][1] = grid[i+2][j+1];
                newGrid[2][2] = grid[i+2][j+2];
                //for(int o = 0; o < 3; o++){
                //    for(int p = 0; p < 3; p++){
                //        System.out.println(newGrid[o][p]);
                //    }
                //}
                if(isMagicGrid(newGrid)){
                    count++;
                }
            }
        }
        return count;
    }
    
    boolean isMagicGrid(int[][] grid){
        int sum = 15;
        //int rowSum = 0;
        for(int i = 0; i < grid.length; i++){
            int rowSum = grid[i][0] + grid[i][1] + grid[i][2];
            if(rowSum != sum) return false;
            int colSum = grid[0][i] + grid[1][i] + grid[2][i];
            if(colSum != sum) return false;
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] > 9 || grid[i][j] < 1) return false;
            }
        }
        int diaSum1 = grid[0][0] + grid[1][1] + grid[2][2];
        if(diaSum1 != sum) return false;
        int diaSum2 = grid[0][2] + grid[1][1] + grid[2][0];
        if(diaSum2 != sum) return false;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int u = i + 1; u < 3; u++){
                    for(int o = j + 1; o < 3; o++){
                        if(grid[i][j] == grid[u][o]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
