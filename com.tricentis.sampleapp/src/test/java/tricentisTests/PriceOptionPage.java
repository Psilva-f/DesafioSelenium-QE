package tricentisTests;

import static org.junit.Assert.assertEquals;

import conf.TricentisConf;
import io.cucumber.java.it.Quando;

public class PriceOptionPage {
	@Quando("o usuario esta na aba quatro {string}")
	public void o_usuario_esta_na_aba_quatro(String string) {
		String Validation = TricentisConf.seletorCss("#selectpriceoption").getAttribute("name");
		assertEquals(string, Validation);
	}

	@Quando("escolhe o valor seguro {string}")
	public void escolhe_o_valor_seguro(String string) {
		if (string.contains("Silver")) {
			TricentisConf.seletorCss(
		    		"#priceTable > tfoot > tr > th.group > label:nth-child(1) > span").click();
		} else if (string.contains("Gold")){
			TricentisConf.seletorCss("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span").click();
		} else if (string.contains("Platinum")){
			TricentisConf.seletorCss("#priceTable > tfoot > tr > th.group > label:nth-child(3) > span").click();
		} else if (string.contains("Ultimate")){
			TricentisConf.seletorCss("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span").click();
		}
	}

	@Quando("clica no botao next aba quatro")
	public void clica_no_botao_next_aba_quatro() throws InterruptedException {
		Thread.sleep(2000);
		TricentisConf.seletorCss("#nextsendquote").click();
	}
}
