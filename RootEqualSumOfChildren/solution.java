/* You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.

Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.  */


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
public class solution {
    public boolean chechTree (TreeNode root) {
        if(root == null || root.left == null || root.right == null) {
            return false;
        }
        int sum = root.left.val + root.right.val;
        if(root.val==sum) {
            return true;
        } else {
            return false;
        }
    }
}
