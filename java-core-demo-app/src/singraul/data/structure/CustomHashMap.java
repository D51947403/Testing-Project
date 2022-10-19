package singraul.data.structure;
// https://www.devglan.com/java8/hashmap-custom-implementation-java
public class CustomHashMap<K,V> {
    private Entry<K,V> [] table;
    private int capacity =16; // initial capacity 
    private int actSize=0; 
    
    public CustomHashMap(){
    	table = new Entry[capacity];
    }
    public CustomHashMap(int custCapcity) {
    	table= new Entry[custCapcity];
    	this.capacity=custCapcity;
    }
    
    public void put(K key, V value) {
    	int index = index(key);
    	Entry newEntry= new Entry (key, value,null);
    	if(table[index]==null) {
    		table[index]=newEntry;
    		actSize++;
    	}else {
    		Entry<K,V> previousNode = null;
    		Entry<K,V> currentNode = table[index];
    		while (currentNode != null) {
    			if(currentNode.getKey().equals(key)) {
    				currentNode.setValue(value);
    				break;
    			}
    			previousNode=currentNode;
    			currentNode=currentNode.getNext();
    		}
    		if(previousNode != null) {
    			previousNode.setNext(newEntry);
    			actSize++;
    		}
    	}
    }
    
    
    public V get(K key) {
    	V value=null;
    	int index = index(key);
    	Entry<K,V> entry=table[index];
    	
    	while (entry != null) {
    		if(entry.getKey().equals(key)) {
    			value=entry.getValue();
    			break;
    		}
    		
    		entry=entry.getNext();
    	}
    	
    	return value;
    }
    
    public void remove(K key) {
    	int index=index(key);
    	Entry<K,V> previous = null;
    	Entry<K,V> entry= table[index];
    	while(entry != null) {
    		if(entry.getKey().equals(key)) {
    			if(previous == null) {
    			entry=entry.getNext();
    			table[index]=entry;
    			actSize--;
    			return;
    			}else {
    			  previous.setNext(entry.getNext());
    			  actSize--;
    			  return;
    	    	}
    		}
    		previous = entry;
            entry = entry.getNext();
    	}
    }
    
    public void display() {
    	for(int i = 0; i < actSize; i++){
            if(table[i] != null){
                Entry<K, V> currentNode = table[i];
                while (currentNode != null){
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }
    
    public int size() {
    	return this.actSize;
    }
    
    public boolean isEmpty() {
    	return this.actSize==0;
    }
    
    // calculating index using custom hash code calculation 
    private int index(K key) {
    	if(key == null) {
    		return 0;
    	}
    	return Math.abs(key.hashCode() % capacity);
    }
}

class Entry<K,V>{
	private K key;
	private V value;
	private Entry<K,V> next;
	
	public Entry(K key, V value, Entry<K, V> next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public Entry<K, V> getNext() {
		return next;
	}
	public void setNext(Entry<K, V> next) {
		this.next = next;
	}
	
	
}