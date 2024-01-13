package Java_DSA;
import java.util.HashSet;

class MyHashSet {
    
    private HashSet<Integer> set;
    
    public MyHashSet() {
        set = new HashSet<>();
    }
    
    public void add(int key) {
        set.add(key);
    }
    
    public void remove(int key) {
        set.remove(key);
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
}

public class Design_HashSet {

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();

        obj.add(1);
        obj.add(2);
        obj.add(3);

        System.out.println("HashSet contains 2: " + obj.contains(2));

        obj.remove(2);

        System.out.println("HashSet contains 2: " + obj.contains(2));
    }
}

