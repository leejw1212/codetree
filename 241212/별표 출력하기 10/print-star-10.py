n = int(input())
a = 1
b = 0

for i in range(1,n*2+1):
    if i % 2 == 1:
        for j in range(a):
            print("* ",end="")
        print()
        a += 1
    else:
        for j in range(n-b):
            print("* ",end="")
        print()
        b += 1

    