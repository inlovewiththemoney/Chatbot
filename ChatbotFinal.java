import java.util.Scanner;
public class Chatbot
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello I am MMA bot, I like to talk about MMA. Ask me about fighters.");
    String entry = sc.nextLine();
    // Code to demonstrate interaction for MMA stuff
    int counter = 0;
    while (counter <= 0)
    {
      if (entry.indexOf("least favorite") >= 0)
      {
        System.out.println("My least favorite fighter at the moment is TJ Dillashaw.");
        entry = "Wo";
      
      }
      if (entry.indexOf("favorite fighter") >= 0)
      {
        System.out.println("My favorite fighter at the moment is GSP");
        
        entry = "Wo";
      }
      if (entry.indexOf("UFC") >= 0)
      {
        System.out.println("I love the UFC.");
        
        entry = "Wo";
      }
      if (entry.indexOf("other sports") >= 0)
      {
        System.out.println("I only like MMA.");
        
        entry = "Wo";
      }
      if (entry.indexOf("best") >= 0)
      {
        System.out.println("The best fighter is GSP");
        entry = "Wo";
      }
      
      else 
      {
      // code to to lead to a specific topic 
        System.out.println("Say something about MMA.");
        Scanner sc1 = new Scanner(System.in);
        String entry1 = sc1.nextLine();
        if (entry1.indexOf("least favorite") >= 0)
       {
         System.out.println("My least favorite fighter at the moment is TJ Dillashaw.");
         entry1 = "Wo";
       }
       if (entry1.indexOf("favorite fighter") >= 0)
       {
         System.out.println("My favorite fighter at the moment is GSP");
         entry1 = "Wo";
       }
       if (entry1.indexOf("UFC") >= 0)
       {
         System.out.println("I love the UFC.");
         entry1 = "Wo";
       }
       if (entry1.indexOf("other sports") >= 0)
       {
         System.out.println("I only like MMA.");
         entry1 = "Wo";
       }
       if (entry1.indexOf("GSP") >= 0)
       {
         System.out.println("Nice. I like him too.");
         entry1 = "Wo";
       }
       if (entry1.indexOf("Khabib") >= 0)
       {
         System.out.println("Nice. I like him too.");
         entry1 = "Wo";
       }
       else 
       {
        // Code to use when chatbot doesn't know what to say.
         System.out.println("I don't know what to say. Do you have a favorite fighter.");
         Scanner sc2 = new Scanner(System.in);
         String entry2 = sc2.nextLine();
         // code to ask for clarification and rephrase
         if (entry2.indexOf("no") >= 0);
         {
           System.out.println("What do you mean 'no'.");
           entry2 = "Wo";
         }
         
       }
      
      }
    }
  }

  
  


}
