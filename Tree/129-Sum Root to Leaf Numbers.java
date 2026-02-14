class Solution {
    private int sum = 0;
    private void calculate(TreeNode root, int num){
        num = num*10 + root.val;
        if(root.right == null && root.left == null){
            sum = sum + num;
            return;
        }
        if(root.left != null) calculate(root.left , num);
        if(root.right != null) calculate(root.right, num);
    }
    public int sumNumbers(TreeNode root) {
        calculate(root, 0);
        return sum;
    }
}