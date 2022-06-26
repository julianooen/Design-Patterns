package factory;

public class Pentagon implements Polygon{

	@Override
	public String myType() {
		
		return this.getClass().getName();
	}

}
