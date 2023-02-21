// wap to perform file extraction operation i.e (output = input - delete)
import java.io.*;
public class fileExtractionOperation {
// taking file contents from input file which are not in delete file.
	public static void main(String[] args)throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		String line = br1.readLine();
		while(line!=null) {
			boolean avail = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String target=br2.readLine();
			while(target!=null) {
				if(line.equals(target)) {
					avail=true;
					break;
				}
				target=br2.readLine();
				
			}
			if(avail==false) {
				pw.println(line);
			}
			line=br1.readLine();
		}
		pw.flush();

	}

}
