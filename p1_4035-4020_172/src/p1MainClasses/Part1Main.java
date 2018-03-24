package p1MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import approach.P1P2;
import approach.Tarray;
import dataGenerator.DataGenerator;
import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;

public class Part1Main<E> {
	
	public static <E> void main(String[] args) throws FileNotFoundException {
		P1P2 p12 = new P1P2(null);
		Tarray ta = new Tarray();
		ta.ArrayX(ta.Ts(0, 20));
	}
}
