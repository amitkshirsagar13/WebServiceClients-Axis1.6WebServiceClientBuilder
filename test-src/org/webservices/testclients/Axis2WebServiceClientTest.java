package org.webservices.testclients;

import java.rmi.RemoteException;

import javax.rmi.CORBA.Stub;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument;
import com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument.GetCityWeatherByZIP;
import com.cdyne.ws.weatherws.GetCityWeatherByZIPResponseDocument;
import com.cdyne.ws.weatherws.GetWeatherInformationDocument;
import com.cdyne.ws.weatherws.GetWeatherInformationDocument.GetWeatherInformation;
import axis2.com.cdyne.ws.weatherws.WeatherStub;

public class Axis2WebServiceClientTest {

	public static void main(String[] args) throws RemoteException {
		WeatherStub weatherStub = new WeatherStub(
						"http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL");

		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		auth.setUsername("akshirsa");
		auth.setPassword("google123");
		auth.setPreemptiveAuthentication(true);
		
		weatherStub._getServiceClient()
		.getOptions()
		.setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE,
				auth);
		weatherStub._getServiceClient().getOptions().setTimeOutInMilliSeconds(60000);
		
		GetCityWeatherByZIPDocument getWeatherDocument = GetCityWeatherByZIPDocument.Factory
				.newInstance();
		GetCityWeatherByZIP weatherInformation = getWeatherDocument
				.addNewGetCityWeatherByZIP();
		weatherInformation.setZIP("38125");
		GetCityWeatherByZIPResponseDocument weatherResponse =  weatherStub.getCityWeatherByZIP(getWeatherDocument);
		
		System.out.println(weatherResponse.getGetCityWeatherByZIPResponse().getGetCityWeatherByZIPResult().getDescription());
	}

}
