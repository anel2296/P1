package approach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dataGenerator.DataReader;
import interfaces.MySet;

public class Tarray<E> {

	public static Object[][][] Ts(int start, int finish) throws FileNotFoundException {
		Integer[][][] t = new Integer[20][50][];
		DataReader datas = new DataReader();
		for (int i=start; i<finish; i++) { 
			for (int j=0; j<50; j++) {

				String fileName = "F_" + i + "_" + j + ".txt"; 
				Scanner inputFile = new Scanner(new File("inputFiles", fileName)); 
				ArrayList<Integer> fileContent = new ArrayList<>(); 
				while (inputFile.hasNext())
					fileContent.add(inputFile.nextInt());
				inputFile.close();
				t[i][j] = (Integer[]) fileContent.toArray(new Integer[0]); 


			}
		}
		return t; 
	}



	public static <E> Object[][] ArrayX(Object[][][] a) throws FileNotFoundException{
		DataReader datas = new DataReader();
		Object[][][] t2 = new Integer[20][50][60];
		Object[][][] t1 = new Integer[20][50][];
		Object[][] t3 = new Integer[20][36];	
		t1=a;
		for(int k=0;k<20;k++) {
			for(int y=1;y<50;y++) {
				int x=0;
				for(int q=0;q<t1[k][y].length;q++) {
					if(Arrays.asList(t1[k][0]).contains(t1[k][y][q])) {
						if(!(Arrays.asList(t2[k][y]).contains(q))) {
							t2[k][y][x]=t1[k][y][q];	
							x++;
						}
					}
				}
			}
		}
		for(int r=0;r<20;r++) {
			for(int u=0; u<36;u++) {
				t3[r][u]=t2[r][49][u];}
			System.out.print("Set Intercept["+r+"] = ");
			datas.printArray((Integer[]) t3[r]);
		}

		return t3;
	}

	public MySet<E>[] Intercepts (Object[][] t3){
		MySet<E>[] iset = new MySet[20];
		for(int j=0;j<20;j++) {
			for(int i=0;i<t3[j].length;i++) {
				iset[j]=(MySet<E>) t3[j][i];
			}
		}
		System.out.println(iset);
		return iset;
	}
}