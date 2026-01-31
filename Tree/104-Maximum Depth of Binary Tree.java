class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int Ldepth = maxDepth(root.left);
        int Rdepth = maxDepth(root.right);
        return 1 + Math.max(Ldepth,Rdepth);
    }
}