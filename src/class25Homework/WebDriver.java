package class25Homework;
/*
Task 1:
Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Google Chrome...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome...");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding Element...");
    }
}

class FireFox implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox...");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Windows...");
    }

    @Override
    public void findElement() {
        System.out.println("Find Elements");
    }
}

class WebDriverTester{
    public static void main(String[] args) {
        WebDriver[] browsers= {new ChromeDriver(), new FireFox()};
        for (WebDriver browser: browsers){
            browser.openBrowser();
            browser.findElement();
            browser.maximizeWindow();
            browser.closeBrowser();
        }
    }
}