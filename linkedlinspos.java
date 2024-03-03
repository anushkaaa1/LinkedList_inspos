public class linkedlinspos {
    Node head,tail;
    int size;

    public linkedlinspos(){
        head = tail = null;
        size = 0;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void create(int num){
        Node n = new Node(num);
        if(head == null){
            tail = head = n;
        }
        else{
             tail.next = n;
             tail = n;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void inspos(int pos,int data){
        
        if(pos>size||pos<0){
            System.out.println("insertion noyt possible");
        }
        else{
            Node n = new Node(data);
            if(pos==0){
                n.next = head;
                head = n;
            }
            else{
                Node temp = head;
                for(int i=1;i<pos;i++){
                    temp = temp.next;
                }
                if(temp.next==null){
                    tail.next = n;
                    tail = n;
                }
                else{
                    n.next = temp.next;
                    temp.next = n;
                }
            }
        }
        
    }
    public static void main(String args[]){
        linkedlinspos l = new linkedlinspos();
        l.create(1);
        l.create(2);
        l.create(4);
        l.create(5);
        l.print(l.head);
        System.out.println();
        l.inspos(0, 3);
        l.print(l.head);
    }
}
