class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
    char arr[] = s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        if(arr[i]=='(')
        st.push(')');
        else if(arr[i]=='{')
        st.push('}');
        else if(arr[i]=='[')
        st.push(']');
        else if(st.isEmpty()||st.pop()!=arr[i])
        return false;
        
        
    }
return st.isEmpty();
    }
}