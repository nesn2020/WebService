/**
 * TaxCalculatorImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TaxCalculatorImplServiceLocator extends org.apache.axis.client.Service implements mypackage.TaxCalculatorImplService {

    public TaxCalculatorImplServiceLocator() {
    }


    public TaxCalculatorImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaxCalculatorImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaxCalculatorImplPort
    private java.lang.String TaxCalculatorImplPort_address = "http://localhost:9000/TaxCalculator";

    public java.lang.String getTaxCalculatorImplPortAddress() {
        return TaxCalculatorImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaxCalculatorImplPortWSDDServiceName = "TaxCalculatorImplPort";

    public java.lang.String getTaxCalculatorImplPortWSDDServiceName() {
        return TaxCalculatorImplPortWSDDServiceName;
    }

    public void setTaxCalculatorImplPortWSDDServiceName(java.lang.String name) {
        TaxCalculatorImplPortWSDDServiceName = name;
    }

    public mypackage.TaxCalculatorImpl getTaxCalculatorImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaxCalculatorImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaxCalculatorImplPort(endpoint);
    }

    public mypackage.TaxCalculatorImpl getTaxCalculatorImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TaxCalculatorImplPortBindingStub _stub = new mypackage.TaxCalculatorImplPortBindingStub(portAddress, this);
            _stub.setPortName(getTaxCalculatorImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaxCalculatorImplPortEndpointAddress(java.lang.String address) {
        TaxCalculatorImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TaxCalculatorImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TaxCalculatorImplPortBindingStub _stub = new mypackage.TaxCalculatorImplPortBindingStub(new java.net.URL(TaxCalculatorImplPort_address), this);
                _stub.setPortName(getTaxCalculatorImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TaxCalculatorImplPort".equals(inputPortName)) {
            return getTaxCalculatorImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example/", "TaxCalculatorImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example/", "TaxCalculatorImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaxCalculatorImplPort".equals(portName)) {
            setTaxCalculatorImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
