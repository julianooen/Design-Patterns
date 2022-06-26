package factory;

public enum PolygonFactoryEnums {
	TRIANGLE {
		@Override
		public Polygon createPolygon() {
			return new Triangle();
		}
	},
	SQUARE {
		@Override
		public Polygon createPolygon() {
			return new Square();
		}
	},
	PENTAGON {
		@Override
		public Polygon createPolygon() {
			return new Pentagon();
		}
	};
	
	public abstract Polygon createPolygon();
}
