package projectpatterns;

public class ASCIIConverter extends TextConverter{
    private StringBuilder asciiText = new StringBuilder();
	@Override
	public void convertCharacter(char c) {
		 asciiText.append(c);
	}

	@Override
	public void convertFontChange(String font) {
		 asciiText.append(" [ASCII Font:").append(font).append("] ");
	}

	@Override
	public void convertParagraph() {
		 asciiText.append("\n"+"ASCII"+"\n");
	}
	
	public String getASCIIText() {
		return asciiText.toString() ;	
	}

	
}
