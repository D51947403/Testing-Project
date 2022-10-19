package singraul.data.structure;

public class CustomArrayList {
    private Object[] myArrayList;
    private int actSize=0;
    
    // default constructor with size 10 
    public CustomArrayList() {
		this(10);
	}

	public CustomArrayList(int n) {
		this.myArrayList = new Object[n];
		this.actSize=0;
	}
	
	// add element to arrayList 
	public void add(Object x) {
		if(checkIfFull()) {
			copyArray(2);
		}
		this.myArrayList[this.actSize]=x;
		this.actSize++;
	}

	public void add(int index, Object x) {
		if(checkIfFull()) {
			copyArray(2);
		}
		
		this.myArrayList[index]=x;
	}
	
	public void remove(int index) {
		this.myArrayList[index]=null;
		copyArray(1);
		this.actSize --;
		
	}
	
	public void remove(Object x) {
		 int i=0;
		 Object [] tempList = new Object[this.actSize];
		 tempList =this.myArrayList;
		 for(Object obj : tempList) {
			if(obj.equals(x)) {
				this.myArrayList[i]=null;
			}
			i++;
		 }
		   copyArray(1);
			this.actSize --;
	}
	
	public int size() {
		return this.actSize;
		
	}
	
	public boolean isEmpty() {
		return this.actSize==0;
	}
	
	public Object get(int index) {
		return this.myArrayList[index];
	}
	
	public void clear() {
		this.myArrayList= null;
		this.myArrayList = new Object[10];
	}
	
	public boolean contains(Object x) {
		 for(Object obj : this.myArrayList) {
				if(obj.equals(x)) {
					return true;
				}
			 }
		 return false;
	}
	
	private void copyArray(int loadFactor) {
		
		 int increaseSize = this.actSize*loadFactor;
		 
		 Object [] tempList = new Object[increaseSize];
		 int i=0;
		 for(Object x : this.myArrayList) {
			 if (x==null )
				 continue;
			 tempList[i++]=x;
		 }
		 this.myArrayList= null;
		 this.myArrayList= new Object[tempList.length];
		 this.myArrayList=tempList;
		 
	}

	private boolean checkIfFull() {
		return this.myArrayList.length == this.actSize;
	}
}
