class childThread implements Runnable{

public void run(){

Thread th = Thread.currentThread();

try{
for(int i=0;i<10;i++){
System.out.println(i);
th.sleep(1000);
}
}
catch (Exception e){
}
}
}


class main{
public static void main(String args[]){

//childThread ch = new childThread();
//Thread t= new Thread(ch);

Thread t= new Thread(new childThread());

t.start();


Thread th1 = Thread.currentThread();

try{
for(int i=0;i<10;i++){
System.out.println(i);
th1.sleep(500);
}
}
catch (Exception e){
}
}
}

