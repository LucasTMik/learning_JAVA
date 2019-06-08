package mothersday.users;

public class User
{

   private String name;
   private int password;
   private User asMother;
   private User asSon;
   private User asAdmin;

   public User(String name, int password) 
   {
      this.name = name;
      this.password = password;
   }

   public User setAdmin(User admin) 
   {  
      return this.asAdmin = admin; 
   }

   public User setMother(User mother)
   {
      return this.asMother = mother;
   }

   @Override
   public String toString()
   {
      return "I'm the Parent of users.";
   }
}