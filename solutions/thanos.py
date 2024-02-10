from sys import stdin

num = int(stdin.readline())
for i in range(num):

    nums = stdin.readline().split()
    pop = int(nums[0])
    growth = int(nums[1])
    food = int(nums[2])
    
    count = 0
    while pop <= food:
        pop *= growth
        count += 1
    
    print(count)
