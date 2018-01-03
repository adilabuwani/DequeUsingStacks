//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 

import java.io.*;
public class Assignment2 {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		String strLine="";
		//read from file
		FileInputStream fstream= new FileInputStream("assignment2.txt");
		br = new BufferedReader(new InputStreamReader(fstream));
		
		DequeUsingStacks<String>myDeque= new DequeUsingStacks<String>();
		
		DequeReader listReader=new DequeReader(myDeque);
		
		//read each line till not empty and do command
		while((strLine=br.readLine())!=null){
			listReader.doCommand(strLine);
		
		}//end while
		

	}

}
