package tricentisTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import conf.TricentisConf;
import io.cucumber.java.it.Quando;

public class VehiclePage {
	@Quando("o usuario esta na aba um {string}")
	public void o_usuario_esta_na_aba_um(String string) {
		String Validation = TricentisConf.seletorCss("#entervehicledata").getAttribute("name");
		assertEquals(string, Validation);
	}
	
	@Quando("o usuario preenche o campo make {string}")
	public void o_usuario_preenche_o_campo_make(String string) {
		Select make = new Select(TricentisConf.seletorCss("#make"));
		make.selectByVisibleText(string);		
	}

	@Quando("o usuario preenche o campo model {string}")
	public void o_usuario_preenche_o_campo_model(String string) {
		Select model = new Select(TricentisConf.seletorCss("#model"));
		model.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo cylinder capacity {string}")
	public void o_usuario_preenche_o_campo_cylinder_capacity(String string) {
		TricentisConf.seletorCss("#cylindercapacity").sendKeys(string);
	}

	@Quando("o usuario preenche o campo engine performance {string}")
	public void o_usuario_preenche_o_campo_engine_performance(String string) {
		TricentisConf.seletorCss("#engineperformance").sendKeys(string);
	}

	@Quando("o usuario preenche o campo date of manufacture {string}")
	public void o_usuario_preenche_o_campo_date_of_manufacture(String string) {
		TricentisConf.seletorCss("#dateofmanufacture").sendKeys(string);
	}

	@Quando("o usuario preenche o campo number of seats1 {string}")
	public void o_usuario_preenche_o_campo_number_of_seats1(String string) {
		Select number = new Select(TricentisConf.seletorCss("#numberofseats"));
		number.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo right hand drive {string}")
	public void o_usuario_preenche_o_campo_right_hand_drive(String string) {
	    
		if (string.contains("Yes")) {
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span").click();
		} else {
			TricentisConf.seletorCss(
		    		"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span").click();
		}
	}
	
	@Quando("o usuario preenche o campo number of seats2 {string}")
	public void o_usuario_preenche_o_campo_number_of_seats2(String string) {
		Select number2 = new Select(TricentisConf.seletorCss("#numberofseatsmotorcycle"));
		number2.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo fuel type {string}")
	public void o_usuario_preenche_o_campo_fuel_type(String string) {
		Select fuel = new Select(TricentisConf.seletorCss("#fuel"));
		fuel.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo payload {string}")
	public void o_usuario_preenche_o_campo_payload(String string) {
		TricentisConf.seletorCss("#payload").sendKeys(string);
	}

	@Quando("o usuario preenche o campo total weight {string}")
	public void o_usuario_preenche_o_campo_total_weight(String string) {
		TricentisConf.seletorCss("#totalweight").sendKeys(string);
	}

	@Quando("o usuario preenche o campo list price {string}")
	public void o_usuario_preenche_o_campo_list_price(String string) {
		TricentisConf.seletorCss("#listprice").sendKeys(string);
	}

	@Quando("o usuario preenche o campo license plate number {string}")
	public void o_usuario_preenche_o_campo_license_plate_number(String string) {
		TricentisConf.seletorCss("#licenseplatenumber").sendKeys(string);
	}

	@Quando("o usuario preenche o campo annual mileage {string}")
	public void o_usuario_preenche_o_campo_annual_mileage(String string) {
		TricentisConf.seletorCss("#annualmileage").sendKeys(string);
	}

	@Quando("clica no botao next aba um")
	public void clica_no_botao_next_aba_um() {
		TricentisConf.seletorCss("#nextenterinsurantdata").click();
	}
}
