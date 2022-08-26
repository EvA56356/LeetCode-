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

    //326. Power of Three
    public static boolean isPowerOfThree(int n) {
        if (n>0){
            double output= Math.log(n)/Math.log(3);
            if (Math.pow(3,Math.round(output))==n){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    // 9. Palindrome Number
    public static  boolean isPalindrome(int x) {
        String num=String.valueOf(x);
        int length=num.length();
        ArrayList<String> array=new ArrayList<>();
        boolean state=false;
        if (length==1){
            return true;
        }
        for (int i=0;i<length;i++){
            array.add(num.substring(i,i+1));
        }
        for (int i=0;i<length/2;i++){
            String a=array.get(i);
            String b=array.get(length-1-i);
            if (array.get(i).equals(array.get(length-1-i))){
                state=true;
            }else{
                return false;
            }
        }
        if (state==true){
            return true;
        }else{
            return false;
        }
    }

    //724. Find Pivot Index
    public static int pivotIndex(int[] nums) {
        int length=nums.length;
        int sum1=0;
        int sum2=0;
        boolean state = false;
        for (int i=0;i<length;i++){
            sum2=0;
            if (i==0){
                sum1=0;
            }else{
                sum1=sum1+nums[i-1];
            }
            for (int j=1;j<length-i;j++){
                sum2=sum2+nums[i+j];
            }
            if (sum1==sum2){
                state = true;
                return i;
            }
        }
        if (state ==false){
            return -1;
        }else{
            return -1;
        }
    }

    //13. Roman to Integer
    public static int romanToInt(String s) {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals("I")){
                num.add(1);
            }
            if (s.substring(i,i+1).equals("V")){
                num.add(5);
            }
            if (s.substring(i,i+1).equals("X")){
                num.add(10);
            }
            if (s.substring(i,i+1).equals("L")){
                num.add(50);
            }
            if (s.substring(i,i+1).equals("C")){
                num.add(100);
            }
            if (s.substring(i,i+1).equals("D")){
                num.add(500);
            }
            if (s.substring(i,i+1).equals("M")){
                num.add(1000);
            }
             }
        int length= num.size();
        for (int i=1;i<length;i++){
            if (num.get(i - 1) <num.get(i)){
                int temp=num.get(i - 1);
                temp=temp*(-1);
                num.set(i - 1,temp);
            }
        }
        int sum=0;
        for (int i=0;i<length;i++){
            sum+=num.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {

        romanToInt("LVIII");
    }
}