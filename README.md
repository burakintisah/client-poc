# Client Poc

## Description
- This is a POC project for comparing feign client and rest template
- 

## [Comparison](https://docs.google.com/spreadsheets/d/1zVsDFCW9ivHuABxSp58eoPBdq9dpIXFQGKmr5u7wtBg/edit#gid=0)
Feign Client | Rest Template  
--- | ---
URLs are not hardcoded. | Not an officially supported library  
Allows you to abstract the mechanics of calling a REST service | Abstraction can make it harder to control and customize details if needed   
Feign provides a very easy way to call RESTful services. | 
No need to write tests. - We are writing only interface | 

## To do List
- [x] Add Swagger to the Project
- [x] Implementing Feign Client
- [x] Implementing Rest Client
- [x] Implementing Controller / Service Layers
- [ ] Implementing Interceptor for Feign Client 
- [ ] Implementing Interceptor for Rest Template

## Built With
- Jdk17
- Spring Boot 3.1.3

