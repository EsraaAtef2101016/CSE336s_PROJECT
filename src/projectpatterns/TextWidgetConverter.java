package projectpatterns;

import java.util.ArrayList;
import java.util.List;

public class TextWidgetConverter extends TextConverter{
	private List<String> widgetData = new ArrayList<>();
	@Override
	public void convertCharacter(char c) {
		widgetData.add(String.valueOf(c));
	}

	@Override
	public void convertFontChange(String font) {
		 widgetData.add(" [Text Widget Font: " + font+"] ");
	}

	@Override
	public void convertParagraph() {
		widgetData.add("\n"+"TextWidget"+"\n");
	}
	public void GetTextWidget() {
        widgetData.forEach(data -> System.out.print(data + " "));
        System.out.println();
    }

}
