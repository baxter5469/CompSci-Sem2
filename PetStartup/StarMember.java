import java.util.*;

public class StarMember {
  
  public static void main (String[] args){
  
  }
  
  ArrayList<Pet> pets = new ArrayList<Pet>();
  private boolean canScheduleApps;
  private int starPointsPerDollar;
  private int totalStarPoints;
  private double cashBack;
  private double cashBackMax;
  private int freeApps;
  public StarMember(){
      
  }
  public void whatLevel (String memberType){
    
    if (memberType.toLowerCase().equals("star")){
      canScheduleApps = false;
      starPointsPerDollar = 8;
      
    }
    
    if (memberType.toLowerCase().equals("superstar")){
    	canScheduleApps = true;
      starPointsPerDollar = 15;
  	}
  
  	 if (memberType.toLowerCase().equals("gold executive")){
    	canScheduleApps = true;
     	cashBack = 0.02;
  		cashBackMax = 100;
  		freeApps = 4;
  	}

		 if (memberType.toLowerCase().equals("gold executive")){
    	canScheduleApps = true;
     	cashBack = 0.05;
			cashBackMax = 200;
			freeApps = 12;
  	}
  
  }

	public void setStarPoints(int starPointsPerDollar){
    
    Scanner in = new Scanner(System.in);
  
    System.out.print("What is the total amount you spent on this purchase?: ");
    double total = in.nextDouble();
    totalStarPoints = starPointsPerDollar * (int) total;
      
  }
  
  public String getStarPoints(int totalStarPoints){
    String starP = "You earned " + totalStarPoints + " total Star Points!";
    return starP;
  }
  
  public double getCashBack(double total){
    double cashBackTotal = total * cashBack;
    return cashBackTotal;
  }
  
}