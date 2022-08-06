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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root = buildTree(postorder, 0, postorder.length-1, inorder,0,inorder.length-1,inMap);
        return root;
    }
    
    private TreeNode buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> inMap){
        if(postStart > postEnd || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = buildTree(postorder, postStart, postStart + numsLeft -1, inorder,inStart, inRoot-1, inMap);
        root.right = buildTree(postorder , postStart + numsLeft , postEnd-1,inorder, inRoot+1,inEnd,inMap);
        
        return root;
    }
}