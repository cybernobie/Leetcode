class Solution:
    def maxDifference(self, s: str) -> int:
        frequency = {}

        for char in s:
            frequency[char] = frequency.get(char, 0) + 1

        odd_freqs = [freq for freq in frequency.values() if freq % 2 == 1]
        even_freqs = [freq for freq in frequency.values() if freq % 2 == 0]

        if odd_freqs and even_freqs:
            max_diff = max(odd_freqs) - min(even_freqs)
            return max_diff
        else:
            return 0
        