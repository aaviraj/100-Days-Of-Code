class Solution:
    def robotSim(self, commands: List[int], obstacles: List[List[int]]) -> int:
        obstacles = set(map(tuple, obstacles))
        direction = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        x = y = di = 0
        ans = 0
        for cmd in commands:
            if cmd == -2:
                di = (di - 1) % 4
            elif cmd == -1:
                di = (di + 1) % 4
            else:
                for k in range(cmd):
                    if (x + direction[di][0], y + direction[di][1]) not in obstacles:
                        x += direction[di][0]
                        y += direction[di][1]
                        ans = max(ans, x * x + y * y)
        return ans