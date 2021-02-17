import java.util.*;

class Employee{
int age;
String name;
int salary;

Employee(int age,String name,int salary){
this.name = name;
this.age = age;
this.salary = salary;
}
}
class arrayList{
public static void main (String args[]){
ArrayList<Integer> arr = new ArrayList<Integer>(); // generic
arr.add(100);
arr.add(200); //add
System.out.println("Array size is "+arr.size());//size
System.out.println("Element at index 0 "+arr.get(0));//get(index)
arr.set(0,1); //set(index,element to add)
arr.remove(0);//remove(index)
System.out.println("Element at index 0 "+arr.get(0));

// Array list to add objects.

ArrayList<Employee> elist = new ArrayList<Employee>();

Employee e1 = new Employee(12,"abhi",1000);
Employee e2 = new Employee(22,"binu",2000);
Employee e3 = new Employee(33,"athul",3000);
Employee e4 = new Employee(44,"kamal",4000);

elist.add(e1);
elist.add(e2);
elist.add(e3);
elist.add(e4);

// Iterator
Iterator<Employee> it = elist.iterator();
while(it.hasNext()){
Employee emp = it.next();
System.out.println(emp.name+"  "+emp.age+"  "+emp.salary);
}
}
}
