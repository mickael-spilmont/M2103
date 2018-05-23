package tests;

import java.time.DateTimeException;
import java.util.Scanner;

import tpException.FormatDateException;
import tpException.Manifestation;

public class TestManifestation {
	
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		String nom = "Truc";
		String debut = "12/05/2018";
		String fin = scaner.nextLine();
		
		try {
			Manifestation manifestation01 = new Manifestation(nom, debut, fin);
			System.out.println(manifestation01);
		}
		catch (DateTimeException dte) {
			System.out.println(dte);
		} catch (FormatDateException fde) {
			// TODO Auto-generated catch block
			System.out.println(fde);
		}
	}
}
