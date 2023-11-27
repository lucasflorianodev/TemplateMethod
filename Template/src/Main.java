public class Main {
    public static void main(String[] args) {
        DataMiner pdfMiner = new PDFDataMiner();
        pdfMiner.mine("data.pdf");

        DataMiner csvMiner = new CSVDataMiner();
        csvMiner.mine("data.csv");

        DataMiner docsMiner = new DocsDataMiner();
        docsMiner.mine("data.docx");
    }
}
