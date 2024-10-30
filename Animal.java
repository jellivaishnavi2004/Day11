class Person{
public void move(){
System.out.println("the person can move ");
}
}
class Student extends Person{
public void move()
{
System.out.println("the person can dance");
}
}
class Test{
public static void main(String args[]){
Person a=new Person();
Person b=new Student();
a.move();
b.move();
}
}