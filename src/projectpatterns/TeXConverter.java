package projectpatterns;

public class TeXConverter extends TextConverter {
    private StringBuilder texText=new StringBuilder();
	@Override
	public void convertCharacter(char c) {
		texText.append(c);
	}

	@Override
	public void convertFontChange(String font) {
		texText.append(" [TeX Font:").append(font).append("] ");
	}

	@Override
	public void convertParagraph() {
		texText.append("\n"+"TeX"+"\n");
	}
	public String GetTeXText() {
		return texText.toString();
		
	}

}
