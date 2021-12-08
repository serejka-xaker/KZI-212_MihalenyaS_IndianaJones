a = [[6,12], [5,2], [2,10], [10,100], [4,12], [18,9], [38,152]]
a1 = [[6,12], [5,2], [2,10], [10,100], [4,12], [18,9], [38,152]]
v = 20
b =[]
c =[]
summ = 0
for i in range(len(a)):
    d = a[i][1]/a[i][0]
    b.append(d)
while v > 0:
    max = -1
    maxj = 0
    for j in range(len(b)):
        if b[j] > max:
            max = b[j]
            maxj = j
    if a[maxj] [0] < v:
        summ+=b[maxj] * a[maxj][0]
        v-= a[maxj][0]
        a[maxj][0], a[maxj][1] = 0, 0
        b[maxj] = 0
    else:
        summ+= b[maxj]*v
        a [maxj][0] = v
        vlast = v
        v = 0
for k in range(len(a)):
    if a[k] [0] == 0:
        c.append(a1[k][0])
    elif a[k][0] != a1[k][0]:
        c.append(a[k][0])
    else:
        c.append(0)
print(c)
print(summ)