

class Solution{
    static int evenlyDivides(int N){
        // code here
        int count = 0;
        int check = 0;
        int temp = N;
        int idk = 0;
        while(temp>0){
             check =(temp%10);
           //  System.out.println(check);
           if(check == 0){
               idk++;
           }
            else if(N % check == 0){
                count++;
            }
            else{
                idk++;
            }
          temp=  temp/10;
        }
        return count;
    }
}
