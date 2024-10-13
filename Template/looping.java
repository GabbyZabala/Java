public class looping{
    public static void main(String[] args) {
        int Maxloop = 5;
        int whileloop = 0;
        while(whileloop <= Maxloop){
            System.out.println("This is While loop");
            ++whileloop;// 6 output
            //whileloop++; //6 output
        }
        int dowhileloop = 0;
        do{
            System.out.println("This is Do While loop");
            //++dowhileloop;// 6 output
            dowhileloop++; //6 output
        }while(dowhileloop <= Maxloop);
        for(int forloop = 0; forloop<=Maxloop; ++forloop){//forloop++
            System.out.println("This is For Loop");
        };
    }
}