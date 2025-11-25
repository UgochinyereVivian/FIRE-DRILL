public class TaskNine{
    public static void main(String[]args){

        int sum = 0;
        int total = 0;
        int square = 0;
        int totalSum = 0;

        for(int number = 4; number <= 2000; number*=4){
           total += number;
           
         }           

        for(int numberTwo = 8; numberTwo <= 35000; numberTwo*=8){
           sum += numberTwo;
          
        }
        totalSum = total+sum;
        square = totalSum*totalSum; 
        

        System.out.println(square);


    }
}
