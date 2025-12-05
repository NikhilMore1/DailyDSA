package EPAM.coding;

import java.util.*;

public class HashMaps<K,V> {
    private float load_factor = 0.75f;
    private int capacity = 16;
    private  int size = 0;
    class Node{
        K key;
        V value;
        Node(K key , V value){
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Node> buckets[];
    HashMaps(){
        buckets = new LinkedList[capacity];
        for (int i = 0;i<16;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    public int getHash(K key){
        int bi = key.hashCode();
        return Math.abs(bi)%capacity;
    }
    public int searchIndex(K key , int bucketIndex){
        for (int i = 0;i<buckets[bucketIndex].size();i++){
            if (buckets[bucketIndex].get(i).key.equals(key)){
                return i;
            }
        }
        return -1;
    }
    public void put(K key , V value){
        int bucketIndex = getHash(key);
        int dataIndex = searchIndex(key , bucketIndex);

        if (dataIndex== -1){
            buckets[bucketIndex].add(new Node(key,value));
            size++;
        }else {
            Node data = buckets[bucketIndex].get(dataIndex);
            data.value = value;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ni",100);
        System.out.println(map);
        HashMaps<String,Integer> maps = new HashMaps<>();
        maps.put("Nikhil",100);
        maps.put("Yash",200);
        System.out.println(maps);

    }
}
