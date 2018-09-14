public class Power4 {

    public static int check_power4(int n){

        int i;
        if(n==1){
            return 1;
        }
        else {
            while (n != 1) {

                if(n%4!=0){
                    return 0;
                }
                n=n/4;
            }
            return 1;
        }
    }
}
