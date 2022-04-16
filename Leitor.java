import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
public class Leitor {
    private BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    private static Scanner input;
    
    public void leGradeBcc(String file){
        try {
            
            input = new Scanner(Paths.get(file));
            
            // ignora a primeira linha do cabeçalho
            input.nextLine();

            while(input.hasNext()){

                String[] data = input.nextLine().split(",");

                // Grade dados = new Grade(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);

            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float leNumeroFloat() throws NumberFormatException, IOException {
        float number;

        number = Float.parseFloat(keyboard.readLine());

        return number;
    }

    public int leNumeroInt() throws NumberFormatException, IOException {
        int number;

        number = Integer.parseInt(keyboard.readLine());

        return number;
    }

    public double leNumeroDouble() throws NumberFormatException, IOException {
        double number;

        number = Double.parseDouble(keyboard.readLine());

        return number;

    }

    public String leString() throws IOException {
        String word;

        word = keyboard.readLine();

        return word;
    }
}
