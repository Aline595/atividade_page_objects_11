package com.fatec.scel.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageExcluirLivro {
	private WebDriver driver;
	
	private By btnMenuBy = By.linkText("Livros");
	private By btnConsultarBy = By.linkText("Lista de Livros");
	private By btnExcluirBy = By.cssSelector("tr:nth-child(2) .delete");
	
	public PageExcluirLivro(WebDriver driver) {
		this.driver=driver;
	}
		
	public void excluiRegistro() {
		driver.findElement(btnMenuBy).click();
		driver.findElement(btnConsultarBy).click();
		driver.findElement(btnExcluirBy).click();
	}
	
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}