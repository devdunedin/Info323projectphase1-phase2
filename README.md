Info323projectphase1-phase2
===========================
Given When Then Claims Payment Report
Some context before we begin the test scenarios
Description
As a: Finance person 
I want: To understand the status of all claims payment transactions made in branches over a period
 So that: I can determine payments & gst paid for journal entries.
This document explains the test case scenarios and strategy that were used for testing the Claims Payment Report.
There are three main components for testing 
a)	Type of Payment (Every time the word payment is mentioned it means Claims Payment because this Report is intended for Claims Payment)
b)	Status of Payment
c)	Date of Payment (Period of payment)

There are four types of Payment 
1)	Manual Cheque
2)	Daily Cheque
3)	Creditor Cheque
4)	Bank Account
The Status of the Payment could be
1)	issued=Issued
2)	cleared=Cleared
3)	pending=Pending When a payment is requested by CSO for approval the first time 
or
 for approval every time there is an update request
4)	disapproved=Rejected
5)	approved=Approved
6)	voided=Cancelled
7)	stopRequested=Stop Requested
8)	stopped = Stopped
9)	transferred = Transferred
10)	initial=Initial
11)	declined=Declined
The ones that are relevant for this report are highlighted in yellow.

The date of the payment
Transaction  Date
i)	For Manual cheques we use the date when the cheque was approved for the first time as transaction date
ii)	For every other type of payment we use the date when the payment was issued as transaction date.
Since this report is aimed as a quarterly report if the transaction date falls  within the quarterly period we expect the first  time the payment is triggered for the Claims Payment Report.
TEST CASES (WHEN We run the report)
1.	GIVEN
A payment of type Bank account is approved, issued and cleared(Bank accounts cannot be cleared) within 1 period on different dates
THEN
We see one row in the report with status as issued and transaction date as issued date
COMMENTS
This test aims to verify bank account transactions issued within a period show in the report. 
See test case 1 on the template for test data

2.	GIVEN
A payment of type Daily Cheque is approved and issued within 1 period on different dates
THEN
We see one row in the report with status as issued and transaction date as issued date.
COMMENTS
This test aims to verify Daily Cheque transactions issued within a period show in the report. 
See test case 2 on the template for test data

3.	GIVEN
A payment of type Daily Cheque is approved and issued within 1 period and Cleared on the next period.
THEN
We see one row in the report with status as cleared  and transaction date as issued date in the period when it was issued. IN the period when it was only cleared we do not see it in the report..
COMMENTS
This test aims to verify Daily Cheque transactions issued within a period show in the report. If its cleared in another period we should not see it because issue date is the trigger.
See test case 3 on the template for test data.



4.	GIVEN
A payment of type Bank Account is approved, issued and cancelled within 1 period.
THEN
We see one row in the report with status as cleared  and transaction date as issued date in the period when it was issued. IN the period when it was only cleared we do not see it in the report..
COMMENTS
This test aims to verify Daily Cheque transactions issued within a period show in the report. If its cleared in another period we should not see it because issue date is the trigger.
See test case 3 on the template for test data.

<?xml version="1.0" encoding="UTF-8" ?> 
- <wsdl:definitions name="ClaimsPortImplService" targetNamespace="http://integration.claims.ipb.exigen.com/" xmlns:ns1="http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/" xmlns:ns2="http://schemas.xmlsoap.org/soap/http" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://integration.claims.ipb.exigen.com/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <wsdl:import location="http://w8dvexijv01.ldstatdv.net:8280/ami-admin/services/claims?wsdl=ClaimsPort.wsdl" namespace="http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/" /> 
- <wsdl:binding name="ClaimsPortImplServiceSoapBinding" type="ns1:ClaimsPort">
  <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http" /> 
- <wsdl:operation name="OpenClaimRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/OpenClaim" style="document" /> 
- <wsdl:input name="OpenClaimRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="OpenClaimRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ClaimPostRecoveryRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/ClaimPostRecovery" style="document" /> 
- <wsdl:input name="ClaimPostRecoveryRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ClaimPostRecoveryRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ClaimChangeReserveRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/ClaimChangeReserve" style="document" /> 
- <wsdl:input name="ClaimChangeReserveRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ClaimChangeReserveRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ApproveTransactionRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/ApproveTransaction" style="document" /> 
- <wsdl:input name="ApproveTransactionRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ApproveTransactionRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="DownloadClaimPaymentsRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/DownloadClaimPayments" style="document" /> 
- <wsdl:input name="DownloadClaimPaymentsRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="DownloadClaimPaymentsRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="DisapproveTransactionRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/DisapproveTransaction" style="document" /> 
- <wsdl:input name="DisapproveTransactionRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="DisapproveTransactionRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ClaimsNotificationAddRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/SaveFNOL" style="document" /> 
- <wsdl:input name="ClaimsNotificationAddRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ClaimsNotificationAddRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ClaimPostPaymentRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/ClaimPostPayment" style="document" /> 
- <wsdl:input name="ClaimPostPaymentRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ClaimPostPaymentRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="ClaimDownloadRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/DownloadClaim" style="document" /> 
- <wsdl:input name="ClaimDownloadRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="ClaimDownloadRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
- <wsdl:operation name="DownloadClaimPartiesRq">
  <soap:operation soapAction="http://exigenservices.com/ipb/claims/integration/DownloadClaimPartiesRq" style="document" /> 
- <wsdl:input name="DownloadClaimPartiesRq">
  <soap:body use="literal" /> 
  </wsdl:input>
- <wsdl:output name="DownloadClaimPartiesRqResponse">
  <soap:body use="literal" /> 
  </wsdl:output>
  </wsdl:operation>
  </wsdl:binding>
- <wsdl:service name="ClaimsPortImplService">
- <wsdl:port binding="tns:ClaimsPortImplServiceSoapBinding" name="ClaimsPortImplPort">
  <soap:address location="http://w8dvexijv01.ldstatdv.net:8280/ami-admin/services/claims" /> 
  </wsdl:port>
  </wsdl:service>
  </wsdl:definitions>
