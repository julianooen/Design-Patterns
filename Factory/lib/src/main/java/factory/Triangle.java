package factory;

public class Triangle implements Polygon{

	@Override
	public String myType() {
		
		return this.getClass().getName();
	}

}
