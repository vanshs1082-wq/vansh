import java.util.function.*;
public class SmartHomeLighting {
    public static void main(String[] args) {
        Runnable motion = () -> System.out.println("Light ON due to motion");
        Runnable time = () -> System.out.println("Light ON at evening");
        Runnable voice = () -> System.out.println("Light ON by voice command");
        motion.run();
        time.run();
        voice.run();
    }
}