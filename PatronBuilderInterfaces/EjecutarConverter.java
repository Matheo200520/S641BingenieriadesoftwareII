public class EjecutarConverter {
    public static void main(String[] args) {
        Converter objASCII = new ASCIIConverter(); 
        Converter objPostScript = new PostScriptConverter();
        Converter objPDF = new PDFConverter();
        Converter objWord = new WordConverter();

        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("TABLE", objPDF);
        Reader objLector3 = new Reader("LINE", objPostScript);
        Reader objLector4 = new Reader("PARAGRAPH", objWord);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();
        objLector4.parseInput();
    }    
}
