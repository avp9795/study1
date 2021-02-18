class main{
public static void main(String[] args){

Thread t = Thread.currentThread();
t.setName("Main");
System.out.println(t);

childThread ct1 = new childThread();
ct1.start();
try{
for(int i=0; i<5; i++){
System.out.println(i);
t.sleep(1000);
}
}
catch(Exception e){
System.out.println("Caught");
}
}
}

class childThread extends Thread{

Thread th = Thread.currentThread();

public void run(){

th.setName("2nd  one");
System.out.println(th);

try{
for(int i=0; i<5; i++){
System.out.println(i);
th.sleep(1000);
}
}
catch(Exception e){
System.out.println("Caught");
}
}
}
