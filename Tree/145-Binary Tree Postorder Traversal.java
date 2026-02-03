class Solution {
    List<Integer> A=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            A.add(root.val);
        }
        return A;
    }
}