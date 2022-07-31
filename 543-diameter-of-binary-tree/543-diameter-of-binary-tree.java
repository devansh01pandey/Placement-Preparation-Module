/**
 * Definition for a binary tree node.
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
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        height(root,res);
        return res[0];
    }
    public int height(TreeNode node, int[] res){
        if(node == null) return 0;
        int lh = height(node.left,res);
        int rh = height(node.right,res);
        res[0] = Math.max(res[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
}