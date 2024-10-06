package DocFactory;

import document.Document;
import document.PDFDocument;
import document.WordDocument;

public class DocumentFactory {
    public static Document getDocument(String filename) {
        if ("PDF".equals(filename)) {
            return new PDFDocument();
        }
        else if ("Word".equals(filename)) {
            return new WordDocument();
        }
        try {
            throw new IllegalAccessException("Unknown file type!");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
