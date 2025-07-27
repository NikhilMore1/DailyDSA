package Generics;

import Amazon.Arrays.CustomArrayList;

public class CustomMap<K,V> {
    private K key;
    private V value;
    public K getKeys(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public void setKey(K key,V value){
        this.key = key;
        this.value = value;
    }
}
