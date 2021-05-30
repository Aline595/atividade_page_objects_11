package com.fatec.scel.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAtualizarLivro {
	private WebDriver driver;
	private By isbnBy = By.id("isbn");
	private By autorBy = By.id("autor");
	private By tituloBy = By.id("titulo");
	
	private By btnMenuBy = By.linkText("Livros");
	private By btnConsultarBy = By.linkText("Lista de Livros");
	private By btnEditarBy = By.linkText("Editar");
	private By btnAtualizarBy = By.cssSelector(".btn");
	
	public PageAtualizarLivro(WebDriver driver) {
		this.driver=driver;
	}
	
	public PageAtualizarLivro pageAtualizarLivro (String isbn, String autor, String titulo) {
		driver.findElement(btnMenuBy).click();
		driver.findElement(btnConsultarBy).click();
		driver.findElement(btnEditarBy).click();
		driver.findElement(isbnBy).clear();
		driver.findElement(isbnBy).sendKeys(isbn);
		driver.findElement(autorBy).clear();
    	driver.findElement(autorBy).sendKeys(autor);
		driver.findElement(tituloBy).clear();
    	driver.findElement(tituloBy).sendKeys(titulo);
    	driver.findElement(btnAtualizarBy).click();
		return new PageAtualizarLivro(driver);
	}
	
	
}
