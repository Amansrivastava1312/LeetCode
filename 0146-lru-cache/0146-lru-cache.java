class LRUCache {

    class Node{
        Node prev , next;
        int key,val;
        Node(int _key , int _val){
            key=_key;
            val=_val;
        }
    }
    Node head = new Node(0,0),tail=new Node(0,0);
    Map<Integer,Node> map = new HashMap();
    int capacity;
    
    public LRUCache(int _capacity) {
        capacity= _capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int val) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,val));
        
    }
    
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev=node.prev;
    }
    
    public void insert(Node node){
      map.put(node.key,node);
        Node headNxt = head.next;
        node.next=headNxt;
        node.prev=head;
        head.next=node;
        headNxt.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */