package p1MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import dataGenerator.DataGenerator;

public class FilesGeneratorMain {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length <= 3) {
			int n = 20; 
			int m = 50; 
			int size = 50000; 
			if (args.length >= 1) 
				n = Integer.parseInt(args[0]); 
			if (args.length >= 2) 
				m = Integer.parseInt(args[1]); 
			if (args.length == 3) 
				size = Integer.parseInt(args[2]); 
			generateFiles(n, m, size); 
		} 
		else 
			System.out.println("Invalid number of parameters. Must be <= 2.");
 
	}

	private static void generateFiles(int n, int m, int size) throws FileNotFoundException {
		String ind = "inputFiles";  
		DataGenerator datas = new DataGenerator(n, m, size);
		Object[][][] setsLists = datas.generateData();  

		PrintWriter paramsFile = new PrintWriter(new File(ind, "parameters.txt")); 
		paramsFile.println(n); 
		paramsFile.println(m);   
		paramsFile.close();
		
		for (int i=0; i<n; i++)
			for (int j=0; j<m; j++) {
				String fileName = "F_" + i + "_" + j + ".txt"; 
				PrintWriter end = new PrintWriter(new File(ind, fileName)); 
				for (int k=0; k<setsLists[i][j].length; k++)
					end.println(setsLists[i][j][k]);
				end.close();
			}
	}
}
