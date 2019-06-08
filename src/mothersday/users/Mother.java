package mothersday.users;
import mothersday.contracts.IDefaultUser;

public class Mother extends User implements IDefaultUser
{

    private String name;
    private int pass;
    private Son son;
    private Son asSon;

    public Mother(String name, String email, int pass) {
        super(name, email, pass);
    }

    public Son setSon(Son son) 
    {
        return this.son = son;
    }

    public Son getSon() 
    {
        return this.son;
    }

    @Override
    public Mother getMother()
    {
        return this.asSon.getMother();
    }

    @Override
    public boolean tryPass(int pass) 
    {
        System.out.println("Entrei");
        return true;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
