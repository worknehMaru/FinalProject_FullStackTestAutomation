package utilities;

import org.testng.annotations.DataProvider;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps{
    @DataProvider(name = "data-provider-users")
    public Object[][] getDataObject() throws IOException {
        return getDatafromeCSV(getData("DDTFile"));
    }

    public static List<String> readCSV(String csvFile) throws IOException {
        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        }
        catch (IIOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static Object[][] getDatafromeCSV(String filePath) throws IOException
    {
        Object[][] data = new  Object[8][2];
        List<String> csvData = readCSV(filePath);
        for (int i=0; i < csvData.size(); i++)
        {
            data[i][0] = csvData.get(i).split(",")[0];
            data[i][1] = csvData.get(i).split(",")[1];
        }
        return data;
    }
}
