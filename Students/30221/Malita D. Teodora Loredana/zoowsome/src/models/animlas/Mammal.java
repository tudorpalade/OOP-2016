package models.animlas;

public abstract class Mammal extends Animal{
	protected float bodyTemp;
	protected boolean isDangerous;
	public Mammal (float bodyTemp, boolean isDangerous, String name, int nrOfLegs){
		super(name,nrOfLegs);
		this.bodyTemp=bodyTemp;
		this.isDangerous=isDangerous;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	public float getBodyTemp ()
	{
		return bodyTemp;
	}
	public void setBodyTemp (float bodyTemp)
	{
		this.bodyTemp=bodyTemp;
	}

}
