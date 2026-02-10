class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for(int i=0;i<len;i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                temp.add(queue.poll().val);
            }
            list.add(temp);
        }
        return list;
    }
}