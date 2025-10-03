public class Main {
    public static void main(String[] args) {
        // Usando el ASCIIConverter
        Converter ascii = new ASCIIConverter();
        Reader reader1 = new Reader("Line", ascii);
        reader1.parse();   // → Línea con ASCII

        // Usando el PDFConverter
        Converter pdf = new PDFConverter();
        Reader reader2 = new Reader("Paragraph", pdf);
        reader2.parse();   // → Párrafo con PDF

        // Usando el PostScriptConverter
        Converter ps = new PostScriptConverter();
        Reader reader3 = new Reader("Table", ps);
        reader3.parse();   // → Tabla con PostScript

        // Caso no válido
        Reader reader4 = new Reader("Image", ascii);
        reader4.parse();   // → Opción no válida
    }
}
