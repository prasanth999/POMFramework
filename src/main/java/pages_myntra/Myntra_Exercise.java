package pages_myntra;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Myntra_Exercise {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch the browser
		driver.get("https://www.myntra.com/");

		driver.findElementByClassName("desktop-searchBar").sendKeys("sunglasses",Keys.ENTER);



		List<WebElement> dprices = driver.findElementsByXPath("//span[contains(text(),'40%')]/preceding::h4[1][contains(text(),'Unisex')]");

		System.out.println("Printing sunglasses with 40% discount and product should be unisex product : ");
		
		for(WebElement prices1 : dprices){

			System.out.println(prices1.getText());


		}

		List<WebElement> eleUniqueValue = driver.findElementsByClassName("product-brand");

		Set<String> names = new TreeSet<>();

		for (WebElement string : eleUniqueValue) {

			names.add(string.getText());
		}
		System.out.println("Print all unique brand names of sunglasses : ");

		System.out.println(names);

		driver.findElementByXPath("//label[@style='background-color: rgb(94, 177, 96);']").click();

		String productname = driver.findElementByXPath("(//img[@class='product-thumb'])[2]").getText();

		System.out.println("Print the Product name in PLP Page : ");

		System.out.println(productname);

		driver.findElementByXPath("(//img[@class='product-thumb'])[2]").click();

		String pdpdetails = driver.findElementByXPath("//h1[@class='pdp-title']").getText();

		System.out.println("Print the Product name in PDP page : ");

		System.out.println(pdpdetails);

		String productprice = driver.findElementByXPath("//strong[@class='pdp-price']").getText();

		System.out.println("Print the Price in PDP page : ");

		System.out.println(productprice);

		if(pdpdetails.contains(productname))
		{
			System.out.println("Product name is matched");
		}

		else
		{
			System.out.println("Product name is not matched");
		}

		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();

		driver.findElementByXPath("//span[text()='GO TO BAG']").click();

		String checkout = driver.findElementByXPath("//a[@class='c-gray']").getText();

		System.out.println("Print the Product name in Checkout page : ");

		System.out.println(checkout);

		String checkout1 = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();

		System.out.println("Print the Price in Checkout page : ");

		System.out.println(checkout1);

		if((checkout.contains(pdpdetails)) && (checkout1.contains(productprice)))
		{
			System.out.println("Product name and Product Price is matched");
		}

		else
		{
			System.out.println("Product name and Product Price is not matched");
		}

		driver.close();

	}


}
