/**
 * WebservcieDemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.exhui.axis.client;

public class WebservcieDemoServiceLocator extends org.apache.axis.client.Service implements com.exhui.axis.client.WebservcieDemoService {

    public WebservcieDemoServiceLocator() {
    }


    public WebservcieDemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebservcieDemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for webservcieDemo
    private java.lang.String webservcieDemo_address = "http://localhost:8080/axisDemo/services/webservcieDemo";

    public java.lang.String getwebservcieDemoAddress() {
        return webservcieDemo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String webservcieDemoWSDDServiceName = "webservcieDemo";

    public java.lang.String getwebservcieDemoWSDDServiceName() {
        return webservcieDemoWSDDServiceName;
    }

    public void setwebservcieDemoWSDDServiceName(java.lang.String name) {
        webservcieDemoWSDDServiceName = name;
    }

    public com.exhui.axis.client.WebservcieDemo getwebservcieDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(webservcieDemo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwebservcieDemo(endpoint);
    }

    public com.exhui.axis.client.WebservcieDemo getwebservcieDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.exhui.axis.client.WebservcieDemoSoapBindingStub _stub = new com.exhui.axis.client.WebservcieDemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getwebservcieDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwebservcieDemoEndpointAddress(java.lang.String address) {
        webservcieDemo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.exhui.axis.client.WebservcieDemo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.exhui.axis.client.WebservcieDemoSoapBindingStub _stub = new com.exhui.axis.client.WebservcieDemoSoapBindingStub(new java.net.URL(webservcieDemo_address), this);
                _stub.setPortName(getwebservcieDemoWSDDServiceName());
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
        if ("webservcieDemo".equals(inputPortName)) {
            return getwebservcieDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/axisDemo/services/webservcieDemo", "WebservcieDemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/axisDemo/services/webservcieDemo", "webservcieDemo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("webservcieDemo".equals(portName)) {
            setwebservcieDemoEndpointAddress(address);
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
