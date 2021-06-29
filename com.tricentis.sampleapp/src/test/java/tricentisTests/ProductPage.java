package tricentisTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import conf.TricentisConf;
import io.cucumber.java.it.Quando;

public class ProductPage {
	@Quando("o usuario esta na aba tres {string}")
	public void o_usuario_esta_na_aba_tres(String string) {
		String Validation = TricentisConf.seletorCss("#enterproductdata").getAttribute("name");
		assertEquals(string, Validation);
	}

	@Quando("o usuario preenche o campo start date {string}")
	public void o_usuario_preenche_o_campo_start_date(String string) {
		TricentisConf.seletorCss("#startdate").sendKeys(string);
	}

	@Quando("o usuario preenche o campo insurance sum {string}")
	public void o_usuario_preenche_o_campo_insurance_sum(String string) {
		Select insurancesum = new Select(TricentisConf.seletorCss("#insurancesum"));
		insurancesum.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo merit rating {string}")
	public void o_usuario_preenche_o_campo_merit_rating(String string) {
		Select meritrating = new Select(TricentisConf.seletorCss("#meritrating"));
		meritrating.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo damage insurance {string}")
	public void o_usuario_preenche_o_campo_damage_insurance(String string) {
		Select damageinsurance = new Select(TricentisConf.seletorCss("#damageinsurance"));
		damageinsurance.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo optional products {string}")
	public void o_usuario_preenche_o_campo_optional_products(String string) {
		if (string.contains("Euro Protection")) {
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)").click();
		} else {
			TricentisConf.seletorCss("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)").click();
		}
	}

	@Quando("o usuario preenche o campo courtesy car {string}")
	public void o_usuario_preenche_o_campo_courtesy_car(String string) {
		Select courtesycar = new Select(TricentisConf.seletorCss("#courtesycar"));
		courtesycar.selectByVisibleText(string);
	}

	@Quando("clica no botao next aba tres")
	public void clica_no_botao_next_aba_tres() {
		TricentisConf.seletorCss("#nextselectpriceoption").click();
	}

}
