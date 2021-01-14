import java.util.*;

class Numberfun {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n=kbd.nextInt();

    int a,b,c;
    String arr[];
     arr = new String[n];
    if(1<=n && n<=10000)
      for(int i=0;i<n;i++){
        a=kbd.nextInt();
        b=kbd.nextInt();
        c=kbd.nextInt();
        if(1<=a && 1<=b && 1<=c &&  a <= 10000 &&b <= 10000&& c <= 10000){
          if(a+b==c ||a-b==c || b-a==c || a*b == c){
                arr[i]="possible"; 
          }
          else if(a % b == 0 && a/b==c){
              arr[i]="possible";
            }
          else if(b % a == 0 && b/a==c ){
            arr[i]="possible";
          }
          else{
            arr[i]="Impossible";
          }
        }
      }
      for(int j=0;j<n;j++){
          System.out.println(arr[j]);
        }
   }

  }
