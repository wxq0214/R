import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public void test(int [] nums) {
        TreeNode root = generateBST(nums);
        System.out.println(root.val);
        return;
    }

    public TreeNode generateBST(int[] nums) {
        if (nums.length == 0)
            return null;
        int start = 0;
        int end = nums.length - 1;
        TreeNode root = build(start, end, nums);
        return root;
    }

    public TreeNode build(int start, int end, int[] nums) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = build(start, mid - 1, nums);
        current.right = build(mid + 1, end, nums);
        return current;
    }
    

    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = new int [] {1,6,7};
        s.test(nums);

    }
}







