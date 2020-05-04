def fun(input1):
    num = str(input1)
    sum = 0
    
    for i in range(len(num)):
        for j in range(i, len(num)):
            sum += int(str(num[j]))
    return sum

print(fun(582109))