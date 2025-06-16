class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    int len  = nums1.length;
    int[] ans =  new int[len];

    for (int x : nums2)
    {
        while(!stack.isEmpty()&& stack.peek() < x)
        {
            map.put(stack.pop(),x);
        }
        stack.push(x);
    }
    while (!stack.isEmpty())
    {
        map.put(stack.pop(),-1);
    }
    for (int i =0 ;i<ans.length;i++)
    {
        ans[i]=map.get(nums1[i]);
    }
    return ans;
    }
}