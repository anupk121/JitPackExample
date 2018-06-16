package jitpack.iitms.com.mylibrary;

/**
 * @author Disha Ganatra on 6/16/2018.
 */
public class MathematicsOperation {

    public int sum(int num1,int num2){
        return  num1+num2;
    }
    public int div(int num1,int num2){

        if(num1==0)
            throw new IllegalArgumentException ("Divided by zero");
        return  num1/num2;
    }
}
