//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 

import java.util.Stack;

public class DequeUsingStacks<AnyType> implements Deque<AnyType>
{
  Stack<AnyType> back;
  Stack<AnyType> front;

  public DequeUsingStacks()
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
    	while(!back.isEmpty()){  //while front is not empty empty
    	front.push(back.pop());  //push all elements to back stack
    	}//end while
    	
    }//end if
    return front.peek();

  }

  public AnyType last()
  {
	  if(isEmpty()){
		  return null;
	  }
	  if(this.back.isEmpty()){
		  while(!this.front.isEmpty()){
			  back.push(front.pop());
		  }
	  }
	  return back.peek();
  }

  public void addFirst(AnyType newValue)
  {
   
	  this.front.push(newValue);
	  
  }

  public void addLast(AnyType newValue)
  {
	  this.back.push(newValue);

  }

  public AnyType removeFirst()
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

  }

  public AnyType removeLast()
  {
	  if(isEmpty()){
		  return null;
	  }
	  if(this.back.isEmpty()){
		  while(!this.front.isEmpty()){
			  back.push(front.pop());
		  }
	  }
	  return back.pop();

  }
}
