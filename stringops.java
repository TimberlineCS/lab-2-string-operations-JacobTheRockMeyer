
public class stringops{
public static void main(String args[]){
String word = "popcorn";
int len = word.length();
int scrmblLength = len/2;
String scrambled1 = word.substring (0,scrmblLength);
String scrambled2 = word.substring (scrmblLength);
System.out.print(scrambled2+scrambled1);

}

}
