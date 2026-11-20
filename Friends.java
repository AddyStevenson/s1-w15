import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<Name> friends = new ArrayList<Name>();
    Random rand = new Random();
   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
    friends.add(new Name("Adeline", "Rose", "Stevenson"));
    friends.add(new Name("Solmaz", "Violet", "Erami"));
    friends.add(new Name("Ruen", "Daisy", "Zhou"));


       // add three names to the ArrayList
   }
   
   public void printRandomFriend(){
    System.out.println(friends.get(rand.nextInt(2)+ 1));
       //return a random Name object from the List
    }
   
  
}