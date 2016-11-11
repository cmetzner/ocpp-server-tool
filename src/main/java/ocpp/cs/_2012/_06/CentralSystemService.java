
package ocpp.cs._2012._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CentralSystemService", targetNamespace = "urn://Ocpp/Cs/2012/06/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CentralSystemService {


    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.AuthorizeResponse
     */
    @WebMethod(operationName = "Authorize", action = "/Authorize")
    @WebResult(name = "authorizeResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public AuthorizeResponse authorize(
        @WebParam(name = "authorizeRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        AuthorizeRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.StartTransactionResponse
     */
    @WebMethod(operationName = "StartTransaction", action = "/StartTransaction")
    @WebResult(name = "startTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StartTransactionResponse startTransaction(
        @WebParam(name = "startTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StartTransactionRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.StopTransactionResponse
     */
    @WebMethod(operationName = "StopTransaction", action = "/StopTransaction")
    @WebResult(name = "stopTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StopTransactionResponse stopTransaction(
        @WebParam(name = "stopTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StopTransactionRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.HeartbeatResponse
     */
    @WebMethod(operationName = "Heartbeat", action = "/Heartbeat")
    @WebResult(name = "heartbeatResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public HeartbeatResponse heartbeat(
        @WebParam(name = "heartbeatRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        HeartbeatRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.MeterValuesResponse
     */
    @WebMethod(operationName = "MeterValues", action = "/MeterValues")
    @WebResult(name = "meterValuesResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public MeterValuesResponse meterValues(
        @WebParam(name = "meterValuesRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        MeterValuesRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.BootNotificationResponse
     */
    @WebMethod(operationName = "BootNotification", action = "/BootNotification")
    @WebResult(name = "bootNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public BootNotificationResponse bootNotification(
        @WebParam(name = "bootNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        BootNotificationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.StatusNotificationResponse
     */
    @WebMethod(operationName = "StatusNotification", action = "/StatusNotification")
    @WebResult(name = "statusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StatusNotificationResponse statusNotification(
        @WebParam(name = "statusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StatusNotificationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.FirmwareStatusNotificationResponse
     */
    @WebMethod(operationName = "FirmwareStatusNotification", action = "/FirmwareStatusNotification")
    @WebResult(name = "firmwareStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public FirmwareStatusNotificationResponse firmwareStatusNotification(
        @WebParam(name = "firmwareStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        FirmwareStatusNotificationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.DiagnosticsStatusNotificationResponse
     */
    @WebMethod(operationName = "DiagnosticsStatusNotification", action = "/DiagnosticsStatusNotification")
    @WebResult(name = "diagnosticsStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DiagnosticsStatusNotificationResponse diagnosticsStatusNotification(
        @WebParam(name = "diagnosticsStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        DiagnosticsStatusNotificationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.cs._2012._06.DataTransferResponse
     */
    @WebMethod(operationName = "DataTransfer", action = "/DataTransfer")
    @WebResult(name = "dataTransferResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DataTransferResponse dataTransfer(
        @WebParam(name = "dataTransferRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        DataTransferRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cs/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

}
