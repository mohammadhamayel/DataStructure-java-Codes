
public class Hashtable {
	 class Node{ 
		int key;
		int value ;
		Node next ;;
		
		Node(int key , int value){
			this.key = key ;
			this.value = value;
			next = null ;
		}
		Node(){
			
		}
	}
	 int size ;
	 Node [] arrayHash ;
	
	Hashtable(int size) {
		this.size = size ;
		arrayHash = new Node[this.size];
		for(int i=0; i<arrayHash.length;i++) {
			arrayHash[i]=new Node();
		}
		
	}
	
	 int hashFunction(int key) {
		return key%size;
	}
	
	 void puch(int key ,int value) {
		int index = hashFunction(key);
		Node added = arrayHash[index] ;
		Node append = new Node (key,value);
		append.next = added.next ;
		added.next=append ;
		
		
		
	}
	 int get(int key ) {
		int index = hashFunction(key);
		int res = 0;
		Node added = arrayHash[index] ;
		while(added!= null) {
			if(added.key == key) {
				res=added.value;
				break;
				
			}
			added =added.next;
		}
		return res ;
		
	}
	public static void main(String[] args) {
		Hashtable hash = new Hashtable(10);
		hash.puch(8,15);
		hash.puch(8,13);
		
		System.out.println(hash.get(8));;
	}
}
