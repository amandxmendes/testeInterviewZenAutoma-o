package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class AgiTest  {
    @Test
    public void TestValidarCampoPesquisa(){
        System.setProperty("webdriver.chrome.driver", "/Users/amandamendes/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://blogdoagi.com.br");

        navegador.findElement(By.id("search-open")).click();
        navegador.findElement(By.className("search-field")).click();
        navegador.findElement(By.className("search-field")).sendKeys("Teste da Amanda");
        navegador.findElement(By.className("search-submit")).click();

        String telaPesquisa = navegador.findElement(By.className("entry-title")).getText();

        Assert.assertEquals("Nenhum resultado", telaPesquisa);

    }
}
