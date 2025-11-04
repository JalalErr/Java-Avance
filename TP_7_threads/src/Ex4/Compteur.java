package Ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Compteur {
    public int value = 0;
    
    // Avec synchronized.
    public void inc(FileWriter writer) {
        value++;
        try {
            writer.write(Thread.currentThread().getName() + " ; " + value + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Avec ReentrantLock
    
//     public void incrementer(FileWriter writer) {
//    lock.lock();
//    try {
//        value++;
//        try {
//            writer.write(Thread.currentThread().getName() + " ; " + value + "\n");
//            writer.flush();
//        } catch (IOException e) { e.printStackTrace(); }
//    } finally {
//        lock.unlock();
//    }
//}
}