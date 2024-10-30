import java.util.Iterator;
import java.util.Scanner;
class Main{
public static void main(String args[]){
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Hourse");
animals.add("cat");
String element=animals.get(2);
System.out.println("Element at index 2:"+element);
Iterator<String>iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext()){
System.out.println(iterate.next());
System.out.println(",");
}
}
}
