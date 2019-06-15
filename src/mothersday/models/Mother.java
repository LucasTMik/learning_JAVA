package mothersday.models;
import mothersday.contracts.IDefaultUser;

public class Mother extends User implements IDefaultUser
{

    private String name;
    private int pass;
    private Son son;
    private Son asSon;

    public Mother(String name, String email, int pass, Son motherAsSon) {
        super(name, email, pass);
        this.asSon = motherAsSon;
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
    public String toString() {
        return this.getName();
    }
}
