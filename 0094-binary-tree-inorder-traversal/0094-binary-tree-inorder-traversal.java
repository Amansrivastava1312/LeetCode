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
    public List<Integer> inorderTraversal(TreeNode root) { // iterative approach
        List<Integer> list=new ArrayList<Integer>();
      
        
        if(root==null){
            return list;
        }
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }
    
    
}
    
    
   