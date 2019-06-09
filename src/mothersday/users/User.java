package mothersday.users;

public class User
{

   private String name;
   private String email;
   private int password;

   public User(String name, String email, int password)  
   {
      this.name = name;
      this.password = password;
      this.email = email;
   }

   public boolean setPass(int newPass) 
   {
      this.password = newPass;
      return true;
   }  

   public boolean setName(String newName) 
   {
      this.name = newName;
      return true;
   }

   public boolean setEmail(String newEmail) 
   {
      this.email = newEmail;
      return true;
   }
 
   public String getName() 
   {
      return this.name;
   }

   public String getEmail() 
   {
      return this.email;
   }

   public boolean tryPass(int givenPass)
   {
      return givenPass == this.password;
   } 

   @Override
   public String toString()
   {
      return "I'm the Parent of users.";
   }
}
