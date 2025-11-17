class StudentGrade {
    public static void main(String[] a) {
        String[] b = {"90","A+","85"};
        for(String c : b) {
            try {
                int d = Integer.parseInt(c);
                System.out.println(d);
            } catch(NumberFormatException x) {
                System.out.println("Invalid grade input: " + c);
            }
        }
    }
}
