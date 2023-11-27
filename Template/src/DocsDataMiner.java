import java.io.File;

public class DocsDataMiner extends DataMiner {

    @Override
    protected File openFile(String path) {
        System.out.println("Document file opened.");
        return new File(path);
    }

    @Override
    protected String extractData(File file) {
        System.out.println("Data extracted from document.");
        return "";
    }

    @Override
    protected Object parseData(String rawData) {
        System.out.println("Data parsed from document.");
        return new Object();
    }

    @Override
    protected Object analyzeData(Object parsedData) {
        System.out.println("Data analyzed from document.");
        return new Object();
    }
}
