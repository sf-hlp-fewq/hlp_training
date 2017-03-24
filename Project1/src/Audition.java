import java.util.Scanner;

public class Audition {
	private String type; // instance variable 
	private int id; // instance variable
	private String style; // instance variable
	private char key; // instance variable

	   // Audition constructor that receives two parameters  
	   public Audition(String type, int id, String style, char key) 
	   {
	      this.type = type; // assign type to instance variable type
	      this.id = id;
	      this.style = style;
	      this.key = key;
	   }
	   
	   // method returns audition type (performer/vocalist/dancer)
	   public String getType()
	   {
	      return type; 
	   }
	   // method returns audition union id
	   public int getId()
	   {
		   return id;
	   }
	   // method returns audition style (if dancer)
	   public String getStyle()
	   {
		   return style;
	   }
	   // method returns audition key (if vocalist)
	   public char getKey()
	   {
		   return key;
	   }
	   
	   // method that prints audition according to performer type
	   public void perform()
	   {
		   if (type.equals("performer")){
			 //print [id]-performer
			   System.out.printf("%d - %s",id,type);
		   } else if(type.equals("dancer")){
			 //print [style]-[id]-dancer
			   System.out.printf("%s - %d - %s",style,id,type);
		   } else if(type.equals("vocalist")){
			 //print I sing in the key of -[key]-[id]
			   System.out.printf("I sing in the key of - %c - %d%n",key,id);
			   System.out.println("Specify volume?");
			   Scanner input = new Scanner(System.in);
			   String specifyVolume = input.nextLine();
			   if (specifyVolume.equals("yes")){
				   System.out.println("What volume?");
				   int volume = input.nextInt();
				   //print I sing in the key of - [key] - at volume [volume] - [id]
				   System.out.printf("I sing in the key of - %c - at volume %d - %d",key,volume,id);
			   }
		   }
		   System.out.printf("%nNext Audition?%n");
	   }
}
