import java.io.*;

class io{
public static void main(String[]args){
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try{
System.out.println(br.readLine());
}
catch(Exception e){
System.out.println("fucked");
}
}
}
