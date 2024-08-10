import java.util.HashMap;
import java.util.*;

public class Hashmap_map_code{

    static class Hashmap<K, V> {  //generic
        private class node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private int n;
        private int N;
        private Linkedlist<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0; i<4 ; i++){
                this.bucket[i] = new LinkedList<>();          
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode(); // generate a random value inbuild function Hashcode
            return Math.abs(hc) % N; // give the absoulate value 
        }

        private int SerchInLL(K key , int bi){
            LinkedList<Node> ll = bucket[bi];
            int di=0;

            for(int i=0 ; i<ll.size() ; i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++; // increment
            }
            return -1;
        }
        
        @SuppressWarnings("unchecked")
        private void rehash(){

            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N*2];
            N = N*2;
            for(int i=0 ; i<bucket.length ; i++){
                bucket[i] = new LinkedList<Node>();

            }

            for(int i=0 ; i<oldBucket.length ; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0 ; j<ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key , node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = SerchInLL(key , bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            else{
                bucket[bi].add(new Node(key, value));
                n++; // increment
            }

            double lambda = (double)n/N;

            if(lambda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = SerchInLL(key , bi);

            if(di != -1){
                return true;
            }
            else{
                return false;
            }
        }

        public V remove(K key){
            nt bi = hashFunction(key);
            int di = SerchInLL(key , bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = SerchInLL(key , bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){

            ArrayList<K> keys = new ArrayList<>();

            for(int i=0 ; i<bucket.length ; i++){
                LinkedList<Node> ll  = bucket[i];
                for(Node node : ll){

                    keys.add(node.value);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

    }

    public static void main(String args[]){

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("india",100);
        hm.put("china",150);
        hm.put("USA",50);
        hm.add("nepal",5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
    }
        
}


