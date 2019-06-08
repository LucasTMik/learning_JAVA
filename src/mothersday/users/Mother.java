package mothersday.users;
import mothersday.contracts.IDefaultUser;

public class Mother extends User implements IDefaultUser
{
    private User son;

    
   public User setSon(User son) 
   {
      return this.son = son; 
   }

    public Mother()
}