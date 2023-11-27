package _06_generic;

public class Pair<K,V> {

    private K key;
    private V value;

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>();
        p1.setKey("one");
        p1.setValue(1);
        System.out.println(p1);

        Pair<Integer, String> p2 = new Pair<>();
        p2.setKey(2);
        p2.setValue("two");
        System.out.println(p2);
    }
}
