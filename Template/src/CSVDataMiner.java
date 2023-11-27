import java.io.File;


public class CSVDataMiner extends DataMiner {

    @Override
    protected File openFile(String path) {
        System.out.println("CSV file opened.");
        return new File(path);
    }

    @Override
    protected String extractData(File file) {
        System.out.println("Data extracted from CSV.");
        return ""; 
    }

    @Override
    protected Object parseData(String rawData) {
        System.out.println("Data parsed from CSV.");
        return new Object();
    }

    @Override
    protected Object analyzeData(Object parsedData) {
        System.out.println("Data analyzed from CSV.");
        return new Object();
    }
}
