n = int(input())

for i in range(1,n+1):
    for j in range(n-i):
        print(" ",end="")
    for k in range(i*2-1):
        print("*",end="")
    print()

for i in range(1,n):
    for j in range(i):
        print(" ",end="")
    for k in range((n-i)*2-1):
        print("*",end="")
    print()

