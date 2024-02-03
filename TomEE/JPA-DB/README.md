### Key Files
- [resources/META-INF/beans.xml] (resources/META-INF/beans.xml)  - For working CDI, this file should exist even with empty content.
- [resources/META-INF/persistence.xml] (resources/META-INF/persistence.xml)
- [webapp/WEB-INF/resources.xml] (webapp/WEB-INF/resources.xml)

### HOW To Run
- Create DB table(s) and insert data using scripts under /resources/sql directory
- Then,
```shell
mvn clean install tomee:run
```
``` text 
http://localhost:8080/api/user/1 
returns
User{id=1, firstName='Jihwan', middleName='null', lastName='Kim', userId='jihwan11', email='jihwan11@gmail.com', address='null', createdOn=2024-02-03 00:00:00.0, lastLogin=null}
```
