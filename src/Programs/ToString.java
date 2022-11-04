package Programs;

import java.util.Arrays;

public class ToString {

    @Override
    public String toString() {
        return "this is my object";
    }

    public static void main(String[] args) {
        String[] names=new String[]{"Aniket","vaibhav","raghuveer","dhanshree1","dhanashree2","dnyaneshwar","priyanka","deepak"};
        System.out.println(Arrays.toString(names));

        ToString at6=new ToString();
        System.out.println(at6);//internally toString() method calls always
    }
}