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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();        
        
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> subans = new ArrayList<>();
            for(int i =0;i<level;i++){
                TreeNode cur = q.poll();
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
                subans.add(cur.val);
            }
            ans.add(subans);
        }
        return ans;        
    }
}