import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("G:\\RahulShetty\\Section20\\src\\data.properties");
	prop.load(fis);//Load is used for reading
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	prop.setProperty("browser", "firefox");//used to change the property value
	// It will update the value only in the code not in the prop file
	System.out.println(prop.getProperty("browser"));
	FileOutputStream fos = new FileOutputStream("D:\\RahulShetty\\Section20\\src\\data.properties");
	prop.store(fos, null);//store is used for writing
	
	}

}
