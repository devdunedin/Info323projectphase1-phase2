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

