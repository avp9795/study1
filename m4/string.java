import java.lang.*;
class string{
public static void main (String[] args){

String a = "abhijith";
String b = "   good    ";

System.out.println(a.equals(b)); // str1.equals(str2)

System.out.println(a.equalsIgnoreCase(b)); // str1.equals(str2) case ignored

System.out.println(a.length()); // string length

System.out.println(a.charAt(1));

System.out.println(a.toUpperCase()); // string change to upper case

System.out.println(a.replace("a","z")); // Replace old val with new val

System.out.println(b.trim()); // Trim white spaces from front and end

System.out.println(a.contains("a")); // check for a given value
}
}
