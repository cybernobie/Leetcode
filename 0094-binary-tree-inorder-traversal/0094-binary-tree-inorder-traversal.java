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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root==null)
        {
            return l;
        }
        if(root.left!=null)
        l.addAll(inorderTraversal(root.left));
        
        l.add(root.val);


        if(root.right!=null)
        l.addAll(inorderTraversal(root.right));

        return l;
    }
}