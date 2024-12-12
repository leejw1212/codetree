n = int(input())
a = 0

for i in range(1,n*2+1):
    if i % 2 == 1:
        for j in range(n-a):
            print("* ",end="")
        print()
        a += 1
    else:
        for k in range(a):
            print("* ",end="")
        print()

