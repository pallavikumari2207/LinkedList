package loopInLL;

public class RunnerLinkedList {
  public static void main(String [] args){
	  LinkedList list=new LinkedList();
	  list.insertAtStart(list, 5);
	  list.insertAtStart(list, 8);
	  list.insertAtStart(list, 9);
	  list.insertAtLast(list, 404);
	  list.insertAtPos(2, 500, list);
	  list.show(list);
  }
}
