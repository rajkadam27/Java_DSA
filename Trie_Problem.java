import java.util.*;

public class Trie_Problem{

    static class Node{
        Node children[] = new Node[26];  //to store 'a'-'z' words
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    } 

    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for(int level=0 ; level<words.length() ; level++){
            int idx = words.charAt(level)-'a';

            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean Search(String key){
        Node curr = root;
        for(int level=0 ; level<key.length() ; level++){
            int idx = key.charAt(level)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];  // updating current node
        }
        return curr.eow;
    }

    public static boolean wordBreak(String key){

        if(key.length() == 0){
            return true;
        }

        for(int i=1 ; i<key.length() ; i++){
            // statring pf i=1 not with  i=0 bcz substring(0,1)=(beg,i) = then last index is aslo become a zero if we intialise i =0
            if(Search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return Search(key);
    }
    
    public static void main(String args[]){
        String arr[] = {"i", "like","sam","samsung","mobile","ice"};
        for(int i=0 ; i<arr.length ; i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
   } 
}