package mothersday.users;
import mothersday.contracts.IDefaultUser;

public class Son extends User implements IDefaultUser
{
    public Son(String name, int password) {
        super(name, password);
    }
    
}