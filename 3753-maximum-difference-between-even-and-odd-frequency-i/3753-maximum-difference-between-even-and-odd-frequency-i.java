class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();

        for (int freq : frequency.values()) {
            if (freq % 2 == 1) {
                oddFreqs.add(freq);
            } else {
                evenFreqs.add(freq);
            }
        }

        if (!oddFreqs.isEmpty() && !evenFreqs.isEmpty()) {
            int maxOdd = Collections.max(oddFreqs);
            int minEven = Collections.min(evenFreqs);
            return maxOdd - minEven;
        } else {
            return 0;
        }
    }
}