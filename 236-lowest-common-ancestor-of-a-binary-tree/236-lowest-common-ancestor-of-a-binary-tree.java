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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        
        if(root == null || root == n1 || root == n2) return root;
        TreeNode lca1 = lowestCommonAncestor(root.left,n1,n2);
        TreeNode lca2 = lowestCommonAncestor(root.right,n1,n2);
        
        if(lca1 != null && lca2 != null) 
            return root;
        else if(lca1 != null)
            return lca1;
        else
            return lca2;
        
    }
}