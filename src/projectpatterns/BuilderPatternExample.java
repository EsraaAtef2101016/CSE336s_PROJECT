package projectpatterns;

public class BuilderPatternExample {

	public static void main(String[] args) {
	    ASCIIConverter ascii = new ASCIIConverter();
	    RTFReader ASCIIText = new RTFReader(ascii);
	    ASCIIText.ParseRTF("Hello~World\nThis is a test.");
	    System.out.println("ASCII Text:"+"\n"+ascii.getASCIIText()); 
	    System.out.println("\n"+"-------------------------------------------------"+"\n" );
	    
	    
	    TeXConverter tex = new TeXConverter();
	    RTFReader TeXTest = new RTFReader(tex);
	    TeXTest.ParseRTF("Hello~World\nThis is a test.");
	    System.out.println("TeX Text:"+"\n"+tex.GetTeXText()); 
	    System.out.println("\n"+"-------------------------------------------------"+"\n" );
	    
	    
        TextWidgetConverter widgetBuilder = new TextWidgetConverter();
        RTFReader widgetReader = new RTFReader(widgetBuilder);
        widgetReader.ParseRTF("Hello~World\nThis is a test.");
        System.out.println("Text Widget Data:");
        widgetBuilder.GetTextWidget();
	}

}


