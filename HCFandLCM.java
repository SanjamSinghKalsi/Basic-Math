
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        long LCM = 0;
        Long [] answer = new Long[10];
        long flag = 0;
        long lcm = 0;
        long check = 0;
        for(long i = 1 ; i<=(A*B);i++){
            if(A%i ==0 && B%i ==0){
                flag = i;
               // break;
            }
            if(i%A==0 && i%B == 0 ){
                if(check == 0){
                     lcm = i;
                     check = 1;
                }
               
                
            }
            
        }
        
       //System.out.print(lcm);
        answer[1] = (long)flag;
        answer[0] = (long)lcm;
        // if(A==1){
        //     answer[1] = 1;
        // }
        // if(B==1){
            
        // }
        return answer;
        
    }
};
