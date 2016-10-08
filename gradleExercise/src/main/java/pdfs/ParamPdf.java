package pdfs;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by syono on 2016-10-08.
 */
public class ParamPdf {
    public static final String RESULT = "my.pdf";
    public static final String msg = "Hello";

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        if (args.length == 0)
            new ParamPdf().createPdf(RESULT, msg);
        else
            new ParamPdf().createPdf(RESULT, args[0]);
    }

    private void createPdf(String fileName, String word) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));
        document.open();
        document.add(new Paragraph(word));

        document.close();
    }
}
