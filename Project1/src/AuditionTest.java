import java.util.Scanner;

public class AuditionTest {
	public static void main(String[] args) 
	   {
	      Audition audition1 = new Audition("performer", 321, "n/a", '0');
	      Audition audition2 = new Audition("dancer", 471, "tap", '0');
	      Audition audition3 = new Audition("performer", 206, "n/a", '0');
	      Audition audition4 = new Audition("vocalist", 549, "n/a", 'G');
	      Audition audition5 = new Audition("dancer", 438, "ballet", '0');
	      Audition audition6 = new Audition("performer", 946, "n/a", '0');
	      Audition audition7 = new Audition("performer", 847, "n/a", '0'); 
	      
	      Scanner input = new Scanner(System.in);
	      System.out.println("Peformers ready. Begin audition?");
	      String beginAudition = input.nextLine();
	      
	      if (beginAudition.equals("yes")) {
	    	  audition1.perform();
	    	  }
	      
		  String auditionTwo = input.nextLine();
    	  if (auditionTwo.equals("yes")){
    		  audition2.perform();
	      }

		  String auditionThree = input.nextLine();
    	  if (auditionThree.equals("yes")){
    		  audition3.perform();
	      }
    	  
		  String auditionFour = input.nextLine();
    	  if (auditionFour.equals("yes")){
    		  audition4.perform();
	      }
    	  
		  String auditionFive = input.nextLine();
    	  if (auditionFive.equals("yes")){
    		  audition5.perform();
	      }
    	  
		  String auditionSix = input.nextLine();
    	  if (auditionSix.equals("yes")){
    		  audition6.perform();
	      }
    	  
		  String auditionSeven = input.nextLine();
    	  if (auditionSeven.equals("yes")){
    		  audition7.perform();
	      }
	   }
}
