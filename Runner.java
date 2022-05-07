import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		String folderLocation = "C:/Users/Matth/Downloads/takeout-20220507T015139Z-001/Takeout/Keep";
		
		File folder = new File(folderLocation);
		File[] listOfFiles = folder.listFiles();
		
		for (File file : listOfFiles) {
			
			String FN =file.getName(); 
			
		    if (file.isFile() && (FN.substring(file.getName().length() - 4, FN.length()).equals("json"))) {
		       
		        
		        FN="C:/Users/Matth/Downloads/takeout-20220507T015139Z-001/Takeout/Keep/"+FN;
		        
		        try {
		            File myObj = new File(FN);
		            Scanner myReader = new Scanner(myObj);
		            while (myReader.hasNextLine()) {
		              String data = myReader.nextLine();
		              System.out.println(data.split(",").length);
		              System.out.println(data);
		              String[] details=data.split(",");
		              if(details.length>8){
		            	  System.out.println("details[4] pre-processing: "+details[4]);
		      				System.out.println("details[5] pre-processing: "+details[5]);
		      			int over = details.length-8;
		      			for(int i=0;i<over;i++) {
		      				details[4]+=details[4+i];
		      				for(int j=0;j<over;j++) {
		      					details[5+j]=details[6+j];
		      				}
		      			}
	      				System.out.println("details[4] post-processing: "+details[4]);
	      				System.out.println("details[5] post-processing: "+details[5]);
		      		}
		              
		            }
		            myReader.close();
		          } catch (FileNotFoundException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		          }
		        
		        
		        System.out.println();
		    }
		}
		
	}

}
