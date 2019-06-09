package mothersday.contracts;

import mothersday.users.*;

public interface IDefaultUser 
{
    public String getEmail();
    // public boolean setName();
    // public boolean setPass(); 
    public boolean tryPass(int pass);
}