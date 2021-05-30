package com.fatec.scel.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageListarLivro {
	private WebDriver driver;
	private By btnMenuBy = By.linkText("Livros");
	private By btnConsultarBy = By.linkText("Lista de Livros");
	private By resultado = By.cssSelector("tr:nth-child(1) > td:nth-child(3)");
	
	public PageListarLivro(WebDriver driver) {
		this.driver=driver;
	}
	
	public PageListarLivro listarLivro() {
		driver.findElement(btnMenuBy).click();
		driver.findElement(btnConsultarBy).click();
		return new PageListarLivro(driver);
	}
	
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
