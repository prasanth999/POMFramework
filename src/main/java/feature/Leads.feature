Feature: Login for leaftabs
@Smoke
Scenario Outline: Create Lead for leaftabs positive
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Create Lead link
And Enter the Company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click on Create Lead button
Then Verify the company name as <cName>

Examples:
|uName|password|cName|fName|lName|
|DemoSalesManager|crmsfa|TestLeaf|prasanth|sund|
|DemoCSR|crmsfa|TestLeaf1|prasanth1|sund1|

@Smoke
Scenario Outline: EditLead for leaftabs positive
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Find Lead link
And Enter the LeadID as <LeadID>
When Click on Find Leads button
When Click on LeadID link from Lead list section
When Click on Edit Lead button
When Clear the existing company name as <cName>
And Enter the company name as <cName>
When Click on update button
When Verify the company name as <cName>

Examples:
|uName|password|LeadID|cName|
|DemoSalesManager|crmsfa|10410|LeafTab1|
|DemoCSR|crmsfa|10412|LeafTab2|
@Smoke
Scenario Outline: DeleteLead for leaftabs positive

And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Find Lead link
When Click on Phone Tab
And Enter the Area code as <aCode>
And Enter the Phone Number as <pNumber>
When Click on Find Lead button
When Click on LeadID link from Lead list section
When Click on Delete Lead button
When Click on Find Lead link
And Enter the LeadID as <LeadID>
When Click on Find Lead button
When Verify the No records as <nRecords>

Examples:
|uName|password|aCode|pNumber|LeadID|nRecords|
|DemoSalesManager|crmsfa|91|999784653|12184|No records to display|
|DemoSalesManager|crmsfa|91|84375893475|12179|No records to display|
@Smoke
Scenario Outline: Duplicate Lead for leaftabs positive
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Find Lead link
When Click on Email Tab
And Enter email address as <eMail>
When Click on Find Lead button
When Click on LeadID link from Lead list section
When Click on duplicate lead button
When Verify the exact text of duplicate lead as <dLead>
When Click on submit button
When Verify the company name as <cName>

Examples:
|uName|password|eMail|dLead|cName|
|DemoSalesManager|crmsfa|prasanth@gmail.com|Duplicate Lead|TestLeaf|
|DemoSalesManager|crmsfa|prasanth1@gmail.com|Duplicate Lead|TestLeaf1|
 @Sanity
 Scenario Outline: Merge Lead for leaftabs positive
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Merge Lead link
When Click from merge lead
And Enter the LeadID in window as <LeadID1>
When Click on Find Leads in window button
When Click on LeadID link from Lead1 list section in window
When Click to merge lead
And Enter the LeadID in window as <LeadID2>
When Click on Find Leads in window button
When Click on LeadID link from Lead2 list section in window
When Click on Merge button
When Click on Find Lead link
And Enter the LeadID as <LeadID>
When Click on Find Lead button
When Verify the No records as <nRecords>


Examples:
|uName|password|LeadID1|LeadID2|LeadID|nRecords|
|DemoSalesManager|crmsfa|10542|10543|10542|No records to display|
|DemoSalesManager|crmsfa|10547|10548|10547|No records to display|

