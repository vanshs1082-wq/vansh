public class p1 {
       public static void main(String[] args) {
       
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");

        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" "); 
            }
        }
    }
    
}
