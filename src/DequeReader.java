//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 

public class DequeReader {
	
private DequeUsingStacks<String>myDeque;
private String firstLine="";
private String command="";
private String assign="";

	//constructor
	public DequeReader(DequeUsingStacks<String>list){
		this.myDeque=list;
		this.firstLine="";
		this.command="";
		this.assign="";
	}
	
	//mutator
	private void setFirstLine(String f){
		this.firstLine=f;
		firstLine=firstLine.trim();  //eliminate leading and trailing spaces
	}
	
	private void setCommand(String f){
		String []temp=firstLine.split(" ");  //split the line
		this.command=temp[0]; //first index holds the desired command
		this.command=command.toLowerCase(); //set command to lowercase
		
		if(temp.length!=1){  //command also has assignment
			for(int i=1;i<temp.length;i++){
				this.assign=assign+ temp[i];
				if (i<temp.length-1){this.assign = assign + " ";}//set assign rhs
			}
		}
	}
	
	//accessors
	private String getFirstLine(){
		return this.firstLine;
	}
	
	private String getCommand(){
		return this.command;
	}
	
	public String getAssign(){
		return this.assign;
	}
	
	private void clearAssign(){
		this.assign=new String();
	}
	
	private void clearCommand(){
		this.command=new String();
	}
	
	
	public void doCommand(String fLine){  //do command from the first line

		this.setFirstLine(fLine);  //set the first line
		this.setCommand(fLine);   //set command
		
	     if(this.command.contains("size")){
			size();	
		}else if(this.command.contains("empty")){
			empty();
		} else if(this.command.equals("first")){
			first();  
		}else if(this.command.equals("last")){
			last();
		}else if(this.command.equals("add_first")){
		   addFirst(assign);
		}else if(this.command.equals("add_last")){
			addLast(assign);
		}else if(this.command.equals("remove_first")){
			removeFirst();
		}else if(this.command.equals("remove_last")){
			removeLast();
		}
		else{
			return;    //do nothing
		}
		
		this.clearAssign();    //clear assign
		this.clearCommand();  //clear command
		
	}// end do command

private void size(){
	System.out.println("The Deque contains "+myDeque.size()+" Strings. \n");
}	

private void empty(){
	if(myDeque.isEmpty()){
		System.out.println("The Deque is empty. \n");
	}else{
		System.out.println("The Deque is not empty. \n");
	}
}

private void first(){
	if(this.myDeque.first()!=null){
	System.out.println("The String at the front of the deque is \""+this.myDeque.first()+"\"\n");
	}else{
	System.out.println("The Deque was empty\n");
	}
}

private void last(){
	if(this.myDeque.first()!=null){
		System.out.println("The String at the back of the deque is \""+this.myDeque.last()+"\"\n");
		}else{
		System.out.println("The Deque was empty\n");
		}
}

private void addFirst(String assignValue){
	this.myDeque.addFirst(assignValue);
	System.out.println("Added the string \""+assignValue+ "\" to the front of the deque. \n");
	this.clearAssign();
}

private void addLast(String assignValue){
	this.myDeque.addLast(assignValue);
	System.out.println("Added the string \""+assignValue+ "\" to the back of the deque. \n");
	this.clearAssign();

}
private void removeFirst(){
	if(this.myDeque.first()!=null){
		System.out.println("Removed the string \""+this.myDeque.removeFirst()+"\" from the front of the Deque\n");
		}else{
			System.out.println("The Deque was empty\n");
		}
}

private void removeLast(){
	if(this.myDeque.first()!=null){
		System.out.println("Removed the string \""+this.myDeque.removeLast()+"\" from the back of the Deque\n");
		}else{
		System.out.println("The Deque was empty\n");
		}
}

}
