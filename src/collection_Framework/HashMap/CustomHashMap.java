package collection_Framework.HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CustomHashMap<K ,V> {
        class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key = key;
                this.value= value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        CustomHashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0;i<N;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int index = key.hashCode();
            return Math.abs(index) % N;
        }
        public int getNode(K key,int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];
            for (int i = 0;i<ll.size();i++){
                if (ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public void rehashing(){
            LinkedList<Node>list[] = buckets;
            buckets = new LinkedList[N*2];
            for (int i = 0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0;i<list.length;i++){
                LinkedList<Node> linkedList = list[i];
                for (int j = 0 ;j<linkedList.size();j++){
                    Node node = linkedList.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            //we need bucket index
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                buckets[bucketIndex].add(new Node(key,value));
                n++;
            }else {
                Node node = buckets[bucketIndex].get(nodeIndex);
                node.value = value;
            }
            double lambda = (double) n/N;
            if (lambda>2.0){
              rehashing();
            }
        }
        @Override
        public String toString(){
            String data ="{ ";
            for (int i = 0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for (int j = 0;j<ll.size();j++){
                    data = data+ll.get(j).key +" = "+ll.get(j).value +",";
                }
            }
            return data+" }";
        }
        public V get(K key){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                return null;
            }
            else{
                return buckets[bucketIndex].get(nodeIndex).value;
            }
        }
    public int size(){
        return buckets.length;
    }
    public boolean isEmpty(){
            for (int i = 0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                if (ll.size() != 0){
                    return false;
                }
            }
            return true;
    }
    public boolean containsKey(K key){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                return false;
            }
            return true;
    }
    public boolean replace(K key,V oldValue,V newValue){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                return false;
            }
            if (buckets[bucketIndex].get(nodeIndex).value.equals(oldValue)){
                buckets[bucketIndex].get(nodeIndex).value = newValue;
                System.out.println(buckets[bucketIndex].get(nodeIndex).key);
                return true;
            }
            return false;
    }
    public V putIfAbsent(K key,V value){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                buckets[bucketIndex].add(new Node(key,value));
                return value;
            }else if (buckets[bucketIndex].get(nodeIndex).value == null){
                buckets[bucketIndex].get(nodeIndex).value = value;
                return value;
            }
            return buckets[bucketIndex].get(nodeIndex).value;
    }
    public V replace(K key,V value){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                return null;
            }
            V oldVal = buckets[bucketIndex].get(nodeIndex).value;
            buckets[bucketIndex].get(nodeIndex).value = value;
            return oldVal;
    }
    public boolean remove(K key , V value){
            int bucketIndex = hashFunction(key);
            int nodeIndex = getNode(key,bucketIndex);
            if (nodeIndex == -1){
                return false;
            }
            if (buckets[bucketIndex].get(nodeIndex).value.equals(value)){
                Node node = buckets[bucketIndex].get(nodeIndex);
            }
            return false    ;
    }

    public static void main(String[] args) {
            CustomHashMap<String,Integer> map = new CustomHashMap<>();
//        HashMap<String,Integer>map = new HashMap<>();
            map.put("India",1000);
            map.put("USA",500);
            map.put("UK",2000);
        System.out.println(map.replace("India",1000,2000));
        System.out.println(map.replace("UK",1000));
        System.out.println(map);
    }
}
