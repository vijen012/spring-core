We can read values from properties file in 3 ways:-
1. Xml based configuration - companyName, yearOfIncorporation and employeeCount
2. @Value annotation on instance field in bean class - postalCode, it's inject value directly from the property file
3. @Auotwired on setters method and @Value in setters arguments - tagLine