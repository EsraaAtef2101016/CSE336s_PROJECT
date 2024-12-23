package projectpatterns;

public class RTFReader {
	private TextConverter test;
    
    public RTFReader(TextConverter test) {
		super();
		this.test = test;
	}

	public void ParseRTF(String str) {
		for (char i : str.toCharArray()){
			if(i=='\n')
			   test.convertParagraph();
			else if(i=='~')
			   test.convertFontChange("Arial");
			else 
			   test.convertCharacter(i);
		}
		
	}
    
}
