package Data_Structure;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_LinkedHashMap<K, V>  extends LinkedHashMap{
    // LinkedHashMap을 이용한 LRU cache구현
    private final int capacity; //cache size

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }

    public LRU_LinkedHashMap(int size) {
        this.capacity = size;
    }

    public static void main(String[] args) {
        LRU_LinkedHashMap<Integer, Integer> cache = new LRU_LinkedHashMap<>(5);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.put(5, 5);

        System.out.println(cache); // {1=1, 2=2, 3=3, 4=4, 5=5}

        /**
         * 현재 cache의 capacity는 5
         * 현재 수용량이 다 차있는 상태에서 새로운 데이터를 넣으면
         * 가장 오래된 데이터는 자동으로 지워지고 새 데이터가 들어가게 된다.
         */
        cache.put(6, 6);
        System.out.println(cache); // {2=2, 3=3, 4=4, 5=5, 6=6}
    }
}