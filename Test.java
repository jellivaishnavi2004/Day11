import java.util.Scanner;
class Polymorphism{
    void print(){
        System.out.println("welcome");
}
void print(String n)
{
 System.out.println("welcome"+n);
}
}
class Test{
    public static void main(String args[]){
        Polymorphism ob1=new Polymorphism();
        ob1.print();
        Scanner sc=new Scanner(System.in);
        System.out.println("please type your name");
        String s=sc.next();
        

}
    }

