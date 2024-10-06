import DocFactory.DocumentFactory;
import document.Document;

public class Main {
    public static void main(String[] args) {
        Document pdfDoc = DocumentFactory.getDocument("PDF");
        pdfDoc.createDocument();

        Document doc = DocumentFactory.getDocument("Word");
        doc.createDocument();
    }
}