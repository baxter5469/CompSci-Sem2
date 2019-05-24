import java.util.*;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<Product> cart = new ArrayList<Product>();
    Calendar today = Calendar.getInstance();
    today.set(2019,4,15);
    
    // instantiate 2 or more customers (different membership levels)
    StarMember member1 = new StarMember();
    member1.whatLevel("star");
    StarMember member2 = new StarMember();
    member2.whatLevel("superstar");
    
    // instantiate multiple dogs (some with shot records and some without) and associate them with the customers that own them
    String[] shots = {"vaccine#1","vaccine#2"};
    String[] food = // feed record contains date/time in yyyy/mm/dd hh:mm format
    Pet dog1 = new Pet("Bob",14254,199.99,5,{"yes","no","Yes"},{235,35,67,5})
    
    String[] shots2 = {};
    String[] food2 = // feed record contains date/time in yyyy/mm/dd hh:mm format
    Pet dog2 = //
    
    member1.addPet(dog1);
    member2.addPet(dog2);
    
    // instantiate multiple items
    ArrayList<Item> storeInventory = new ArrayList<Item>(); // Create an ArrayList of Item objects
    for(int i = 0; i < 7; i++){
      storeInventory.add(//
    }
    // add some items that are low in stock
    storeInventory.add(//
    storeInventory.add(//
    // add some perishables that are past their sell-by date
    storeInventory.add(//
    storeInventory.add(//
    
    // instantiate multiple sales
    double discount1 = Sales.bogof(// 
    double discount2 = Sales.bogof(//
    
    // output a list of items that are low stock
    System.out.println("Low in Stock: ");
    for(int i = 0; i < storeInventory.size(); i++){
      if(//
    }
    
    // output a list of items that are past their sell-by date
     System.out.println("Past Sell By: ");
    for(int i = 0; i < storeInventory.size(); i++){
      if(//
    }
    
    // instantiate 2 or more appointments (some successful and some that will generate output such as “Star Members can make item purchases only, no appointments” and “That appointment time is not available” and “A valid shot record is required to schedule that appointment”)
    if(dog1.hasShotRecord()){
      Appointment appointment = //
      Service grooming = //
      System.out.println("Service sign up success.");
      cart.add(grooming);
    } else{
      System.out.println("Service sign up failed.");
    }
    
    if(dog2.hasShotRecord()){
      Appointment appointment2 = //
      Service training = //
      System.out.println("Service sign up success.");
      cart.add(training);
    } else{
      System.out.println("Service sign up failed. Shot record needed.");
    }
    
    // create a shopping cart with multiple items (some sale items and some not on sale) and output:
    cart.add(toy);
    cart.add(toy);
    cart.add(cleaner);
    cart.add(cleaner);
    
    // print the individual prices for all items
    for(//
    
    // print the word "sale" and the amount of money saved
    System.out.printf("Sale: " + discount1,"10s");
    
    // print the total price for the shopping cart (don’t worry about tax)
    System.out.printf(

    
  }
}