
class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int length = 0;
        int temp = n;
        int reverse = 0;
        int check = n;
        
        while(temp>0){
            length++;
            temp/=10;
        }
        while(n>0){
            
            int last  = n % 10;
            double power = last * Math.pow(10,length-1);
         reverse  = reverse + (int)power;
         length--;
            n/=10;
        }
        if(check == reverse){
            return "Yes";
        }
        else{
           return "No";
        }
    }
}
