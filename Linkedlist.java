class Linkedlist {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;

        }
    }
    Node head=null;
  
    public void reverse(){
        Node curr=head;
        Node pre=null;
        Node nex=null;
        

        while(curr!=null){
            nex=curr.next;
            curr.next=pre;
            pre=curr;

           curr=nex;
        }
        head=pre;
    }
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  void middle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);


    }
}
public class training {

    public static void main(String[] args) {
Linkedlist lk=new Linkedlist();
lk.insert(5);
lk.insert(7);
lk.insert(13);
lk.display();
//lk.reverse();
//lk.middle();
//System.out.println();
//lk.display();
    }
}
