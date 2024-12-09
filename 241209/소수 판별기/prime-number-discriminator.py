s = int(input())
check = False

for i in range(2, s):
    if s % i == 0:
        check = True
        break

if check:
    print("C")
else:
    print("P")