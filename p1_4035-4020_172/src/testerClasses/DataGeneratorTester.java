package testerClasses;

import dataGenerator.DataGenerator;

public class DataGeneratorTester {

	public static void main(String[] args) {
		int totalSize = 2000; 
		int n = 20, m = 10; 
		DataGenerator datas = new DataGenerator(n, m, totalSize);
		datas.generateData(); 
		datas.printSizes();
		datas.printSets();
	}

}