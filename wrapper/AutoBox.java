import java.util.*;
class AutoBox{
    public static void main(String[] a){
        ArrayList<Integer> x=new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(5);
        x.add(15);
        x.add(5);
        int s=0;
        for(int y:x)s+=y;
        System.out.println("Sum of numbers = "+s);
    }
}
