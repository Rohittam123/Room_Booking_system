# JPA PostgreSQL CRUD Project

A complete Java Maven project to perform **CRUD operations** on **Countries** and **Regions** tables using **JPA (Jakarta Persistence API)** with **PostgreSQL** database.  
No native Hibernate queries — pure JPA `EntityManager` based implementation.

---

## 📂 Project Structure
Jpa_project/
 ├── src/main/java/
 │    └── com/Hibernate_jpa/
 │          ├── entity/
 │          │      ├── Country.java
 │          │      └── Region.java
 │          │
 │          ├── DAO/
 │          │      ├── CountryDAO.java
 │          │      └── RegionDAO.java
 │          │
 │          ├── Utility/
 │          │      └── JPAUtil.java
 │          │
 │          └── App.java
 │
 ├── src/main/resources/
 │      └── META-INF/
 │             └── persistence.xml
 │
 └── pom.xml


---

##  Features

- Add new **Region**
- Add new **Country** linked with Region
- Fetch single **Region** or **Country**
- Update **Region name**
- Update **Country name**
- Delete **Country**
- Delete **Region**
- Clean and structured DAO pattern
- Pure **JPA EntityManager** implementation (no native Hibernate queries)
- Centralized **JPA Utility class** for EntityManagerFactory management
- PostgreSQL integration using **Hibernate 7.x**

---

## 🛠️ Technologies Used

- **Java 17**
- **Jakarta Persistence API (JPA) 2.1**
- **Hibernate ORM 7.0.6.Final**
- **PostgreSQL 17.5**
- **Maven 4.x**
- **Spring Tool Suite (STS)**

---

## 📑 Prerequisites

- Java 17+ installed and environment variables set  
- PostgreSQL installed and running  
- Maven installed and configured  
- Spring Tool Suite 
- Database `my_db` created in PostgreSQL on port `5433`

# Dependencies
  Managed via Maven inside pom.xml:

-org.hibernate:hibernate-core

-jakarta.persistence:jakarta.persistence-api

-org.postgresql:postgresql
      <img width="647" height="290" alt="Screenshot 2025-07-15 011731" src="https://github.com/user-attachments/assets/823b210b-870a-4f6d-b43f-9249968270ca" />


# Output Of The Application
       <img width="1366" height="720" alt="Screenshot 2025-07-15 004614" src="https://github.com/user-attachments/assets/c0c6924f-45b7-463e-9418-c0a87cef31ad" />

# Contact Details 
        Name: Rohit Tamkhane
        E-mail: rohittamkhane76@gmail.com
        Linkdin: [![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)]([https://www.linkedin.com/in/tera-username/](https://www.linkedin.com/in/rohit-tamkhane-a85455241?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app))




