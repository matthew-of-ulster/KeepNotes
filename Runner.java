import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
		        
		        ArrayList<Note> noteList = new ArrayList<>();
		        
		        try {
		            File myObj = new File(FN);
		            Scanner myReader = new Scanner(myObj);
		            while (myReader.hasNextLine()) {
		              String data = myReader.nextLine();
		              Note tempNote = new Note(data);
		              noteList.add(tempNote);
		              
		            }
		            myReader.close();
		          } catch (FileNotFoundException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		          }
		        
		        for(Note n:noteList) {
		        	//System.out.println(n.getTitle());
		        	//System.out.println(n.getColor() + " "+ n.isTrashed());
		        	System.out.println();
		        }
		        //System.out.println();
		    }
		}
		
	}

}
