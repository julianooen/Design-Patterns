package factory;

public class PolygonFactory {
	
	public static Polygon createPolygon(Integer sides) {
		switch (sides) {
		case 3:
			
			return new Triangle();
		case 4:
			return new Square();
		case 5:
			return new Pentagon();
		default:
		
			break;
		}
		return null;
	}
	
}
