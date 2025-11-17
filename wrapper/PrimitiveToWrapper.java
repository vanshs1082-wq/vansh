import java.util.*;
class PrimitiveToWrapper{
    public static void main(String[] a){
        Scanner x=new Scanner(System.in);
        int y=x.nextInt();
        Integer z=Integer.valueOf(y);
        System.out.println(y);
        System.out.println(z);
    }
}
