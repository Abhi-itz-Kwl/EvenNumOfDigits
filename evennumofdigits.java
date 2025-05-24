public class evennumofdigits {
    public static void main(String[] args){
        int num[]={12,345,2,6,7896,6789,54,34};
        System.out.println(findnum(num));

    }
   static int findnum(int[] num){
    int c=0;
    for(int n:num){
        if(n<0)
        {
            n=n*-1;
        }
        if(even(n)){
            c++;
        }
    }
    return c;
   }
   static boolean even(int n){
    int ans=countdigits(n);
    
    return ans%2==0;
   }
   static int countdigits(int n)
   {
      
       return (int)(Math.log10(n)+1);
   }
    
}
