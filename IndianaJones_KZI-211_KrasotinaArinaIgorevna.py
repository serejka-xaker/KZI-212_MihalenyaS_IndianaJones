a = [[6, 12], [5, 2], [2, 10], [10, 100], [4, 12], [18, 9], [38, 720]]
v = 20
v1 = 0
max = 0
a.sort(key=lambda x: x[1], reverse=True)
for i in range(len(a)):
        if a[i][0] <= v:
            max += a[i][1]
            v1 += a[i][0]
            v -= a[i][0]
print(v1, max)

