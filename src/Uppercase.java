import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uppercase {


    public static String text_read(String string) {

        String line = null;
        String result = "";
        String fname=string;

        try {

            FileReader fileReader;
            fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                result = result.concat(line);
            }
            bufferedReader.close();

        }

        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + string + "'");
        }

        int length = result.length();
        String len = "length of file is " + length;
        result = result + " " + len;

        return result;

    }

}
