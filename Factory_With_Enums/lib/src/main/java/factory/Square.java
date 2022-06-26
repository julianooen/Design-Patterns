package factory;

public class Square implements Polygon{

	@Override
	public String myType() {
		
		return this.getClass().getName();
	}

}
