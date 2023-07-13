    class Node{
        public Object item;
        public Node next;//pointing to next node
    }

    public class LinkedListEx {
        private int size;
        private Node head;
    
       public LinkedListEx() {
            this.size=0;
            this.head= null;   
       }
       public void insertingnode(String i){
        Node node= new Node();
        node.item= i;
        //Node current;
        Node current=this.head;
        if (this.head==null){
            this.head=node;
            this.head.next= null;
            this.size=1;
            System.out.println(this.head.toString());
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.next=null;
            this.size+=1;
        }
       }
       public void addAtStarting(String i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
      }
      public void addAtMiddle(String i, int pos) {
        Node node = new Node();
        Node current=this.head;
        if(this.head!=null && pos<=this.size) {
            for(int j=0;j<pos;j++)
               current= current.next;
            current.next= node;
            this.size+=1;
        }else{
            System.out.println("position is greater than size");
        }
      }
      public void deleteNodeAtFirst() {
        Node current = head;
        if(this.head==null) {
            System.out.println("List is Empty");
        }
         else {
            this.head= head.next;
         }
      }
      public void deleteNodeAtLast() {
        Node current= head;
        while(current.next.next!=null) {
            current= current.next;
        }
        current.next=null;
      }
      public void find(int value) {
        Node current = this.head;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if (current.item.equals(value)) {
                System.out.println("Element present at index " + i);
                flag = true;
                // break;
            }
            
            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }

    }
public void display() {
    Node current = this.head;
    while(current!=null) {
        System.out.println(current.item+" ");
        current= current.next;
    }
}


    public static void main(String args[]) {
            LinkedListEx ll= new LinkedListEx();
            ll.addAtStarting("prasanth");
            ll.addAtStarting("gagan");
            ll.addAtStarting("pranay");
            ll.addAtStarting("loki");
            ll.display(); 
            ll.addAtMiddle("subba", 2);
            ll.display();
            ll.deleteNodeAtFirst();
            ll.deleteNodeAtLast();
            ll.display();

    }
}
    
