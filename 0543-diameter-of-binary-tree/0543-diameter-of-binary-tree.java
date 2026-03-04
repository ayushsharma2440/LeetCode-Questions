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
    int height(TreeNode root){
        if (root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans,lh+rh);
        return 1 + Math.max(lh,rh);
    }
    private int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans,left+right);
        return ans;
    }
}