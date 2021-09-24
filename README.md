# Spring-Boot-Sample-Rest-API
- Spring Boot를 사용하여 Java로 간단한 REST API를 구현한 예제입니다.
- `/rest_api_sample_test.json` 파일을 talend api tester등 각종 api tester에서 import하여 테스트 할 수 있습니다.

# Requirements

- Spring Boot 2.5.3
- Gradle 7.1.1
- OpenJDK 11
- PostgreSQL 13.3 

# Used Libraries

- `spring-boot-starter-web`
- `spring-boot-devtools`
- `spring-boot-starter-data-jpa` -> Java ORM Implementation
- `postgresql` -> DBMS
- `lombok` -> getter/setter 쉽게 적용
- `mapstruct` -> entity <-> dto 변환 적용
- `querydsl`
  - QueryDSL 적용전 반드시 Intellij 기준 Gradle-Tasks-other-compileJava 실행하여 Q클래스 생성해야함

# Project Structure
```plain text
src
└─── main
     ├─── java.com.example
     │    ├─── DemoApplication.java
     │    ├─── doamain1
     │    │    ├─── controller
     │    │    ├─── dto
     │    │    ├─── mapper
     │    │    └─── repository
     │    │         └─── custom
     │    │              └─── implementation
     │    │    └─── service
     │    │         └─── implementation
     │    └─── entities
     └─── resource
          └─── application.yml
```

# Implement Function

- CRUD
- pagination
