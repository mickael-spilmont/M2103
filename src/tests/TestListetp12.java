package tests;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp12Interfaces.Fraction;
import tp12Interfaces.MillitaryComparator;

public class TestListetp12 {

//	Interface List
	public static void main(String[] args) {
//		List<Fraction> fractions = new LinkedList<>();
//		
//		fractions.add(new Fraction(10, 5));
//		fractions.add(new Fraction(2, 15));
//		fractions.add(new Fraction(8, 4));
//		fractions.add(new Fraction(18, 11));
//		fractions.add(new Fraction(15, 20));
//		
//		System.out.println(fractions);
//		
//		Collections.sort(fractions);
//		
//		System.out.println(fractions);
//		
////		Interface Iterable
//		for (Fraction fraction : fractions) {
//			System.out.println(fraction);
//		}
//		
//		Iterator<Fraction> iterateur = fractions.listIterator();
//		while (iterateur.hasNext()) {
//			System.out.println(iterateur.next());
//		}
		
//		Interface Ordre Militaire
		List<String> chaines = new ArrayList<>();
		
		chaines.add("truc");
		chaines.add("bidulle");
		chaines.add("chose");
		chaines.add("avion");
		chaines.add("?");
		
		MillitaryComparator mc = new MillitaryComparator();
		Collections.sort(chaines, mc);
		System.out.println(chaines);
		
		Collections.sort(chaines, mc.reversed());
		System.out.println(chaines);
	}
}
