// My Solution.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return isGood(root);
    }
    
    public boolean isGood(TreeNode root){
        if(root == null) return true;
        if(root.left != null){
            if(root.left.val != root.val) return false;
        }
        if(root.right != null){
            if(root.right.val != root.val) return false;
        }
        return isGood(root.left) && isGood(root.right);
    }
}

// SOLUTION. Well, not that hard but wrote in less line
public Solution {
    public boolean isUnivalTree(TreeNode root) {
        return (root.left == null || root.left.val == root.val && isUnivalTree(root.left)) &&
               (root.right == null || root.right.val == root.val && isUnivalTree(root.right));
    }
}
