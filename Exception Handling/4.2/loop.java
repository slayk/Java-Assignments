import java.lang.*;
public class loop {
    public void division(){
        int num = 10000;
        for (int i = 0; ; i++) {
            try {
                int result =  (num/(int)(100*Math.random()));
                //System.out.println(result);
            }
            catch(ArithmeticException e){
                System.out.println(e);
                System.out.println("Iteration count="+i);
                break;
            }
        }
    }
}


