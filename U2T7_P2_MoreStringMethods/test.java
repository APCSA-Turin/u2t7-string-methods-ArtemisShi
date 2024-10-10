package U2T7_P2_MoreStringMethods;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int score = 0;
    int tries = 0;
    System.out.print("Enter your first wor2d: ");
String word1 = scan.nextLine();
System.out.print("Enter your next word: ");
String word2 =scan.nextLine();
if (word1.compareTo(word2) < 0){
    score += 2;
    System.out.println("+2: " + word2 + " > " + word1 + " althebetically;");
    if(word1.substring((word1.length()-2)).equals(word2.substring(0,2))){
    score += 5;
    System.out.println("+5: starting \"" + word2.substring(0,2) + "\" of " + word2 + " are the last two letters of " + word1);
    if(word2.indexOf(word1.substring(0,1))>0){
        score+=3;
        System.out.println("+3: starting \"" + word1.substring(0,1) + "\" of " + word1 + " is found in " + word2);
    }
    }
}
System.out.println(word2.indexOf(word1.substring(0,1)));
boolean e =(word2.indexOf(word1.substring(0,1))>0);
System.out.println(e);
    }
}
    

    
