
n=int(input())
arr=[]
if 1<=n and n<=10000:
    for i in range(0,n):
      lst = list(input().split())
      a=float(lst[0])
      b=float(lst[1])
      c=int(lst[2]) 
      if 1<=a and 1<=b and 1<=c and  a <= 10000 and b <= 10000 and c <= 10000:
        if a+b==c or a-b==c or b-a==c or a*b == c:
              arr.append("possible"); 
        
        elif a % b == 0 and a/b==c:
            arr.append("possible")
          
        elif b % a == 0 and b/a==c:
          arr.append("possible")
        
        else:
          arr.append("impossible")
 
for j in range(0,n):
  print(arr[j])
