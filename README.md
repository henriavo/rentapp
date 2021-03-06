# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Create database. Create user for Spring. Grant a ton of privileges. 
```dtd
        create database rentapp_db; -- Creates the new database
        
        create user 'springuser'@'%' identified by '5DCm4pTweKaF5'; -- Creates the user

        grant all on rentapp_db.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

### add new Resident to db
```dtd
curl localhost:8080/demo/addResident -d firstName=Demar -d lastName=DeRozan -d email=kingofthefourt@buckets.com -d mobilePhone=312-555-1234
```

### add new Landlord to db
```dtd
curl localhost:8080/demo/addLandlord -d firstName=Lebron -d lastName=James -d email=ohiokid@nba.com -d mobilePhone=312-555-5678
```

### update email for Resident
```dtd
curl -X POST "localhost:8080/demo/updateResidentEmail?recordId=1&email=demo@bulls.com"
```

### update email for Landlord
```dtd
curl -X POST "localhost:8080/demo/updateLandlordEmail?recordId=1&email=demo@bulls.com"
```
