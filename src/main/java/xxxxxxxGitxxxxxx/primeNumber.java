package xxxxxxxGitxxxxxx;

public class primeNumber{
  
 public static void main(String[] args){
  for(int i=1;i<=100;i++)
  {
    int tem=0;
    for(int j=2;j<=i-1;j++){
     if(i%j==0)
       tem++;
    }
    if(tem==0 && i!=1)
      System.out.println(i);
  }

 }
}
