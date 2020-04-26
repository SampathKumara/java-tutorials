import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get("myfile.txt"));
			int lineNum = 0;
			for (String line : allLines) {
				System.out.println(++lineNum + "\t" +line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	