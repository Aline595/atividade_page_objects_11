package com.fatec.scel.ts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fatec.scel.po.PageAtualizarLivro;
import com.fatec.scel.po.PageCadastrarLivro;
import com.fatec.scel.po.PageExcluirLivro;
import com.fatec.scel.po.PageListarLivro;
import com.fatec.scel.po.PaginaLogin;

//Editar e excluir livro
//ATENÇÂO: Necessário ter livro previamente cadastrado
class REQ03AtualizarLivroTSTests {

	private WebDriver driver;

	@BeforeEach
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ts-scel.herokuapp.com");
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	
	/*@Test
	public void ct01_atualiza_livro_com_sucesso() {
		driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    espera();
	    driver.findElement(By.linkText("Livros")).click();
	    driver.findElement(By.linkText("Lista de Livros")).click();
	    driver.findElement(By.linkText("Editar")).click();
	    driver.findElement(By.id("isbn")).click();
	    driver.findElement(By.id("isbn")).sendKeys("1112");
	    driver.findElement(By.cssSelector(".btn")).click();
	    driver.findElement(By.cssSelector("td:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("td:nth-child(2)")).click();
	    assertEquals("1112", driver.findElement(By.cssSelector("td:nth-child(2)")).getText());
	}*/
	
	@Test
	public void ct01_atualizar_page() {
		PaginaLogin paginaLogin = new PaginaLogin(driver);
		paginaLogin.login("jose", "123");
		espera();
		PageAtualizarLivro pageAtualizarLivro = new PageAtualizarLivro(driver);
		pageAtualizarLivro.pageAtualizarLivro("1111", "Aline", "Teste");
	}
	/*
	@Test
	public void ct02_excluir_livro_com_sucesso() {
		driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    espera();
	    driver.findElement(By.linkText("Livros")).click();
	    driver.findElement(By.linkText("Lista de Livros")).click();
	    driver.findElement(By.linkText("Excluir")).click();
	}*/
	
	@Test
	public void ct02_excluir_page() {
		PaginaLogin paginaLogin = new PaginaLogin(driver);
		paginaLogin.login("jose", "123");
		espera();
		PageExcluirLivro pageExcluirLivro = new PageExcluirLivro(driver);
		pageExcluirLivro.excluiRegistro();
	}
	/*
	@Test
	public void ct04_listar_livro_com_sucesso() {
		driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    espera();    
	    driver.findElement(By.linkText("Livros")).click();
	    driver.findElement(By.linkText("Lista de Livros")).click();
	    assertEquals("Lista de livros", driver.findElement(By.cssSelector(".panel-title")).getText());
	}
	*/
	@Test
	public void ct03_listar_page() {
		PaginaLogin paginaLogin = new PaginaLogin(driver);
		paginaLogin.login("jose", "123");
		espera();
		PageListarLivro pageListarLivro = new PageListarLivro(driver);
		pageListarLivro.listarLivro();
	}
	
		
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}