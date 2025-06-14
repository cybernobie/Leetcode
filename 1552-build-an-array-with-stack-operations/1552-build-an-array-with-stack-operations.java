class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();

        int k=0;
        for(int i=1;i<=100 && k<target.length;i++)
        {
            if(target[k]==i)
            {
            list.add("Push");
            k++;
            }
        else
        {
            list.add("Push");
            list.add("Pop");
        }
        }
        return list;
    }
}