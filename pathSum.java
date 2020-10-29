/*
This is an algorithm for solving the problem of finding if a given root to leave path has a given sum.
The code is commented for better understanding.
Refer to this link for attempting this problem:  https://leetcode.com/problems/path-sum/

--------------------------------
Author: Mudassar Raza(https://github.com/mraza1312)
Suggestions are most welcome.
--------------------------------
*/

/**
 * Binary Tree Definition
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null ) return false;
        
        if(root.left == null && root.right == null 
          && root.val == sum) return true;
        
        return ( hasPathSum(root.left, sum - root.val) 
              || hasPathSum(root.right, sum - root.val) );
    }
}

/*
params: - 
root -> root of the binary tree (TreeNode)
sum -> sum that's needed to be checked (int)
*/
