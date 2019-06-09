package mothersday.users;
import mothersday.contracts.IDefaultUser;

public class Son extends User implements IDefaultUser
{

    private Mother mother;
    private Mother asMother;

    public Son(String name, String email, int pass) {
        super(name, email, pass);         
    }

    public Mother setAsMother(Mother asMother) 
    {   
        this.asMother = asMother;
        return this.asMother;
    }

    public Mother setMother(Mother mother) 
    {   
        return this.mother = mother;
    }

    public Mother getMother() 
    {
        return this.mother;
    }

    public Mother getAsMother() 
    {
        return this.asMother;
    }

    public boolean setMothersName(String name)
    {
        try {
            return this.mother.setName(name);
        } catch(Exception err) {
            System.out.println(err);
            return false;
        }
    }

    public void setMothersPass(int pass)  
    {
        try {
            this.mother.setPass(pass);
        } catch(Exception err) {
            System.out.println(err);
        }
    }


    @Override
    public String toString() 
    {
        return "Son";
    }
}