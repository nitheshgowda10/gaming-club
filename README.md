# Gaming Club

A demo Spring Boot project for managing gaming club operations. This project showcases a RESTful backend system for managing members, games, recharges, and transactions, using Java and Spring technologies.

## Features

- **Member Management:** Register, update, and manage club members.
- **Game Management:** Add and track games available in the club.
- **Recharge System:** Handle prepaid balance recharges for members.
- **Transaction Tracking:** Record and view all member transactions.
- **API Documentation:** OpenAPI integration for easy API exploration.
- **MySQL Integration:** Store and retrieve data using MySQL.

## Project Structure

- `src/main/java/com/nithesh/gamingclub/`
  - `GamingclubApplication.java`: Main Spring Boot application class.
  - `Dtos/`: Data Transfer Objects for operations like recharging, membership, and playing games.
    - `DoRechargeDto.java`
    - `MembershipDto.java`
    - `PlayGameDto.java`
  - `controller/`: REST controllers for handling API requests.
    - `GameController.java`
    - `MemberController.java`
    - `RechargeController.java`
    - `TransactionController.java`
  - `entities/`: JPA entities for domain modeling.
    - `Collection.java`
    - `Game.java`
    - `Member.java`
    - `Recharge.java`
    - `Transaction.java`
  - `repository/`: Spring Data JPA repositories for data access.
    - `CollectionRepository.java`
    - `GameRepository.java`
    - `MemberRepository.java`
    - `RechargeRepository.java`
    - `TransactionRepository.java`
  - `services/`: Business logic services for core operations.
    - `GameService.java`
    - `MemberService.java`
    - `RechargeService.java`
    - `TransactionService.java`

## Tech Stack

- Java 21
- Spring Boot (Web, Data JPA)
- MySQL
- Lombok
- Springdoc OpenAPI
- Maven

## Getting Started

1. Clone the repository.
2. Set up your MySQL database and configure credentials in `application.properties`.
3. Use Maven Wrapper to run:  
   `./mvnw spring-boot:run`
4. Access the API and OpenAPI docs at the provided endpoints.

## License

This is a demo project for educational and learning purposes.
