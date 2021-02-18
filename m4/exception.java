import java.io.*;

class exception{
public static void main(String[] args)throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println(br.readLine());

tryCatch t = new tryCatch();
t.mthd();

Throw th = new Throw();
th.mthd();
}
}

class tryCatch{

public void mthd (){
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(in);

System.out.println("In tr catch class");

try{
System.out.println((char)br.read());
}
catch(IOException e){
System.out.println("Exception caught!!");
}
finally{
System.out.println("Finally executed sucessfully");
}
}
}

class Throw{

public void mthd(){
ArithmeticException ae = new ArithmeticException();
throw ae;
}
}
