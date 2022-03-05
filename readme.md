Tests Scenarios:

    1. Main page - "How to help" form E2E test:
        a.  Open the main page.
        b.  Fill a name (Eg: Automation).
        c.  Fill a valid email (Eg: Automation@Test.com).
        d.  Fill a valid phone number (Eg: 050-1234567).
        e.  Click on "שליחה" button.
        f.  Verify that the form was sent.


    2. Main page - "How to help" form validation test:
        a.  Open the main page.
        b.  Click on "שליחה" button.
        c.  Verify that "שדה שם הוא שדה חובה" error message is presented.
        d.  Verify that "שדה אימייל הוא שדה חובה" error message is presented.
        e.  Verify that "שדה טלפון הוא שדה חובה" error message is presented.
        f.  Fill a valid name (Eg: Automation).
        g.  Fill the email field with an invalid email (Eg: Automation@Test).
        h.  Fill the phone number field with letters (Eg: Ab12#).
        i.  Verify that "כתובת אימייל לא חוקית" error message is presented.
        j.  Verify that "מספר טלפון לא חוקי" error message is presented. 
        

    3. Main page - "Contact us" for E2E test:
        a.  Open the main page.
        b.  Scroll down the page to "Contact us" form. 
        c.  Fill the name field with a name (Eg: Testing).
        d.  Fill the company field with a valid company name (Eg: Company).
        e.  Fill the email field with a valid email (Eg: Testing@gmail.com).
        f.  Fill the phone number field with a valid phone number (Eg: 0501234567).
        g.  Click on "דברו איתנו" button.
        h.  Verify that the form was sent.


    4. Main page - "Contact us" form validation test:
        a.  Open the main page.
        b.  Scroll down the page to "Contact us" form.
        c.  Click on "דבר איתנו" button.
        d.  Verify that "שדה שם הוא שדה חובה" error message is presented.
        e.  Verify that "שדה חברה הוא שדה חובה" error message is presented.
        f.  Verify that "שדה אימייל הוא שדה חובה" error message is presented.
        g.  Verify that "שדה טלפון הוא שדה חובה" error message is presented.
        h.  Fill the name field with a name (Eg: Testing).
        i.  Fill the company field with a valid company name (Eg: Company).
        j.  Fill the email field with an invalid email (Eg: Testing.com).
        k.  Fill the phone number field with letters (Eg: Ab12#).
        l.  Verify that "כתובת אימייל לא חוקית" error message is presented.
        m.  Verify that "מספר טלפון לא חוקי" error message is presented.
    

    5. Main page - Check page buttons integrity:
        a.  Open the main page.
        b.  Click on the floating Whatsapp button on the left side of the page.
        c.  Verify that the URL is "https://api.whatsapp.com/send?phone=972544945333".
        d.  Verify that the response status code is lower than 400.
        e.  Scroll down to the bottom of the page.  
        f.  Click on the Linkedin button.  
        g.  Verify that the URL is "https://api.whatsapp.com/send?phone=972544945333".
        h.  Verify that the response status code is lower than 400.
        i.  Click on the static Whatspp button.
        j.  Verify that the URL is "https://api.whatsapp.com/send?phone=972544945333".
        k.  Verify that the response status code is lower than 400.
        l.  Click on the Facebook button.
        m.  Verify that the URL is "https://api.whatsapp.com/send?phone=972544945333".
        n.  Verify that the response status code is lower than 400.
        o.  Click on the Herolo button (Globe icon).
        p.  Verify that the URL is "https://api.whatsapp.com/send?phone=972544945333".
        q.  Verify that the response status code is lower than 400.
        r.  Click on "Back To Top" button on the right side of the page.  
        s.  Verify that the page scrolled up.


    6.  Thank You page - Check page buttons integrity:
        a.  Open 'Thank You' page.
        b.  Click on 'עבור לאתר' button.
        c.  Verify that the URL is "https://herolo.co.il/".
        d.  Verify that the response status code is lower than 400.
        e.  Click on Facebook button.
        f.  Verify that the URL is "https://www.facebook.com/Herolofrontend".
        g.  Verify that the response status code is lower than 400.
        h.  Click on Instagram button.
        i.  Verify that the URL is "https://www.instagram.com/herolofrontend/".
        j.  Verify that the response status code is lower than 400.
        k.  Click on Linedin button.
        l.  Verify that the URL is "https://www.linkedin.com/company/herolo/".
        m.  Verify that the response status code is lower than 400.
        n.  Click on 'חזור' button.
        o.  Verify transferion to the main page.

        
    7. Main page - Popup E2E test:
        a.  Open the main page.
        b.  Scroll down to the bottom of the page.
        c   Wait 35 seconds for the popup to appear.
        d   Fill a name (Eg: Automation).
        e   Fill a valid email (Eg: Automation@Test.com).
        f   Fill a valid phone number (Eg: 050-1234567).
        g   Click on 'לחצו לקבלת שיחה' button.
        h   Verify that the form was sent.

    
    8. Main page - Popup validation test:
        a.  Open the main page.
        b.  Scroll down to the bottom of the page.
        c.  Wait 35 seconds for the popup to appear.
        d.  Verify that "שדה שם הוא שדה חובה" error message is presented.
        e.  Verify that "שדה אימייל הוא שדה חובה" error message is presented.
        f.  Verify that "שדה טלפון הוא שדה חובה" error message is presented.
        g.  Fill a valid name (Eg: Automation).
        h.  Fill the email field with an invalid email (Eg: Automation@Test).
        i   Fill the phone number field with letters (Eg: Ab12#).
        j   Verify that "כתובת אימייל לא חוקית" error message is presented.
        k   Verify that "מספר טלפון לא חוקי" error message is presented.
        l   Click on the 'X' button to close the popup.
        m.  Verify popup was closed.