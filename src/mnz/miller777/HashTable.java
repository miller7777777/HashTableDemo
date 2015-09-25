package mnz.miller777;

import java.util.ArrayList;

/**
 * Пример Hash таблицы
 */
public class HashTable {

    public final int size;
    private final boolean[] exists;
    private final ArrayList[] lists;

    public HashTable(int size) {
        this.size = size;
        this.exists = new boolean[size];
        this.lists = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            lists[i] = new ArrayList();
        }
    }

    public int hash(Object obj) {


        return obj.hashCode() % size;
    }

    public void add(Object obj) {
        int h = hash(obj);
        exists[h] = true;
        lists[h].add(obj);
    }

    public Object get(Object key) {
        int h = hash(key);
        if(!exists[h]) return null;

        for (Object obj : lists[h]) {
            if(obj.equals(key)) return obj;
        }

        return null;
    }
}
