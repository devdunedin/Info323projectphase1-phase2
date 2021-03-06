
package sign;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SignService", targetNamespace = "http://sign/", wsdlLocation = "http://localhost:9001/sign?wsdl")
public class SignService
    extends Service
{

    private final static URL SIGNSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIGNSERVICE_EXCEPTION;
    private final static QName SIGNSERVICE_QNAME = new QName("http://sign/", "SignService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9001/sign?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIGNSERVICE_WSDL_LOCATION = url;
        SIGNSERVICE_EXCEPTION = e;
    }

    public SignService() {
        super(__getWsdlLocation(), SIGNSERVICE_QNAME);
    }

    public SignService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIGNSERVICE_QNAME, features);
    }

    public SignService(URL wsdlLocation) {
        super(wsdlLocation, SIGNSERVICE_QNAME);
    }

    public SignService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIGNSERVICE_QNAME, features);
    }

    public SignService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SignService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISignService
     */
    @WebEndpoint(name = "SignPort")
    public ISignService getSignPort() {
        return super.getPort(new QName("http://sign/", "SignPort"), ISignService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISignService
     */
    @WebEndpoint(name = "SignPort")
    public ISignService getSignPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sign/", "SignPort"), ISignService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIGNSERVICE_EXCEPTION!= null) {
            throw SIGNSERVICE_EXCEPTION;
        }
        return SIGNSERVICE_WSDL_LOCATION;
    }

}
