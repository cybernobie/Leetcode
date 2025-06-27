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
    private int res;
    public int sumNumbers(TreeNode root) {
        if(root==null)
        return 0;
        sum(root,res);
        return res;
    }
    private void sum(TreeNode root,int val)
    {
        int ans= val*10+root.val;
        if(root.left==null && root.right==null)
    {
        res+=ans;
        return;
    }
    if(root.left!=null)
    sum(root.left,ans);
    if(root.right!=null)
    sum(root.right,ans);
    }

}