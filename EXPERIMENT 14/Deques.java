import java.util.*;
public class Deques{
public static void main(String[] args){

//Initializing Deque object
Deque<String> deque=new ArrayDeque<String>();

//Adding values
deque.add("a");
deque.add("b");
deque.add("c");
deque.add("d");
deque.add("e");

System.out.println("Elements in deque:");
for(String str:deque){
System.out.print(str +" ");
}
deque.addFirst("z");
System.out.println("\nAfter adding element at the front:");
for(String str:deque){
System.out.print(str +" ");
}

deque.addLast("f");
System.out.println("\nAfter adding element at last:");
for(String str:deque){
System.out.print(str +" ");
}
deque.remove();
System.out.println("\nAfter First Element is Deleted :");
for(String str:deque){
System.out.print(str+" ");
}
deque.clear();
deque.add("X");
System.out.print("\nAfter all Elements deleted :");
for(String str:deque)
{
System.out.print(str+"");
}
System.out.println();
}
}



