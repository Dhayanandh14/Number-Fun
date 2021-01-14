
n=gets.to_i;
arr=[]
if(1<=n && n<=10000)
    for i in 0...n
      a,b,c=gets.chomp.split.map(&:to_i)
      if(1<=a && 1<=b && 1<=c &&  a <= 10000 &&b <= 10000&& c <= 10000)
        if(a+b==c ||a-b==c || b-a==c || a*b == c)
              arr[i]="possible"; 
        
        elsif(a % b == 0 && a/b==c)
            arr.push("possible")
          
        elsif(b % a == 0 && b/a==c )
          arr.push("possible")
        
        else
          arr.push("impossible")
        end
      end
    end
  n.times{|j|
    puts arr[j]
}
end
