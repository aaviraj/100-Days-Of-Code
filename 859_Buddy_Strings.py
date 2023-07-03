class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        # Step 1: Check if the lengths of s and goal are different
        if len(s) != len(goal):
            return False
        
        # Step 2: Check if s and goal are exactly the same
        # and there are duplicate characters in s
        if s == goal and len(set(s)) < len(s):
            return True
        
        # Step 3: Find the pairs of different characters in s and goal
        diffs = [(a, b) for a, b in zip(s, goal) if a != b]
        
        # Step 4: Check if there are exactly two different pairs of characters
        # and the first pair can be transformed into the second pair by flipping it
        return len(diffs) == 2 and diffs[0] == diffs[1][::-1]