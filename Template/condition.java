public class condition{
    public static void main(String[] args) {
        int man = 0;
        if(man != 0 ){
            System.out.print("Man ");
        }else{
            System.out.print("Lady ");
        }
        switch(man){
            case 0:
                System.out.print("Lady ");
                break;
            default:
                System.out.print("Man ");
                break;
        }
    }
}