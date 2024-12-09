check = True

for i in range(1,6):
    s = int(input())

    if s % 3 == 0:
        continue
    else:
        check = False
        break

if check:
    print(1)
else:
    print(0)
    