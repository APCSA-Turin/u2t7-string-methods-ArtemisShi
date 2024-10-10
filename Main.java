 import java.util.Scanner;


    public class Main {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           System.out.print("Enter first string: ");
String word1 = scan.nextLine();
System.out.println();
System.out.print("Enter second string: ");
String word2 = scan.nextLine();
System.out.println();
if (word1.length() == word2.length()){
    System.out.println("these words are the same length");
}
else{
if(word1.length()< word2.length()){
    System.out.println(word2 + " is longer than " +word1);
}

else{
System.out.println(word1 + " is longer than " + word2);
}
}

int w1half = word1.length()/2;
int w2half = word2.length()/2;
System.out.println("First half: "+word1.substring(0,w1half));
System.out.println("Second half: " +word1.substring(w1half));
System.out.println("First half: "+word2.substring(0,w2half));
System.out.println("Second half: " +word2.substring(w2half));
if(word1.indexOf(word2) == -1){
    System.out.println("You can't find " + word2+ " in " + word1);
}
else{
System.out.println("You can find " + word2 + " in " +word1 + " at " + word1.indexOf(word2));
           }
       }
    }
    
    

