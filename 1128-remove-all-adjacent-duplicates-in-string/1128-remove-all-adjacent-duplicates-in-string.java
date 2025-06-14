class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int tr_len = s.length();
        char [] arr = s.toCharArray();

        for(int i=0;i<tr_len;i++)
        {
            if(!stack.isEmpty() && stack.peek()==arr[i])
            {
                stack.pop();
            }
            else
            {
                stack.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}