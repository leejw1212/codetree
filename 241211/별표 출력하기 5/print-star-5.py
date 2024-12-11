n = int(input())

for s in range(1,n+1):
    for i in range(n-s+1):
        for j in range(n-s+1):
            print("*",end="")
        print("",end=" ")
    print()