class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else if(operations[i].equals("D"))
            {
            stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("+"))
            {
              int temp = stack.get(stack.size()-2);
              stack.push(stack.peek()+temp);
            }
            else
            stack.push(Integer.parseInt(operations[i]));
        }
        for(int s:stack)
        sum+=s;
        return sum;
    }
}