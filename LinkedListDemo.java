

public class LinkedListDemo{
    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info = info;
            this.link = null;



        }
    }
    public Node first = null;

    public void InsertAtFirstNode(int info){
        Node newNode = new Node(info);
        if(first==null){
            first = newNode;
        }
        else{
            Node temp = first;
            first = newNode;
            first.link = temp;
        }
        



    }
    public Node last = null;

    public void InsertAtlastNode(int info){
        Node newNode = new Node(info);
        if(first==null){
            first = newNode;
        }
        else{
            Node last = first;
           while(last.link!=null){
            last = last.link;
           }
           last.link = newNode;
        }
        



    }
     public Node ordered = null;

    public void InsertAtorderedtNode(int info){
        Node newNode = new Node(info);
        if(first==null || newNode.info<=first.info){
            newNode.link = first;
            first = newNode;
            
        }
        else{
            Node current = first;
           while(current.link!=null && newNode.info>=current.link.info){
            current = current.link;
           }
           newNode.link = current.link;
            current.link = newNode;
        }
        



    }
    public void deletNode(int key){
       if(first==null){
        System.out.println("empty");
        
       }
       Node temp = first,prev = null;
       if(temp.info==key){
        first = temp.link;

       }
       while(temp!=null&& temp.info!=key){
        prev = temp;
        temp = temp.link;
       }
       if(temp ==null){
        System.out.println("node not found");
       }
       prev.link = temp.link;
    }
}       