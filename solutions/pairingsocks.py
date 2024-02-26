from collections import deque
from sys import stdin

stack = deque()
aux = deque()

num = int(stdin.readline())

# Reading input
line = stdin.readline().split()
for sock in map(int, line):
    stack.append(sock)

aux.append(-1)

moves = 0

# Sock matching
while stack:
    
    # Match!
    if aux[-1] == stack[-1]:
        aux.pop()
        stack.pop()
        num -= 1
    else:
        aux.append(stack.pop())
    moves += 1

# Output
if num != 0:
    print("impossible")
else:
    print(moves)
