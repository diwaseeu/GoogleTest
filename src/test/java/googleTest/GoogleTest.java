package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void googleTest() throws IOException{
	
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=MnLvV9_GJ4Ly8AfOtILoCQ&gws_rd=ssl");
		
		takeScreenshot(wd);
	}
	
	public static void takeScreenshot(WebDriver wd) throws IOException{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\seleniumWorkspace\\GoogleTet\\screenshot\\test.jpg"));
	}
}
