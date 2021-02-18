import java.lang.*;
class thread{
public static void main(String args[]){

Thread t = Thread.currentThread();
System.out.println(t);

t.setName("Abhi");
t.setPriority(2);

System.out.println(t.getName());

System.out.println(t+"\n"+t.isAlive());



sleep s= new sleep();
s.mthd();
}
}

class sleep{

Thread t = Thread.currentThread();
public void mthd(){

try{
System.out.println("Inside sleep");

System.out.println(t);
for(int i =0; i<10; i++){
System.out.println(i);
t.sleep(1000);
}
}
catch(InterruptedException e){
System.out.println("caught");
}
}
}
