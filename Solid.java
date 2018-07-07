
public abstract class Solid{
	protected float Volume;
	protected float Tsa;
	protected float Csa;
	
	abstract void setVolume();
	abstract void setTsa();
	abstract void setCsa();
	public void getTsa(){
			System.out.println("the tsa is "+Tsa);
	}
	public void getCsa(){
		System.out.println("the csa is "+Csa);
	}
}



