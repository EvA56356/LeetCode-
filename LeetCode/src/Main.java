import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //2235. Add Two Integers
    public int sum(int num1, int num2) {
        return (num1 + num2);
    }

    //2236. Root Equals Sum of Children
    public boolean checkTree(TreeNode root) {
        if ((root.right.val + root.left.val) == root.val) {
            return true;
        } else {
            return false;
        }
    }

    //226. Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    //1480. Running Sum of 1d Array
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    //412. Fizz Buzz
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        for (int i = 1; i < (n + 1); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                String s = String.valueOf(i);
                output.add(s);
            }
        }
        return output;
    }

    //1342. Number of Steps to Reduce a Number to Zero
    public int numberOfSteps(int num) {
        int output = num;
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    //876. Middle of the Linked List
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }

    //383. Ransom Note
    public boolean canConstruct(String ransomNote, String magazine) {
            for (int i=0;i<ransomNote.length();i++){
                int output=magazine.indexOf(ransomNote.substring(i,i+1));
                if (output!=-1){
                    magazine= magazine.replaceFirst(ransomNote.substring(i,i+1),"");
                }else{
                    return false;
                }
            }
            return true;
        }


    //1672. Richest Customer Wealth
    public static int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        ArrayList<Integer> sums=new ArrayList<>();
        int sum=0;

        for (int i=0;i<row;i++){
            sum=0;
            for (int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            sums.add(sum);
        }
        return (Collections.max(sums));
    }



    public static void main(String[] args) {

    }
}