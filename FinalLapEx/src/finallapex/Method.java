/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallapex;


public class Method {
    private Node head;

    public Method() {
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public boolean search(int data){
        return search(head,data);
        
    }
     private boolean search(Node head, int data) {
         Node helpPtr = head;
         while(helpPtr != null){
             if(helpPtr.getData() == data)
                 return true;
             helpPtr = helpPtr.getNext();
         }
         return false;
    }
     
     public Node findNode(int data){
         return findNode(head,data);
     }
       private Node findNode(Node head, int data) {
           Node helpPtr = head;
           while(helpPtr != null){
               if(helpPtr.getData() == data)
                   return helpPtr;
               helpPtr = helpPtr.getNext();
           }
         return null;  
    }
    
       public void printList(){
           printList(head);
       }
       private void printList(Node head){
           Node helpPtr = head;
           while(helpPtr != null){
               System.out.print(helpPtr.getData() + ",");
               helpPtr = helpPtr.getNext();
           }
           System.out.println();
       }
       
       public void modifayAllNode(){
           modifayAllNode(head);
       }
       private void modifayAllNode(Node head){
           Node helpPtr = head;
           while(helpPtr != null){
               
               helpPtr.setData(helpPtr.getData()+10);
               
              helpPtr= helpPtr.getNext();
           }
           
       }
       
       public int sumNode(){
           return sumNode(head);
       }
       private int sumNode(Node head){
           Node helpPtr = head;
           int sum = 0;
           while(helpPtr != null){
               sum+= helpPtr.getData();
               
               helpPtr = helpPtr.getNext();
           }
           return sum;
       }
       
       public void insert(int data){
           head = insert(head,data);
       }
       private Node insert(Node head , int data){
        if(head ==null||head.getData()>data){
            head = new Node (data,head);
        }else{
            Node helpPtr = head;
            while(helpPtr.getNext() != null){
                if(helpPtr.getNext().getData()>data)
                    break;
                helpPtr= helpPtr.getNext();
            }
            Node newNode = new Node(data,helpPtr.getNext());
            helpPtr.setNext(newNode);
        }
        return head;
       }
       
       public void delete(int data){
         head = delete(head,data);
       }
       private Node delete(Node head,int data){
            
           if(!isEmpty()){
               Node helpPtr = head;
               if(head.getData()==data){
                   head = head.getNext();
               }else
                   
                  while (helpPtr.getNext() != null){
                      if(helpPtr.getNext().getData()== data){
                          helpPtr.setNext(helpPtr.getNext().getNext());
                          break;
                      }
                      helpPtr = helpPtr.getNext();
                  }return head;
               
           }return head;
       }
       
       public int countNode(){
          return countNode(head);
       }
       private int countNode(Node head){
           int count = 0;
           Node helpPtr = head;
           if(!isEmpty()){
             while(helpPtr != null){
                count++;
                 helpPtr = helpPtr.getNext();
             }  
           }
           return count;
       }
       
       public void printAllEven(){
           printAllEven(head);
       }
       private void printAllEven(Node head){
           Node helpPtr = head;
           
               while(helpPtr != null){
                   
                 if(helpPtr.getData() %2==0){
                     System.out.print(helpPtr.getData()+",");
                 }
                     
                      helpPtr = helpPtr.getNext();
                 
                   }
                   System.out.println();
               
           }
       
       public void swapFirstLast(){
       swapFirstLast(head);
}
  private void swapFirstLast(Node head) {
      Node helpPtr = head;
      int headData = head.getData();
      int LnodeData = 0;
      int temp= 0;
      while(helpPtr.getNext() != null){
          helpPtr = helpPtr.getNext();
      }LnodeData = helpPtr.getData();
      
      temp = headData;
      headData = LnodeData;
      LnodeData = temp;
      
      head.setData(headData);
      helpPtr.setData(LnodeData);
    }
       public void countEvenOddNodes(){
        countEvenOddNodes(head);
     }
       
private void countEvenOddNodes(Node head) {
     int EvenNodes=0;
     int OddNodes=0;
     Node helpPtr = head;
     while(helpPtr != null){
         if(helpPtr.getData() % 2==0){
             EvenNodes++;
         }else{
             OddNodes++;
         }
         helpPtr = helpPtr.getNext();
     }

    System.out.println("Number of even nodes in the list is "+EvenNodes);
    System.out.println("Number of odd nodes in the list is "+OddNodes);
}

public void addNodeAfter (int data){
addNodeAfter (head, data);
}
private void addNodeAfter (Node head, int data){
    Node helpPtr = head;
    int newData = 0;
    boolean flag = false;
    while (helpPtr != null){
        if(helpPtr.getData()==data){
            newData = helpPtr.getData()*2;
            helpPtr.setNext(new Node(newData,helpPtr.getNext()));
            System.out.println("new nod add , have value "+newData);
             flag = true;
            break;
            
           
        }
        helpPtr = helpPtr.getNext();
    }
     if (!flag) {
            System.out.println("The givin value " + data + " can not find");}


}

public void deleteNodeAfter(int data){
deleteNodeAfter(head, data);
}
private void deleteNodeAfter(Node head, int data){
    Node helpPtr = head;
     boolean flag = false;
     while (helpPtr.getNext()!= null){
         if(helpPtr.getData()== data){
             helpPtr.setNext(helpPtr.getNext().getNext());
             System.out.println("The node after is deleted");
             flag = true;
             break;
         }
         
         helpPtr = helpPtr.getNext();
     }
     if (!flag) {
            System.out.println("The givin value " + data + " can not find");
}
}

    
    
    
    public int FindLargest(){
        return FindLargest(head);
    }

    private int FindLargest(Node head) {
        Node helpPtr = head;
        //int largest = head.getData();
        while(helpPtr.getNext() != null){
           helpPtr = helpPtr.getNext();
        }
        int largest = head.getData();
        return largest;
        
    }

  

   
    
}
