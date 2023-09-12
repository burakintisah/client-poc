# Client Poc

## Description

- This is a POC project for comparing feign client & web client & rest template

## [Comparison](https://docs.google.com/spreadsheets/d/1zVsDFCW9ivHuABxSp58eoPBdq9dpIXFQGKmr5u7wtBg/edit#gid=0)

| Feign Client                                                                            | WebClient                                                                                                                     | Rest Template                                                             |                                                             
|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| Allows you to abstract the mechanics of calling a REST service                          | Reactive and Non-Blocking: superior when dealing with applications that require high levels of concurrency and responsiveness | Abstraction can make it harder to control and customize details if needed |
| Feign provides a very easy way to call RESTful services.                                | Functional Programming paradigms                                                                                              | Not an officially supported library                                       |
| No need to write tests. - We are writing only interface                                 | Better support for streaming data                                                                                             |                                                                           |
| Clear and concise syntax: makes it easier to create and maintain client code.           |                                                                                                                               |                                                                           |
| Annotation Support: code readability and alignment with existing Spring-based projects. |                                                                                                                               |                                                                           |

## To do List

- [x] Add Swagger to the Project
- [x] Implementing Feign Client
- [x] Implementing Rest Client
- [x] Implementing WebClient Client
- [x] Implementing Controller / Service Layers
- [ ] Implementing Interceptor for Feign Client
- [ ] Implementing Interceptor for Web Client
- [ ] Implementing Interceptor for Rest Template

## Built With

- Jdk17
- Spring Boot 3.1.3
