cnt = 0

while True:
    s = int(input())

    if (s % 2 == 1):
        continue

    if (s % 2 == 0):
        cnt +=1
        print(s//2)

        if (cnt == 3):
            break