//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 

import java.util.Stack;

public class QueueUsingStacks<AnyType> implements Queue<AnyType>
{
  Stack<AnyType> back;
  Stack<AnyType> front;

  public QueueUsingStacks()
  {
    back = new Stack<>();
    front = new Stack<>();
  }

  public int size()   
  {
    return (this.front.size()+this.back.size());
  }

  public boolean isEmpty()  
  {
	return (this.front.isEmpty()&& this.back.isEmpty());  
	  
  }

  public AnyType first()
  {
	  if(this.isEmpty()){
		  return null;
	  }
    if(this.front.isEmpty()){       //worst case O(n) average case O(1)
    	while(!back.isEmpty()){  
    	front.push(back.pop());  
    	}//end while
    	
    }//end if
    return front.peek();
  }

  public void enqueue(AnyType newValue) 
  {
	  this.back.push(newValue);
  }

  public AnyType dequeue() 
  {
	  if(this.isEmpty()){
		  return null;
	  }
    if(this.front.isEmpty()){       //worst case O(n) average case O(1)
    	while(!back.isEmpty()){  //while front is not empty empty
    	front.push(back.pop());  //push all elements to back stack
    	}//end while
    	
    }//end if
    return front.pop();
  }//end dequeue
}//end queueUsingStacksClass
