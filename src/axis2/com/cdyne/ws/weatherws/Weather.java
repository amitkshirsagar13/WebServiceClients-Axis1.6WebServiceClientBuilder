

/**
 * Weather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package axis2.com.cdyne.ws.weatherws;

    /*
     *  Weather java interface
     */

    public interface Weather {
          

        /**
          * Auto generated method signature
          * Gets Information for each WeatherID
                    * @param getWeatherInformation
                
         */

         
                     public com.cdyne.ws.weatherws.GetWeatherInformationResponseDocument getWeatherInformation(

                        com.cdyne.ws.weatherws.GetWeatherInformationDocument getWeatherInformation)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Allows you to get your City's Weather, which is updated hourly. U.S. Only
                    * @param getCityWeatherByZIP
                
         */

         
                     public com.cdyne.ws.weatherws.GetCityWeatherByZIPResponseDocument getCityWeatherByZIP(

                        com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument getCityWeatherByZIP)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
                    * @param getCityForecastByZIP
                
         */

         
                     public com.cdyne.ws.weatherws.GetCityForecastByZIPResponseDocument getCityForecastByZIP(

                        com.cdyne.ws.weatherws.GetCityForecastByZIPDocument getCityForecastByZIP)
                        throws java.rmi.RemoteException
             ;

        

        
       //
       }
    