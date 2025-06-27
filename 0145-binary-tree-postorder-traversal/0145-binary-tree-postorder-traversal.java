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
    public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer> l = new ArrayList<Integer>();
        if(root==null)
        {
            return l;
        }
        if(root.left!=null)
        l.addAll(postorderTraversal(root.left));
        
        if(root.right!=null)
        l.addAll(postorderTraversal(root.right));

         l.add(root.val);

        return l;
    }
}