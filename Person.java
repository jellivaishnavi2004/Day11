class Person{
public void move(){
System.out.println("Person ");
}
}
class Student extends Person{
public void move()
{
System.out.println("Student");
}
}
class Faculty extends Person{
public void move()
{
System.out.println("Faculty");
}
}
class Test{
public static void main(String args[]){
Person a=new Person();
Person b=new Student();
Person c=new Faculty();

a.move();
b.move();
c.move();
}
}