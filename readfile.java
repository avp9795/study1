import java.io.*;

class readfile{
public static void main(String args[]){
int i;
try{
FileInputStream fi = new FileInputStream("s.txt");
FileOutputStream fo = new FileOutputStream("out.txt");
while((i=fi.read())!=-1){
System.out.print((char)i);
fo.write(i);
}
fi.close();
fo.close();
}
catch (IOException e){
System.out.print("can't read");
}

}}
