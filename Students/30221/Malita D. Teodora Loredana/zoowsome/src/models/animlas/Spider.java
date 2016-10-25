package models.animlas;

public class Spider extends Insect {
	private boolean beautiful;
	public Spider (String name, boolean beautiful){
		super(name, 8, false ,true);
		this.beautiful=beautiful;
	}
	public Spider (){
		super( "Unknown", 8, false ,true);
		this.beautiful=false;
	}
	public boolean getBeautiful()
	{
		return beautiful;
	}
	public void setBeautiful(boolean beautiful)
	{
		this.beautiful=beautiful;
	}

}
