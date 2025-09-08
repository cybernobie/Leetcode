class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set('aeiouAEIOU')
        left, right = 0, len(s) - 1
        lst = list(s)
        while left < right:
            if lst[left] not in vowels:
                left += 1
            elif lst[right] not in vowels:
                right -= 1
            else:
                lst[left], lst[right] = lst[right], lst[left]
                left += 1
                right -= 1
        return ''.join(lst)