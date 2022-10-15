import java.io.*;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sv_test {

    public static void main(String[] args) throws IOException {
        Map<Double, Double> mapResult = new LinkedHashMap<>();
        File file = Path.of("resources", "tmp.txt").toFile();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String[] splitArray;
            String currentLine;
            double currentNumber = -1;
            double currentSum = 0;
            int counter = 0;
            while ((currentLine = fileReader.readLine()) != null) {
                splitArray = currentLine.split("\t");
                double firstParameter = Double.parseDouble(splitArray[0]);
                double secondParameter = Double.parseDouble(splitArray[1]);
                if (currentNumber != Math.floor(firstParameter)) {
                    if (currentNumber != -1) {
                        mapResult.put(currentNumber, currentSum / counter);
                    }
                    currentNumber = Math.floor(firstParameter);
                    currentSum = 0;
                    counter = 0;
                }
                currentSum += secondParameter;
                counter++;
            }
            mapResult.put(currentNumber, currentSum / counter);
        }
        mapResult.forEach((key, value) -> System.out.println((key + "\t" + value).replace(".", ",")));
    }
}
