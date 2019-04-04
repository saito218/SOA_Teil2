package fahrtabruf;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import bean.Taxi;

@WebService(name = "RueckmeldungSEI", targetNamespace = "http://fahrtabruf/")
public interface RueckmeldungSEI {

	@WebMethod(operationName = "getFahrtlisteMitDatum", action = "urn:GetFahrtlisteMitDatum")
	ArrayList<Taxi> getFahrtlisteMitDatum(@WebParam(name = "arg0") int datum);

}