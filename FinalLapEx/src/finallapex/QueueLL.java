/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallapex;

/**
 *
 * @author sdoom
 */
public class QueueLL {
     // top: reference variable to the top of the stack (same as "head" of linked list)

    private Node front;
    private Node back;

    // CONSTRUCTOR
    public QueueLL() {
        front = null;
        back = null;
    }

    public int[] CountPositiveNegative () {
        return CountPositiveNegative(front);
    }

    //************************************************************************************************************
    //Write code to Count and RETURN an array that contains the count of Positives, Negatives and Zeros value nodes of the Queue. 
    //************************************************************************************************************
    private int[] CountPositiveNegative(Node front) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        Node helpPtr = front;
        
        while(helpPtr != null){
            
            if(helpPtr.getData()>0){
                pos++;
            }else if(helpPtr.getData()<0){
                neg++;
            }else{
                zero++;
            }
                
            
            helpPtr = helpPtr.getNext();
        }
     
        int count[]={pos,neg,zero};
        
        
        
        return count ; //Change this statement after completing your code
    }
//


    
    /* Below are MANY methods that are used on stacks.
	 * 
	 * Examples:
	 * isEmpty, PUSH, POP, PEEK, and more.
     */
    
    // boolean | isEmpty()
    public boolean isEmpty() {
        return front == null;
    }

 
    // void | PrintQueue()
    public void PrintQueue() {
        PrintQueue(front);
    }
   
    // void | PrintQueue(Node)
    private void PrintQueue(Node front) {
        // We need to traverse...so we need a help ptr
        Node helpPtr = front;
        // Traverse to correct insertion point
        while (helpPtr != null) {
            // Print the data value of the node
            System.out.print(helpPtr.getData() + ", ");
            // Step one node over
            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }

   
    // boolean | search(int)
    public boolean search(int data) {
        return search(front, data);
    }
    
    // boolean | search(QueueNode, int)
    private boolean search(Node p, int data) {
        // To search, we must traverse. Therefore, we need helpPtr.
        Node helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getData() == data) {
                return true;
            }
            helpPtr = helpPtr.getNext(); // step one node over		
        }
        return false;
    }

    
    // void | enqueue(int)
    public void enqueue(int data) {
        if (isEmpty()) {
            front = back = enqueue(front, back, data);
        } else {
            back = enqueue(front, back, data);
        }

    }
    
    // QueueNode | enqueue(QueueNode, QueueNode, int)
    private Node enqueue(Node front, Node back, int data) {
        // Make a new QueueNode with "data" as the data value
        Node temp = new Node(data);
        // Now, if the list is empty, return the reference for temp
        // and save this reference into both "front" and "back"
        // Why? Since this is the only node in the queue, it will be the front and back node
        if (isEmpty()) {
            return temp;
        } // ELSE, the queue is not empty. We need to insert temp at the back of the queue.
        // So save the address of the new node into the next of back.
        // Then, make back "traverse" one node over, so it now points to the new back node.
        // Finally, return the updated address of back.
        else {
            back.setNext(temp);
            back = back.getNext();
            return back;
        }
    }

    
    // QueueNode | dequeue()
    public Node dequeue() {
        Node temp = front;
        front = dequeue(front);
        if (front == null) {
            back = null;
        }
        return temp;
    }
    
    // QueueNode | dequeue(QueueNode)
    private Node dequeue(Node front) {
        front = front.getNext();
        return front;
    }

    
    // int | peek()
    public int peek() {
        // Invoke the peek method with front as a parameter
        int frontValue = peek(front);
        // return topValue
        return frontValue;
    }
    
    // int | peek(QueueNode)
    private int peek(Node front) {
        // Return the data value of the front node.
        // You can see that we do NOT dequeue. We are only returning the data value.
        return front.getData();
    }

}