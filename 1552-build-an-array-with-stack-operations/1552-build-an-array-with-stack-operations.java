class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int k=0;
        for(int i=1;i<=100 && k<target.length;i++)
        {
            if(target[k]==i)
            {
            stack.push("Push");
            k++;
            }
        else
        {
            stack.push("Push");
            stack.push("Pop");
        }
        }
        for (String i:stack)
        {
            list.add(i);
        }
        return list;
    }
}