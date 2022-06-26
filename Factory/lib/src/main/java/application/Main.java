package application;

import factory.Polygon;
import factory.PolygonFactory;

public class Main {

	public static void main(String[] args) {

		Polygon newP = PolygonFactory.createPolygon(4);

		System.out.println(newP.myType());

	}

}
