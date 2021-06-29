package tricentisTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import conf.TricentisConf;
import io.cucumber.java.it.Quando;

public class InsurantPage {
	@Quando("o usuario esta na aba dois {string}")
	public void o_usuario_esta_na_aba_dois(String string) {
		String Validation = TricentisConf.seletorCss("#enterinsurantdata").getAttribute("name");
		assertEquals(string, Validation);
	}

	@Quando("o usuario preenche o campo first name {string}")
	public void o_usuario_preenche_o_campo_first_name(String string) {
		TricentisConf.seletorCss("#firstname").sendKeys(string);
	}

	@Quando("o usuario preenche o campo last name {string}")
	public void o_usuario_preenche_o_campo_last_name(String string) {
		TricentisConf.seletorCss("#lastname").sendKeys(string);
	}

	@Quando("o usuario preenche o campo date of birth {string}")
	public void o_usuario_preenche_o_campo_date_of_birth(String string) {
		TricentisConf.seletorCss("#birthdate").sendKeys(string);
	}

	@Quando("o usuario preenche o campo gender {string}")
	public void o_usuario_preenche_o_campo_gender(String string) {
		if (string.contains("Male")) {
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)").click();
		} else {
			TricentisConf.seletorCss("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2)").click();
		}
	}

	@Quando("o usuario preenche o campo street address {string}")
	public void o_usuario_preenche_o_campo_street_address(String string) {
		TricentisConf.seletorCss("#streetaddress").sendKeys(string);
	}

	@Quando("o usuario preenche o campo country {string}")
	public void o_usuario_preenche_o_campo_country(String string) {
		Select country1 = new Select(TricentisConf.seletorCss("#country"));
		country1.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo zip code {string}")
	public void o_usuario_preenche_o_campo_zip_code(String string) {
		TricentisConf.seletorCss("#zipcode").sendKeys(string);
	}

	@Quando("o usuario preenche o campo city {string}")
	public void o_usuario_preenche_o_campo_city(String string) {
		TricentisConf.seletorCss("#city").sendKeys(string);
	}

	@Quando("o usuario preenche o campo occupation {string}")
	public void o_usuario_preenche_o_campo_occupation(String string) {
		Select occupation1 = new Select(TricentisConf.seletorCss("#occupation"));
		occupation1.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo hobbies {string}")
	public void o_usuario_preenche_o_campo_hobbies(String string) {
		if (string.contains("Speeding")) {
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)").click();
		} else if (string.contains("BungeeJumping")){
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)").click();
		} else if (string.contains("Cliff Diving")){
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3)").click();
		} else if (string.contains("Skydiving")){
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)")	.click();
		} else if (string.contains("Other")){
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)").click();
		}
	}

	@Quando("o usuario preenche o campo website {string}")
	public void o_usuario_preenche_o_campo_website(String string) {
		TricentisConf.seletorCss("#website").sendKeys(string);
	}
	
	@Quando("clica no botao next aba dois")
	public void clica_no_botao_next_aba_dois() {
		TricentisConf.seletorCss("#nextenterproductdata").click();
	}
}
