package genericUtilityOrLib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
//WebDriver driver=null;
Actions act=null;
Select s=null;
/**
 * this is a generic method for ImplicitWait
 * @param particularSeconds
 */
public void implicitWait(WebDriver driver,int particularSeconds) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
}
/**
 * this is a generic method to maximize the window
 */
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/*Actions class generic functions--------*/
/**
 * this is a generic method to right click on the element
 * @param element
 */
public void rightClickOnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.contextClick(element).perform();
}
/**
 * this is generic method to click on element
 * @param element
 */
public void ClickOnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.click(element).perform();
	
}
/**
 * this is an generic method to drag the element 
 * @param src
 * @param target
 */

public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target) {
	act=new Actions(driver);
	act.dragAndDrop(src, target).perform();
}
/**
 * this is an generic method to drag the pointer
 * @param src
 * @param xOffset
 * @param yOffset
 */
public void dragAPointer(WebDriver driver,WebElement src,int xOffset,int yOffset) {
	act=new Actions(driver);
	act.dragAndDropBy(src, xOffset, yOffset).perform();
	
}
/**
 * this is an generic method to scroll to a perticular element
 * @param element
 */
public void ScrollToaPerticularElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.scrollToElement(element).perform();
}
/**
 * this is a generic method to move to perticular element
 * @param element
 */
public void moveCurserToElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.moveToElement(element);

}
/**
 * this is a generic method to hold an element
 * @param element
 */
public void HoldAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.clickAndHold(element).perform();
}
/**
 * this is a generic method to release an holded element
 * @param element
 */
public void ReleaseAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.release(element).perform();
}
/**
 * this is a generic method to select an element by index
 * @param element
 * @param indexnum
 */
public void SelectByIndex(WebElement element,int indexnum) {
	s=new Select(element);
	s.selectByIndex(indexnum);
}
/**
 * this is a generic method to select an element by visibleText
 * @param element
 * @param text
 */
public void SelectByVisible(WebElement element,String text) {
	s=new Select(element);
	s.selectByVisibleText(text);
}
/**
 * this is an generic method to select an element by passing the value
 * @param element
 * @param value
 */
public void selectByValue(WebElement element,String value) {
	s=new Select(element);
	s.selectByValue(value);
}
/**
 * this is an generic method to seleect the element by index
 * @param element
 * @param indexnum
 */

public void deSelectByIndex(WebElement element,int indexnum) {
	s=new Select(element);
	s.deselectByIndex(indexnum);
}
/**'
 * this is ageneric method to select an element by visibleText
 * @param element
 * @param text
 */
public void deSelectByVisible(WebElement element,String text) {
	s=new Select(element);
	s.deselectByVisibleText(text);
}
/**
 * this is a generic method to deselect a element by value
 * @param element
 * @param value
 */
public void deselectByValue(WebElement element,String value) {
	s=new Select(element);
	s.deselectByValue(value);
}
/**'
 * this is an generic method to deselect all
 * @param element
 */
public void deselectAll(WebElement element) {
	s=new Select(element);
	s.deselectAll();
}
/**
 * this is a generic method to fetchall the selected options
 * @param element
 * @return
 */
public List<WebElement>fetchAllSelectedOptions(WebElement element){
	s=new Select(element);
	List<WebElement>all=s.getAllSelectedOptions();
	return all;
}
/**
 * this is a generic method to fetch all options
 * @param element
 * @return
 */
public List<WebElement>fetchAllOptions(WebElement element){
	s=new Select(element);
	List<WebElement>all=s.getOptions();
	return all;
}
/** 
 * this is a generic method to accept the alert
 */
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 * this is a generic method to dismiss  the alert
 */
public void dismissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
/**
 * this is an generic method to switch to child frame
 * @param ChildFrameindex
 */
public void switchToChildFrame(WebDriver driver,int ChildFrameindex) {
	driver.switchTo().frame(ChildFrameindex);
}












}
