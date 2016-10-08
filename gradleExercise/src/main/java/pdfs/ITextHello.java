package pdfs;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Created by syono on 2016-10-08.
 */
public class ITextHello {
    public static final String RESULT = "build/hello.pdf";

    public static void main(String[] args) throws DocumentException, IOException {
        new ITextHello().createPdf(RESULT, args[0]);
    }

    public void createPdf(String filename, String arg) throws DocumentException, IOException{
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();
        document.add(new Paragraph("Hello World!"));

        document.close();
    }
}
