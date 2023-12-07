import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PositiveNumberException extends Exception {
    private static final long serialVersionUID = 1L;

	public PositiveNumberException(String message) {
        super(message);
    }
}

public class Week14P1 {

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
            
            for (String v:values) {
            	if (Integer.valueOf(v) > 0) {
                    throw new PositiveNumberException("Positive number found: " + v);
            	}
            }
            System.out.println("No positive numbers!");
            
			
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (PositiveNumberException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
