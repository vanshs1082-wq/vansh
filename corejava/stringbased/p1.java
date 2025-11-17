package stringbased;

public class p1 {
	
	    public static void main(String[] args) {
	        String a= "java is fun";
	        String b=new String();
	        int x=-1;
	        char c= new char();
	        for(int i=0 ;i<a.length();i++){
	        	c=a.charAt(x);
	            b=b.concat(c);
	            x--;

	        }
	        System.out.println(b);
	    }
	    
	

}
