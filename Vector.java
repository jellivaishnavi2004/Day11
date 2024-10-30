import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("Hourse");
mammals.add(2,"cat");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("crocodile");
animals.addAll(mammals);
System.out.println("New Vector:"+animals);
}
}
