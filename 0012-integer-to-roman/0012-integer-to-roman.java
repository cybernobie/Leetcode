class Solution {
    private static final NavigableMap<Integer, String> romanMap = new TreeMap<>();

    static {
        romanMap.put(1,    "I");
        romanMap.put(4,    "IV");
        romanMap.put(5,    "V");
        romanMap.put(9,    "IX");
        romanMap.put(10,   "X");
        romanMap.put(40,   "XL");
        romanMap.put(50,   "L");
        romanMap.put(90,   "XC");
        romanMap.put(100,  "C");
        romanMap.put(400,  "CD");
        romanMap.put(500,  "D");
        romanMap.put(900,  "CM");
        romanMap.put(1000, "M");
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            // floorKey gives the greatest key ≤ num
            Integer key = romanMap.floorKey(num);
            sb.append(romanMap.get(key));
            num -= key;
        }
        return sb.toString();
    }
}
