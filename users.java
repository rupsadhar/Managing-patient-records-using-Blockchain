
public class users {
	
	private String name;
	private String passswd;
	
	void setPass(String pass)
	{
		this.passswd = pass;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getPass()
	{
		return this.passswd ;
	}
	String getName()
	{
		return this.name ;
	}
	boolean validate(String a,String b)
	{
		if(a.equals(b))
			return true;
		return false;
	}
}
