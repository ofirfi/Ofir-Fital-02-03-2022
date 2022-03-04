How to run the tests:
    
Tests Scenarios:

    1. "How to help" form E2E Test:
        a.  Fill a name (Eg: Automation).
        b.  Fill a valid email (Eg: Automation@Test.com) .
        c.  Fill a valid phone number (Eg: 050-1234567).
        d.  Click on "שליחה" button.
        e.  Verify that the form was sent.


    2. "How to help" form Validation test:
        a.  Click on "שליחה" button.
        b.  Verify that "שדה שם הוא שדה חובה" error message is presented.
        c.  Verify that "שדה אימייל הוא שדה חובה" error message is presented.
        d.  Verify that "שדה טלפון הוא שדה חובה" error message is presented.
        e.  Fill a valid name (Eg: Automation).
        f.  Fill the email field with an invalid email (Eg: Automation@Test).
        g.  Fill the phone number field with letters (Eg: Ab12#).
        h.  Verify that "כתובת אימייל לא חוקית" error message is presented.
        i.  Verify that "מספר טלפון לא חוקי" error message is presented. 
        

    3. "Contact us" for E2E Test: 
        a.  Scroll down the page to "Contact us" form. 
        b.  Fill the name field with a name (Eg: Testing).
        c.  Fill the company field with a valid company name (Eg: Company).
        d.  Fill the email field with a valid email (Eg: Testing@gmail.com).
        e.  Fill the phone number field with a valid phone number (Eg: 0501234567).
        f.  Click on "דברו איתנו" button.
        g.  Verify that the form was sent.


    4. "Contact us" form Validation test:
        a.  Scroll down the page to "Contact us" form.
        b.  Click on "דבר איתנו" button.
        c.  Verify that "שדה שם הוא שדה חובה" error message is presented.
        d.  Verify that "שדה חברה הוא שדה חובה" error message is presented.
        e.  Verify that "שדה אימייל הוא שדה חובה" error message is presented.
        f.  Verify that "שדה טלפון הוא שדה חובה" error message is presented.
        g.  Fill the name field with a name (Eg: Testing).
        h.  Fill the company field with a valid company name (Eg: Company).
        i.  Fill the email field with an invalid email (Eg: Testing.com).
        j.  Fill the phone number field with letters (Eg: Ab12#).
        k.  Verify that "כתובת אימייל לא חוקית" error message is presented.
        l.  Verify that "מספר טלפון לא חוקי" error message is presented.
