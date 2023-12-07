import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DuplicateNumberException extends Exception {
    private static final long serialVersionUID = 1L;

	public DuplicateNumberException(String message) {
        super(message);
    }
}

public class Week14P2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] values = null;
		
        try {
			FileReader fileReader = new FileReader("ListOfNumbers.txt");
			BufferedReader br = new BufferedReader(fileReader);
            String line;
            
            while ((line = br.readLine()) != null) {
                values = line.split(",");

            }
            fileReader.close();
            
            for (int i = 0;i < values.length;i++) {
            	for (int j = i+1; j < values.length;j++) {
            		if (values[i].equals(values[j])) {
            			throw new DuplicateNumberException("duplicate number found: " + values[i]);
            		}
            	}
            }
            System.out.println("No duplicate numbers!");
            
			
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (DuplicateNumberException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
