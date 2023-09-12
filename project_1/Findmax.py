list2_cha, list2_num, list2_ans = input("请输入一串数字，使用空格进行分隔：").split(' '), [], []
max_tmp, max_res = 0, 0
for i in list2_cha:
    list2_num.append(int(i))
for i in range(len(list2_num)):
    max_tmp += list2_num[i]
    if max_tmp > max_res:
        max_res = max_tmp
    if max_tmp < 0:
        max_tmp = 0
print(max_res)
