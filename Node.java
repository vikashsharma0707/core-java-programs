
class Node{
      int data;
      Node next;
   //member data

   public Node(int data){
     this.data=data;
     this.next=null;
    }

  public void printData(Node head){
   if(head==null){
   System.out.println("List is empty");
   
  else{
    Node temp=head;
    while(temp!=null){
       System.out.println("==>" +temp.data);
        temp=temp.next;
    }
 }
}  

   public static void main(String args[]){
    Node first =new Node(10);
    Node second =new Node(20);
    Node third =new Node(30);
   Node fourth =new Node(40);
   Node head =first;
   head.next=second;
   head.next.next=second;
   head.next.next.next=second;
   System.out.println("print data of singly linked list :");
   head.printData(head);
   
  