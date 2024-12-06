s = int(input())

cnt = 0

while True:
    if (s == 1):
        break
    elif (s % 2 == 0):
        s /= 2
    elif (s % 2 == 1):
        s = s*3 + 1
    
    cnt = cnt+1
print(cnt)