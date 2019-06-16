package mothersday.models;
import mothersday.contracts.IDefaultUser;

public class Son extends User implements IDefaultUser
{

    private Mother mother = null; 
    private Mother asMother = null;
    private Admin asAdmin = null;

    public Son(String name, String email, int pass) {
        super(name, email, pass);         
    }

    public boolean setAsAdmin(Admin adm) {
        try {
            this.asAdmin = adm;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Admin getAsAdmin() {
        return this.asAdmin;
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

    public boolean setMothersEmail(String email)
    {
        try {
            return this.mother.setEmail(email);
        } catch(Exception err) {
            System.out.println(err);
            return false;
        }
    }


    @Override
    public String toString() 
    {
        return "Son";
    }
}