package mothersday.users;
import mothersday.contracts.IDefaultUser;

public class Mother extends User implements IDefaultUser
{
    public Admin() {
        System.out.println("Hi im a Mother");
    }
}