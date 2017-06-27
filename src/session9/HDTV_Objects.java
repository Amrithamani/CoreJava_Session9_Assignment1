package session9;

import java.util.*;

//creating class for the size comparison implementing Comparator using Generic

class sizeComparator implements Comparator<HDTV> {

	@Override
	public int compare(HDTV o1, HDTV o2) {

		// comparing both objects sizes

		if (o1.getSize() < o2.getSize()) {
			return -1;
		} else {
			return 1;
		}

	}

}

// creating HDTV object classes to add value in ArrayList and sorting it

public class HDTV_Objects {

	public static void main(String args[]) {

		// declaring ArrayList signature using Generic HDTV class as object

		ArrayList<HDTV> obj = new ArrayList<HDTV>();

		// creating objects for HDTV class

		HDTV obj1 = new HDTV("SAMSUNG", 23);

		HDTV obj2 = new HDTV("LG", 33);

		HDTV obj3 = new HDTV("ACER", 27);

		// Adding all the objects in ArrayList

		obj.add(obj1);

		obj.add(obj2);

		obj.add(obj3);

		System.out.println("Before Sorting");
		// prints Before Sorting

		// declaring Iterator signature in HDTV collection items

		Iterator<HDTV> itr = obj.iterator();

		// declaring Iterator signature in HDTV collection items

		while (itr.hasNext()) {

			HDTV input = itr.next();
			System.out.println(input.getBrandName() + " " + input.getSize());

			/*
			 * prints SAMSUNG 23 LG 33 ACER 27
			 */

		}

		// sorting using collection class passing object and comparator class

		Collections.sort(obj, new sizeComparator());

		System.out.println("After Sorting");
		// prints After Sorting

		// declaring Iterator signature in HDTV collection items

		Iterator<HDTV> itr1 = obj.iterator();

		// declaring Iterator signature in HDTV collection items

		while (itr1.hasNext()) {

			HDTV input = itr1.next();
			System.out.println(input.getBrandName() + " " + input.getSize());

			/*
			 * SAMSUNG 23 ACER 27 LG 33
			 */

		}

	}

}
