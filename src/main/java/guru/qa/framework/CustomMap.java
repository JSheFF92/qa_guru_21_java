package guru.qa.framework;


import java.util.HashMap;
import java.util.Map;

//цикл do...while
public class CustomMap<K, V> {
    private final Map<K, V> innerMap = new HashMap<>();

    public void put(K key, V value) {
        innerMap.put(key, value);
    }

    public V get(K key) {
        int i = 0;
        do {
            innerMap.get(key);
            i++;
        }
        while (i < key.hashCode());
        return innerMap.get(key);
    }
}