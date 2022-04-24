package biblioteca;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Leitor {
    private BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
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
