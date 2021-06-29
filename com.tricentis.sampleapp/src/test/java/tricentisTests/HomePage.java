package tricentisTests;

import conf.TricentisConf;
import io.cucumber.java.es.Dado;

public class HomePage {
	@Dado("que o usuario esta no site tricentis")
	public void que_o_usuario_esta_no_site_tricentis() {
		TricentisConf.abrir("http://sampleapp.tricentis.com/101/app.php");
	}


}
