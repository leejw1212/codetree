n = int(input())

for i in range(1, 10):
    n = n//i
    if(n <= 1):
        print(i)
        break