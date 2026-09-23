
package finallapex;

import java.util.Scanner;


public class FinalLapEx {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int choice;

        // Do/while loop showing menu, getting user choice, and performing actions
        do {
            // Show menu and get user choice
            showMenu();
            choice = input.nextInt();

            //Option 1: Reversing the elements of stack using queue
            if (choice == 1) {

                //Storing elements in the stack
                StackLL s1 = new StackLL();
                for (int i = 1; i < 9; i++) {
                    s1.push(i);
                }
                //Printing the elements of Stack before reversing
                System.out.println("Elements of Stack S1 BEFORE reversing are: ");
                s1.PrintStack();
                System.out.println("");
                //Reversing the elements of the stack using Queue Q1
                QueueLL q1 = new QueueLL();

// ******************************************** WRITE YOUR CODE HERE TO SOLVE QUESTION 1 (Choice 1)**********************//
//write code here to reverse the elements of the Stack s1 by using Queue q1 for this purpose. 
//You can use only ‘pop’, ‘push’, ‘enqueue’ and ‘dequeue’ methods.
         while(!s1.isEmpty()){
                 q1.enqueue(s1.pop().getData());
                 
         }
         while(!q1.isEmpty()){
             s1.push(q1.dequeue().getData());
         }

                

// ***********************************************************************************************************************************//
                //Printing the elements of Stack after deleting any element 
                System.out.println("Elements of Stack S1 AFTER reversing are: ");
                s1.PrintStack();
                System.out.println();
                System.out.println();
                }   
                
                
            
            //Option 2: Deleting ODD element of stack using another stack
            else if (choice == 2) {

                //Storing elements in the stack
                StackLL s1 = new StackLL();
                for (int i = 1; i < 9; i++) {
                    s1.push(i);
                }
                //Printing the elements of Stack before deleting any element 
                System.out.println("Elements of Stack S1 BEFORE deleting ODD element are: ");
                s1.PrintStack();
                System.out.println("");
// ******************************************** WRITE YOUR CODE HERE TO SOLVE QUESTION 2 (Choice 2)**********************//
//Write code here to delete the ODD elements of the Stack s1 by using another Stack s2. 
//You can use only ‘pop’ and ‘push’ methods for this purpose.

                   StackLL s2 = new StackLL();
                   while(!s1.isEmpty()){
                       s2.push(s1.pop().getData());
                   }
                 while(!s2.isEmpty()){
                     int number = s2.pop().getData();
                     if(number%2==0){
                     s1.push(number);
            }
                 }






// ***********************************************************************************************************************************//
                //Printing the elements of Stack after deleting any element 
                System.out.println("Elements of Stack S1 AFTER deleting ODD element are: ");
                s1.PrintStack();
                System.out.println("");
                System.out.println("");
            }  
                
                
                
            
            //Option 3: 
            else if (choice == 3) {

// ******************************************** WRITE YOUR CODE HERE TO SOLVE QUESTION 3 (Choice 3)**********************//
//Write code here to take 8 values from user at run time and then call MultiplyDivisibleBy4() method. 
//Print the counter and the stack before and after applying the method.   



                System.out.println(">     please enter 8 integere values : ");
                StackLL s1 = new  StackLL();
                for(int i = 0; i<8;i++){
                    s1.push(input.nextInt());
                }
                
                System.out.println("Element of stack S1 BEFORE are:");
                s1.PrintStack();
                System.out.println();
                
                s1.MultiplyDivisibleBy4();
                System.out.println("Element of stack S1 AFTER are: ");
                s1.PrintStack();
                System.out.println();
                
                System.out.println("Number of Divisibal By 4 values :"+s1.MultiplyDivisibleBy4());
               

                
// ***********************************************************************************************************************************//
                
                System.out.println();
                System.out.println();
            } 

            
            
            
            
            //Option 4: 
            else if (choice == 4) {

// ********************************* WRITE YOUR CODE HERE TO SOLVE QUESTION 4 (Choice 4)*********************************//
//Write code here to take 8 values from the user at run time, print the data you got.  
//Then, apply CountPositiveNegative() on it and show the result.

 System.out.println(">     please enter 8 integere values : ");
               QueueLL q1 = new QueueLL();
                for(int i = 0; i<8;i++){
                    q1.enqueue(input.nextInt());
                }
                
                System.out.println("Element of Queue Q1 are :");
                q1.PrintQueue();
                
                System.out.println();
                
                int count[]=q1.CountPositiveNegative();
                System.out.println("Number of positive values : "+count[0]);
                System.out.println("Number of negitive values : "+count[1]);
                System.out.println("Number of Zero values : "+count[2]);
                









//***********************************************************************************************************************************//
                
                System.out.println();
                System.out.println();
            } 
            
            
            // Quit
            else if (choice == 5) {
                System.out.println(">    Goodbye!");
                System.out.println();
            } else {
                System.out.println(">    Wrong selection. Try again.");
                System.out.println();
            }

        } while (choice != 5);
    }

    
    public static void showMenu() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|---------------     Queue - Stack (Menu)    ----------------|");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|   1. Reverse Elements of Stack (using Queue Q1)            |");
        System.out.println("|   2. Delete Odd Elements of Stack (Use Stack S2)           |");
        System.out.println("|   3. Multiply the Value of Stack if it is Divisible by 4   |");
        System.out.println("|   4. Count Positive, Negative, and Zero Values of the Queue|");
        System.out.println("|   5. Quit                                                  |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println();
        System.out.print("> Please enter your choice: ");
    }
}
