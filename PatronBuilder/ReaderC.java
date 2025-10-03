public class ReaderC {
    private String element;
    private ConverterC converter;

    public ReaderC(String element, ConverterC converter){
        this.element=element;
        this.converter=converter;
    }

    public void parseInput(){
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PARAGRAPH":
                converter.makeParagraph();;
                break;  
            case "TABLE":
                converter.makeTable();
                break;           
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
