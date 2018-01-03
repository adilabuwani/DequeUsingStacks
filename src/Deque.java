//Name:Adil Abuwani
//Email: adil.abuwani@outlook.com
//CSCI 313 PROJECT2
//PROFESSOR: Svitak 

public interface Deque<AnyType>
{
  int size();

  boolean isEmpty();

  AnyType first();

  AnyType last();

  void addFirst(AnyType newValue);

  void addLast(AnyType newValue);

  AnyType removeFirst();

  AnyType removeLast();
}
