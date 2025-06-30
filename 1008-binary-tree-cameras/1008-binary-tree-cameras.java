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
    int cameraCount = 0;
    int needCamera = 0;
    int hasCamera = 1;
    int notNeeded = 3;
    int covered = 2;
    public int minCameraCover(TreeNode root) {
        cameraCount = getCameraStatus(root) == needCamera?cameraCount+1:cameraCount;
        return cameraCount;
    }
    public int getCameraStatus(TreeNode root)
    {
        if(root==null)
        return notNeeded;

        if(root.left==null && root.right==null)
        return needCamera;

        int leftStatus = getCameraStatus(root.left);
        int rightStatus= getCameraStatus(root.right);

        if(leftStatus==needCamera || rightStatus==needCamera)
        {
            cameraCount++;
            return hasCamera;
        }

        if(leftStatus == hasCamera || rightStatus== hasCamera)
        {
            return covered;
        }
        return needCamera;
    }

}