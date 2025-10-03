public class EjecutarConverter {
    public static void main(String[] args) {
        ConverterC objASCII = new ASCIIConverterC(); 
        ConverterC objPostScript = new PostScriptConverterC();
        ConverterC objPDF = new PDFConverterC();

        ReaderC objLector1 = new ReaderC("LINE", objASCII);
        ReaderC objLector2 = new ReaderC("TABLE", objPDF);
        ReaderC objLector3 = new ReaderC("PARAGRAPH", objPostScript);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();
    }    
}
