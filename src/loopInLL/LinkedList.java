package loopInLL;

public class LinkedList {
private  Node head;
private  int size=0;
public  LinkedList insertAtStart (LinkedList list,int data){
  Node n=new Node( data);
  n.setNext(null);
  if(list.getHead()==null){
	list.setHead(n);
    }
   else
  {
	n.setNext(getHead());
	setHead(n);
	}

size++;
return list;

}
public LinkedList insertAtLast(LinkedList list,int data){
	Node n=new Node(data);
	if(list.getHead()==null){
		list.setHead(n);
	}
	else{
		Node temp=getHead();
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		temp.setNext(n);
	}
	size++;
	return list;
	
}

public LinkedList insertAtPos(int pos,int data,LinkedList list){
	Node n=new Node(data);
	if(list.getSize()<pos){
		System.out.println("cannot insert at given position size of list is:"+getSize());
	}
	else
	{
		Node temp=list.getHead();
		for(int i=0;i!=pos-1;i++){
			temp=temp.getNext();
		}
		n.setNext(temp.getNext());
		temp.setNext(n);
	}
	size++;
	return list;
}

public  void show(LinkedList list){
	
	if(list.getSize()==0){
		System.out.println("empty list");
	}
	else
	{Node temp=list.getHead();
		for(int i=size;i!=0;i--){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
}
public  Node getHead() {
	return head;
}
public void setHead(Node head) {
	this.head = head;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}

}
