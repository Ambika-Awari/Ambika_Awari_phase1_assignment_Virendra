package package2;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class prctice {

	public static void main(String[] args) {
	
		 /*File file = new File("H:\\");*/
		/*String path="H:\\jjjjjjjjjjjjjjj";
		 String[] dirListing = null;
		 File dir = new File(path);
		 dirListing = dir.list();
		 Arrays.sort(dirListing);
		 System.out.println(Arrays.deepToString(dirListing));*/
		 /*File[] files = directory.listFiles();

		 Arrays.sort(files, new Comparator<File>(){
		     public int compare(File f1, File f2)
		     {
		         return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
		     } });*/
		
		  Scanner scanner = new Scanner( System.in );
          System.out.println("Enter the file path: ");
          String dirPath = scanner.nextLine(); // Takes the directory path as the user input

          File folder = new File(dirPath);
          File[] fileList = folder.listFiles();

          Arrays.sort(fileList);

          System.out.print(Arrays.deepToString(fileList));
          
	}

}
