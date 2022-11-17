   int number = 12345;
        int answer = 0;
        int length = 0;
        int temp = number;
        while(temp>0){
            length++;
            temp/=10;
        }
      //  System.out.println(length);
        while(number>0){

            int last = number %10;
            double add = last * Math.pow(10,length-1);
            length--;
            answer = answer + (int)add;
            number/=10;
        }
        System.out.println(answer);
