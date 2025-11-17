class WrapperToPrimitive{
    public static void main(String[] a){
        Double x=45.67;
        double y=x;
        int z=(int)(double)x;
        System.out.println(y);
        System.out.println(z);
    }
}
