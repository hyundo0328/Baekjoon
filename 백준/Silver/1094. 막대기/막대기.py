x = int(input())
lst = [64]
while x<sum(lst):
    a = lst.pop()//2
    lst.extend([a,a])
    if sum(lst[:-1])>=x:
        lst.pop()
        
print(len(lst))