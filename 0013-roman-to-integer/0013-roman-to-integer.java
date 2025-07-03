class Solution {
    public int romanToInt(String s) {
        // Roman numeral mappings
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanMap.get(s.charAt(i));

            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }

            prevValue = current;
        }

        return total;
    }
}
