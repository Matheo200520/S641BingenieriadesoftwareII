public class Reader {
    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element=element;
        this.converter=converter;
    }

    public void parseint(){
        switch (element) {
            case "Line":
                converter.makeLine();
                break;
            case "Paragraph":
                converter.makeParagraph();;
                break;  
            case "PDF":
                converter.makeTable();
                break;           
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
