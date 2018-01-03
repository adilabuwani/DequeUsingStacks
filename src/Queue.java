//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 
public interface Queue<AnyType>
{
  int size();

  boolean isEmpty();

  AnyType first();

  void enqueue(AnyType newValue);

  AnyType dequeue();
}
