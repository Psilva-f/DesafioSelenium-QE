package tricentisTests;

import static org.junit.Assert.assertEquals;

import conf.TricentisConf;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class SendQuotePage {
	@Quando("o usuario esta na aba cinco {string}")
	public void o_usuario_esta_na_aba_cinco(String string) {
		String Validation = TricentisConf.seletorCss("#sendquote").getAttribute("name");
		assertEquals(string, Validation);
	}

	@Quando("o usuario preenche o campo email {string}")
	public void o_usuario_preenche_o_campo_email(String string) {
		TricentisConf.seletorCss("#email").sendKeys(string);
	}

	@Quando("o usuario preenche o campo phone {string}")
	public void o_usuario_preenche_o_campo_phone(String string) {
		TricentisConf.seletorCss("#phone").sendKeys(string);
	}

	@Quando("o usuario preenche o campo username {string}")
	public void o_usuario_preenche_o_campo_username(String string) {
		TricentisConf.seletorCss("#username").sendKeys(string);
	}

	@Quando("o usuario preenche o campo password {string}")
	public void o_usuario_preenche_o_campo_password(String string) {
		TricentisConf.seletorCss("#password").sendKeys(string);
	}

	@Quando("o usuario preenche o campo confirm password {string}")
	public void o_usuario_preenche_o_campo_confirm_password(String string) {
		TricentisConf.seletorCss("#confirmpassword").sendKeys(string);
	}

	@Quando("o usuario preenche o campo comments {string}")
	public void o_usuario_preenche_o_campo_comments(String string) {
		TricentisConf.seletorCss("#Comments").sendKeys(string);
	}

	@Quando("clica no botao send")
	public void clica_no_botao_send() {
		TricentisConf.seletorCss("#sendemail").click();
	}

	@Entao("verifica a mensagem {string}")
	public void verifica_a_mensagem(String string) throws InterruptedException {
		Thread.sleep(12000);
		String Sucesso = TricentisConf.seletorCss("body > div.sweet-alert.showSweetAlert.visible > h2").getText();
		assertEquals(string, Sucesso);
		TricentisConf.seletorCss("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button").click();
		Thread.sleep(1000);
		TricentisConf.close();
	}
}
