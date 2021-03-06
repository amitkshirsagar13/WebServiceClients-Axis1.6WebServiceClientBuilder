/*
 * An XML document type.
 * Localname: GetCityForecastByZIP
 * Namespace: http://ws.cdyne.com/WeatherWS/
 * Java type: com.cdyne.ws.weatherws.GetCityForecastByZIPDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdyne.ws.weatherws;


/**
 * A document containing one GetCityForecastByZIP(@http://ws.cdyne.com/WeatherWS/) element.
 *
 * This is a complex type.
 */
public interface GetCityForecastByZIPDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCityForecastByZIPDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7B2E23E275E37958651890033B68743").resolveHandle("getcityforecastbyzipbac5doctype");
    
    /**
     * Gets the "GetCityForecastByZIP" element
     */
    com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP getGetCityForecastByZIP();
    
    /**
     * Sets the "GetCityForecastByZIP" element
     */
    void setGetCityForecastByZIP(com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP getCityForecastByZIP);
    
    /**
     * Appends and returns a new empty "GetCityForecastByZIP" element
     */
    com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP addNewGetCityForecastByZIP();
    
    /**
     * An XML GetCityForecastByZIP(@http://ws.cdyne.com/WeatherWS/).
     *
     * This is a complex type.
     */
    public interface GetCityForecastByZIP extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCityForecastByZIP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7B2E23E275E37958651890033B68743").resolveHandle("getcityforecastbyzip31afelemtype");
        
        /**
         * Gets the "ZIP" element
         */
        java.lang.String getZIP();
        
        /**
         * Gets (as xml) the "ZIP" element
         */
        org.apache.xmlbeans.XmlString xgetZIP();
        
        /**
         * True if has "ZIP" element
         */
        boolean isSetZIP();
        
        /**
         * Sets the "ZIP" element
         */
        void setZIP(java.lang.String zip);
        
        /**
         * Sets (as xml) the "ZIP" element
         */
        void xsetZIP(org.apache.xmlbeans.XmlString zip);
        
        /**
         * Unsets the "ZIP" element
         */
        void unsetZIP();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP newInstance() {
              return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.GetCityForecastByZIP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument newInstance() {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdyne.ws.weatherws.GetCityForecastByZIPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
