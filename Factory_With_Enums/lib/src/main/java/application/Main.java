package application;

import factory.Polygon;
import factory.PolygonFactoryEnums;

public class Main {

	public static void main(String[] args) {

		Polygon newP = PolygonFactoryEnums.TRIANGLE.createPolygon();

		System.out.println(newP.myType());

	}

}
