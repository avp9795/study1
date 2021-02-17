class main{
public static void main(String[] args){
abhi n = new abhi();
n.check();
n.show();
}
}

abstract class a{
public void show(){
System.out.println("show");
}
public abstract void check();
}

class abhi extends a{

public void check(){
System.out.println("abs");
}
}



