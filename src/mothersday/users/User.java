package mothersday.users;

public class User
{

   private String name;
   private String email;
   private int password;
   private Son asSon;
   private Mother asMother;
   private Admin asAdmin;

   public User(String name, String email, int password, Son defaultUser) {
      this.name = name;
      this.password = password;
      this.email = email;
      this.asSon = defaultUser;
   }

   public String getName() { return this.name; }
   public String getEmail() { return this.email; }
   public String setName(String newName) { this.name = newName; return this.name; }
   public String setEmail(String newEmail) { this.email = newEmail; return this.email; }
   public void setPass(int pass) { this.password = pass; }

   public Son getAsSon() { return this.asSon; }
   public Mother getAsMother() { return this.asMother; }
   public Admin getAsAdmin() { return this.asAdmin; }
}