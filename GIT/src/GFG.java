import java.io.FileWriter; 
import java.io.IOException; 
import java.util.*;

class GFG { 
	public static void main(String[] args) 
		throws IOException 
	{ 
		String str = "ABC"; 
		try { 
			FileWriter fw = new FileWriter("myfile.txt"); 
			for (int i = 0; i < str.length(); i++) 
				fw.write(str.charAt(i)); 
			System.out.println("Successfully written"); 
			fw.close(); 
		} 
		catch (Exception e) { 
			e.getStackTrace(); 
		} 
	} 
}
