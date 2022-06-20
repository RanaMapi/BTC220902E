package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Helper {

	public static void click(WebElement element) {
		System.out.println("clicked");
		element.click();
	}
	
	public static Properties readPropFile(String path) throws IOException {
		FileInputStream f=new FileInputStream(new File(path));
		Properties p=new Properties();
		p.load(f);
		return p;
	}
}