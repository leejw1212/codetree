a,b,c = input().split()
a = int(a)
b = int(b)
c = int(c)

check = False

for i in range(a,b+1):
    if i % c == 0:
        check = True

if check:
    print("YES")
else:
    print("NO")