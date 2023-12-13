<div align="center">
<h1 align="center">
<img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="100" />
<br>JAVA-SPRING-MICROSERVICES</h1>
<h3>◦ Unleashing Power, One Microservice at a Time!</h3>
<h3>◦ Developed with the software and tools below.</h3>

<p align="center">
<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=flat&logo=Docker&logoColor=white" alt="Docker" />
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java" />
</p>
<img src="https://img.shields.io/github/license/sameershanbhag/Java-Spring-Microservices?style=flat&color=5D6D7E" alt="GitHub license" />
<img src="https://img.shields.io/github/last-commit/sameershanbhag/Java-Spring-Microservices?style=flat&color=5D6D7E" alt="git-last-commit" />
<img src="https://img.shields.io/github/commit-activity/m/sameershanbhag/Java-Spring-Microservices?style=flat&color=5D6D7E" alt="GitHub commit activity" />
<img src="https://img.shields.io/github/languages/top/sameershanbhag/Java-Spring-Microservices?style=flat&color=5D6D7E" alt="GitHub top language" />
</div>

---

## 📖 Table of Contents
- [📖 Table of Contents](#-table-of-contents)
- [📍 Overview](#-overview)
- [📦 Features](#-features)
- [📂 repository Structure](#-repository-structure)
- [⚙️ Modules](#modules)
- [🚀 Getting Started](#-getting-started)
    - [🔧 Installation](#-installation)
    - [🤖 Running Java-Spring-Microservices](#-running-Java-Spring-Microservices)
    - [🧪 Tests](#-tests)
- [🛣 Roadmap](#-roadmap)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👏 Acknowledgments](#-acknowledgments)

---


## 📍 Overview

The Java-Spring-Microservices repository offers a comprehensive framework for building scalable applications using a microservices architecture. With components divided into separate functions such as inventory, notification, order, and product handling, the service also features an API gateway for routing and a discovery server for managing inter-service communication. The architecture makes use of Docker for containerization, Maven Wrapper for consistent builds, and Spring Boot for robust testing. Providing resilience, load balancing, and database interactions, it offers a complete infrastructure for Java-based applications.

---

## 📦 Features

|    | Feature            | Description                                                                                                        |
|----|--------------------|--------------------------------------------------------------------------------------------------------------------|
| ⚙️ | **Architecture**   | This is a robust Java-based Microservice architecture with an API Gateway, Discovery Server, and services for inventory, notifications, orders, products. |
| 📄 | **Documentation**  | The repository lacks README and comments in the code. Proper documentation about setup, usage, and code explanation is lacking.|
| 🔗 | **Dependencies**   | The project uses Spring Boot, Eureka Server for service discovery, Maven and Docker for build and deployment, and MongoDB as the database.|
| 🧩 | **Modularity**     | Code is well organized into separate microservices for specific functions, enhancing modularity and ease of modifications.|
| 🧪 | **Testing**        | Some rudimentary tests are in place, although the overall test strategy doesn't appear to be comprehensive for all services. |
| ⚡️  | **Performance**    | With implemented load balancing and resilient inter-service communication, the system is designed to perform efficiently. |
| 🔐 | **Security**       | CSRF protection is disabled, authorization through OAuth2 with JWTs is implemented, and Eureka server endpoints are accessible to all.|
| 🔀 | **Version Control**| Clear use of Git as a version control system, but there is a lack of commits on the repository, which shows the infrequency of updates.|
| 🔌 | **Integrations**   | Interactions between different microservices are managed via the API gateway and the Eureka discovery server. Kafka is used for event handling.|
| 📶 | **Scalability**    | The system is scalable due to the microservice architecture and use of Spring Boot. However, it would be challenging without a proper continuous integration setup.|


---


## 📂 Repository Structure

```sh
└── Java-Spring-Microservices/
    ├── api-gateway/
    │   ├── Dockerfile
    │   ├── Dockerfile.layered
    │   └── src/
    │       └── main/
    ├── discovery-server/
    │   └── src/
    │       └── main/
    ├── inventory-service/
    │   ├── .mvn/
    │   │   └── wrapper/
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   └── src/
    │       ├── main/
    │       └── test/
    ├── notification-service/
    │   └── src/
    │       └── main/
    ├── order-service/
    │   ├── .mvn/
    │   │   └── wrapper/
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   └── src/
    │       ├── main/
    │       └── test/
    └── product-service/
        ├── .mvn/
        │   └── wrapper/
        ├── mvnw
        ├── mvnw.cmd
        └── src/
            ├── main/
            └── test/

```

---


## ⚙️ Modules

<details closed><summary>Discoveryserver</summary>

| File                                                                                                                                                                                                    | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| ---                                                                                                                                                                                                     | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [DiscoveryServerApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/discovery-server/src/main/java/com/coffeecoder/discoveryserver/DiscoveryServerApplication.java) | The Java Spring microservices code establishes an API gateway, and various services (inventory, notification, order, and product) each with main and test directories. The discovery-server service, enabled with Netflix's Eureka Server, provides registry and failure recovery for distributed microservices. The solution facilitates service discovery allowing microservices to find and communicate with each other with Dockerfile for containerization. |

</details>

<details closed><summary>Inventory-service</summary>

| File                                                                                                         | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ---                                                                                                          | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [mvnw](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/mvnw)         | The provided code represents a script for running a Maven project without requiring the user to install and set up Maven manually. The script checks system specifics, sets environment variables, searches the project base directory, and downloads the Maven wrapper jar file if it's not found. It also checks for JAVA_HOME and JAVACMD. The script verifies the SHA-256 sum of the Maven wrapper jar file, executes Maven commands, and handles project configurations.                                                             |
| [mvnw.cmd](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/mvnw.cmd) | The presented code is an Apache Maven Wrapper startup batch script for a Java application. The script initiates the build process, validates the Java installation by checking the JAVA_HOME environment variable, and establishes directory paths. It also handles the Maven wrapper's download if it's missing, and validates its SHA-256 sum. Besides, it supports environment variables to enable echoing, pausing and customization of Maven parameters. If any issues arise during execution, it returns an appropriate error code. |

</details>

<details closed><summary>Inventoryservice</summary>

| File                                                                                                                                                                                                                 | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| ---                                                                                                                                                                                                                  | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [InventoryServiceApplicationTests.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/test/java/com/coffecoder/inventoryservice/InventoryServiceApplicationTests.java) | The provided code and directory layout illustrate a microservices architecture built with Java Spring, which encompasses an API gateway, and discovery, inventory, notification, order, and product services. Each service, excluding the gateway and discovery server, includes Maven wrapper files. The Java code represents a basic Spring Boot test for the Inventory Service, ensuring its application context loads correctly.                              |
| [InventoryServiceApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/InventoryServiceApplication.java)           | The directory structure represents the microservices architecture for an application in Java Spring, including services for API Gateway, Discovery, Inventory, Notifications, Orders, and Products. The Java code snippet is for an inventory service application, which uses Spring Boot with integrated discovery client for service registry, though it has a comment block for loading data into an inventory repository that currently is not in operations. |

</details>

<details closed><summary>Resources</summary>

| File                                                                                                                            | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| ---                                                                                                                             | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [data.sql](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/resources/data.sql) | The code snippet belongs to a microservices-based architecture developed using Java and Spring. Different services like API Gateway, Discovery Server, Inventory, Notification, Order, and Product service have their independent components. Each service has its source code and testing files. The SQL script in the Inventory Service creates a inventory_service database if it doesn't exist, enabling storage management for inventory data. |
| [data.sql](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/resources/data.sql)     | The provided code corresponds to a directory tree for a Java microservices architecture built with Spring, composed of separate services for API gateway, discovery server, and distinct inventory, order, notifications, and product sub-systems. Each service includes its own source and testing area. The specific script shown creates a database for the order service if it doesn't already exist.                                           |

</details>

<details closed><summary>Controller</summary>

| File                                                                                                                                                                                                  | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ---                                                                                                                                                                                                   | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [InventoryController.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/controller/InventoryController.java) | This is a microservices architecture in Java using the Spring framework, comprising of an API gateway, a discovery server, and four distinct microservices: inventory, notification, order, and product services. Each microservice has its own source code and test suite. The provided Java code snippet specifically handles HTTP GET requests to the /api/v1/inventory endpoint in the inventory service, checking the stock availability for a list of product SKU codes.                           |
| [OrderController.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/controller/OrderController.java)                 | The code is part of a Java Spring application implementing microservices architecture. Specifically, it entails an order service utilizing resilience methods for communication with an inventory service. Via an API, it allows placement of orders. The asynchronous placeOrder method is equipped with circuit breaking, time limiting, and retry mechanisms for handling failures. A fallback method is in place to provide a default response in case of execution problems in downstream services. |
| [ProductController.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/controller/ProductController.java)         | The code specifies a products controller in a microservices-based Java Spring application. It includes routes to create a product and get all products via ProductService. The architecture contains different folders for various service modules like order-service, inventory-service with their respective Docker files, sources and tests. An API gateway and a discovery server for managing inter-service communication are also evident in the directory structure.                              |

</details>

<details closed><summary>Repository</summary>

| File                                                                                                                                                                                                  | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| ---                                                                                                                                                                                                   | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [InventoryRepository.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/repository/InventoryRepository.java) | The directory tree represents a microservices architecture with services for API gateway, discovery, inventory, notifications, orders, and products. Each service has source files and some with Maven wrapper files for managing the project's build. In the InventoryRepository.java file, an interface extends JpaRepository for interacting with the inventory data, and declares a method to find inventory items by their SKU codes.                                                                                           |
| [OrderRepository.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/repository/OrderRepository.java)                 | The code and directory structure represent a microservices system developed using Java and Spring. It includes services for order management, inventory, notifications, product details, a discovery server, and an API gateway. The specific Java code is an interface for the Order Repository, extending JpaRepository, allowing CRUD operations on orders, based on Spring Data JPA.                                                                                                                                             |
| [ProductRepository.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/repository/ProductRepository.java)         | This is a Java-Spring framework for microservices architecture, containing services for Product, Order, Inventory, Notification, a Discovery Server and an API Gateway. Each service includes source (src) & test directories. ProductRepository.java interfaces with MongoDB as a repository for product data, extending MongoRepository to use its functionalities. The mvnw and mvnw.cmd files, part of the Maven Wrapper, ensure the Maven build system's correct version usage. Docker files are included for containerization. |

</details>

<details closed><summary>Service</summary>

| File                                                                                                                                                                                         | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| ---                                                                                                                                                                                          | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [InventoryService.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/service/InventoryService.java) | The code is a part of a Spring-based microservices architecture consisting of six microservices: Api-gateway, Inventory-service, Order-service, etc. Focusing on InventoryService.java in inventory-service, it contains a method isInStock which queries the inventory repository using SKU codes. It retrieves the stock status and returns a list of InventoryResponse objects, indicating whether each item is in stock.                                                                |
| [OrderService.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/service/OrderService.java)                 | The given code belongs to a Java Spring microservices architecture and presents an OrderService in the order-service directory. The service manages order placements by checking product availability using the inventory-service. If products are available, it saves the order, sends a notification via Kafka, and returns a success message. If not, an exception is thrown. It also uses tracing for service interactions. The service is transactional, aiding in data consistency.   |
| [ProductService.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/service/ProductService.java)         | The presented Java Spring code defines a ProductService within a microservices architecture. It provides functionality for creating a new product; data is received via a ProductRequest object, persisted in a repository, and logged. It also retrieves all products from the repository, maps each product to a ProductResponse object, and returns the responses in a list. Dockerfiles and Maven wrapper files indicate built-in support for containerization and standardized builds. |

</details>

<details closed><summary>Model</summary>

| File                                                                                                                                                                           | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| ---                                                                                                                                                                            | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [Inventory.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/model/Inventory.java)   | This code is part of a Java-Spring-Microservices project encompassing different modules e.g. API gateway, discovery server, and various services including inventory, notification, order, and product. The provided Java class (Inventory) represents the inventory model in the inventory service. It uses Jakarta Persistence for ORM mapping, and Lombok library for simplifying data encapsulation. It has attributes like id, skuCode, and quantity, with necessary getters, setters, and constructors. |
| [Order.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/model/Order.java)                   | The code is part of a Java Spring microservice system involving services for orders, notifications, inventory, products, and an API gateway with a discovery server. In the Order.java class, ORM is used with Jakarata persistence. It represents an order table with fields for ID, order number, and a list of order line items. It utilizes Lombok annotations for boilerplate code reduction. The service can presumably be built and run using Maven, as suggested by the.mvn directories.              |
| [OrderLineItems.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/model/OrderLineItems.java) | The directory structure represents a Java-Spring-Microservices project. Individual services like API gateway, discovery server, and domain-focused microservices (inventory, notification, order, and product services) are present. Maven Wrapper is used for ensuring consistent Maven builds. In the Order Service, a POJO class `OrderLineItems` represents an entity in a database with properties like ID, SKU code, price, and quantity to model line items in an order.                               |
| [Product.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/model/Product.java)           | The given code is part of a Java Spring microservices architecture, including services for products, orders, inventory, notifications, a discovery server, and an API gateway. The specific code is a Product model class in the product service, providing a structure for product data with fields for id, name, description, and price. It is annotated for MongoDB mapping and set up for Lombok's automatic builder, data, and constructors support.                                                     |

</details>

<details closed><summary>Dto</summary>

| File                                                                                                                                                                                       | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| ---                                                                                                                                                                                        | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [InventoryResponse.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/inventory-service/src/main/java/com/coffecoder/inventoryservice/dto/InventoryResponse.java) | The code describes an Inventory Response model in a Java Spring Microservices architecture. It's part of the inventory service, representing output data with inventory status. Annotations imply usage of the Lombok library for automatic boilerplate code generation such as getters, setters, constructors, and a builder pattern. It has two fields-skuCode (representing inventory identifier) and isInStock (representing availability status).                                                                                                        |
| [OrderLineItemsDto.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/dto/OrderLineItemsDto.java)         | The given project is a modular Java Spring microservices architecture. It includes modules for an API gateway, a discovery server, and service modules for inventory, notifications, orders, and products. The presented code defines an OrderLineItemsDto class, which is a data transfer object used in the order service to hold data related to ordered items, including an id, SKU code, quantity, and price.                                                                                                                                            |
| [OrderRequest.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/dto/OrderRequest.java)                   | The provided code sample belongs to a Java-based microservices architecture using Spring, particularly the order service. The architecture includes an API Gateway, a discovery server, and various services for inventory, notifications, orders, and products. In the OrderRequest.java file, a data transfer object (DTO) is created, employing Lombok annotations for simplifying boilerplate code. The DTO includes a list of OrderLineItemsDto for managing individual order items.                                                                     |
| [InventoryResponse.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/dto/InventoryResponse.java)         | The provided code defines a Java-based microservice architecture using Spring, divided into different components: API gateway, Discovery Server, Inventory, Order, Product, and Notification services. Each, barring the Gateway and Discovery Server, features Maven Wrapper for build automation. In particular, a data transfer object (DTO) InventoryResponse in the order-service is detailed, which carries information on SKU code and stock availability.                                                                                             |
| [ProductRequest.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/dto/ProductRequest.java)           | The provided code and directory structure represent a Java Spring microservices architecture. Four specific microservice modules (`inventory-service`, `notification-service`, `order-service`, `product-service`) use this structure. An `api-gateway` routes requests, while a `discovery-server` manages inter-service communication. The `ProductRequest` Java class in the `product-service` module captures details(name, description, price) about a product request, using auto-generated getters, setters, and constructors from the Lombok library. |
| [ProductResponse.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/dto/ProductResponse.java)         | The code represents a Java-Spring-Microservices project structure consisting of an API gateway, discovery-server, and multiple microservices: inventory, notification, order, product. Each microservice has a Maven wrapper for build automation. The snippet is a Data Transfer Object (DTO) in ProductService, used for encapsulating product data such as id, name, description, and price, and is equipped with getter/setter, builder, and constructors through Lombok annotations.                                                                     |

</details>

<details closed><summary>Order-service</summary>

| File                                                                                                     | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ---                                                                                                      | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [mvnw](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/mvnw)         | The script is a shell startup script for the Maven Wrapper, a tool to run Maven builds with a specific version of Maven. It checks various environmental variables, including JAVA_HOME and MAVEN_OPTS, and establishes platform compatibility (Cygwin, Darwin, or Mingw). It determines the Maven project base directory, downloads and validates the Maven Wrapper jar file if it doesn't exist, sets MAVEN_OPTS, and finally initializes and starts the Maven Wrapper with the pre-established configuration variables and any command-line arguments. |
| [mvnw.cmd](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/mvnw.cmd) | The given code is a batch script for Maven Wrapper, used for initiating Maven builds in the Java project order-service. It verifies the JAVA_HOME path, finds the Maven base directory, and checks whether Maven Wrappers are available. If not available, it downloads the Maven wrapper from a specified URL. The script also reads any additional JVM configurations, prepares the Maven command line arguments, and executes the Maven operation. It handles errors and sets the suitable exit status.                                                |

</details>

<details closed><summary>Orderservice</summary>

| File                                                                                                                                                                                                 | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ---                                                                                                                                                                                                  | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [OrderServiceApplicationTests.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/test/java/com/coffecoder/orderservice/OrderServiceApplicationTests.java) | The provided directory structure and code represent a Spring-based microservices system composed of an API gateway, discovery server, and four service modules: inventory, notification, order, and product. Each service has a source (src) and test script directory. The order service includes a basic Spring Boot test class, OrderServiceApplicationTests, that checks if the application context successfully loads.                                              |
| [OrderServiceApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/OrderServiceApplication.java)           | The provided Java Spring Microservices code base includes services for managing orders, inventory, notifications, and products. Each service incorporates source code and tests. The OrderServiceApplication initiates the Order Service microservice and enables it as a discovery client to communicate with the Discovery Server. Dockerfile in the API gateway aids containerization. The Maven Wrapper present suggests independence from local Maven installation. |

</details>

<details closed><summary>Event</summary>

| File                                                                                                                                                                               | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| ---                                                                                                                                                                                | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [OrderPlacedEvent.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/event/OrderPlacedEvent.java) | The code defines a Java object in a Spring-based microservices architecture for order management operations. It represents an OrderPlacedEvent with an order number field. This event is likely used within the system to signal when an order is placed. The project also includes an API gateway, a discovery server, and additional services for inventory, notifications, and products, each with its source code and Docker implementation files. |

</details>

<details closed><summary>Config</summary>

| File                                                                                                                                                                              | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| ---                                                                                                                                                                               | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [WebClientConfig.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/order-service/src/main/java/com/coffecoder/orderservice/config/WebClientConfig.java) | The provided code is part of a Java Spring Microservices project. Specifically, it is a configuration class within the order-service module named WebClientConfig. This class contains a single method that creates a load-balanced WebClient.Builder bean. This bean can be used to make HTTP requests to other services with load balancing capabilities, optimizing resource usage within distributed microservice environments.                                                                                                                     |
| [SecurityConfig.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/api-gateway/src/main/java/com/coffeecoder/apigateway/config/SecurityConfig.java)      | The code provided is a configuration class utilizing Spring Security to deal with security concerns in a microservices-based Java Enterprise application. It disables Cross-Site Request Forgery (CSRF), allows all access to Eureka server endpoints, and requires authentication for all other requests, particularly those to /api/**. It also establishes the requirement for OAuth2 authentication, using JSON Web Tokens (JWTs). The service includes an API gateway, discovery server, and order, inventory, notification, and product services. |

</details>

<details closed><summary>Product-service</summary>

| File                                                                                                       | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| ---                                                                                                        | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [mvnw](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/mvnw)         | The directory tree represents a Java Spring Microservices project. It contains an API gateway for routing, a discovery server for locating services, and separate microservices for inventory management, notifications, order processing, and product management. Each microservice, including the API gateway, has its own source code. The project is Docker compatible, with Dockerfiles provided. The use of the Maven Wrapper (mvnw) enables building the project without installing Maven. |
| [mvnw.cmd](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/mvnw.cmd) | This is a directory structure for a Java Spring microservices based application. It contains an API gateway, discovery server and four microservices namely; Inventory, Notification, Order, and Product. Each service along with the gateway has its own Dockerfiles for containerization. Maven wrapper files (.mvnw, mvnw.cmd) in the services facilitate building the project, ensuring the usage of correct Maven version.                                                                   |

</details>

<details closed><summary>Productservice</summary>

| File                                                                                                                                                                                                         | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| ---                                                                                                                                                                                                          | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [ProductServiceApplicationTests.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/test/java/com/coffecoder/productservice/ProductServiceApplicationTests.java) | This code represents a test class for a product service application within a larger, microservices-oriented Java Spring application. The test class is configured to use a MockMvc instance, an ObjectMapper, and a MongoDB test container. There are test cases for product creation and retrieving all products, verifying API response statuses. The code uses Spring's @SpringBootTest, @Testcontainers, and @AutoConfigureMockMvc annotations, and leverages Testcontainers for MongoDB integration testing. |
| [ProductServiceApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/product-service/src/main/java/com/coffecoder/productservice/ProductServiceApplication.java)           | This Java project employs Spring Boot and Microservices architecture, composed of an API Gateway, Discovery Server, and four service modules: Inventory, Notification, Order, and Product. Each module has its native Maven wrapper for dependency management. The Product Service code demonstrates a Spring Boot application enabling a Discovery Client, allowing this service to register itself with the Discovery Server for service discovery.                                                             |

</details>

<details closed><summary>Notificationservice</summary>

| File                                                                                                                                                                                                                    | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| ---                                                                                                                                                                                                                     | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [OrderPlacedEvent.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/notification-service/src/main/java/com/coffeecoder/notificationservice/OrderPlacedEvent.java)                             | The given code represents a microservices-based Java Spring application architecture. It consists of different services such as api-gateway, discovery-server, inventory, notification, order, and product services, each with its own source code and testing. Specifically, the OrderPlacedEvent.java under the notification service is a simple data container for orderNumber. It employs Lombok library to automatically generate getter, setter, no-argument, and all-argument constructors. |
| [NotificationServiceApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/notification-service/src/main/java/com/coffeecoder/notificationservice/NotificationServiceApplication.java) | This Java Spring microservice project incorporates an API Gateway, a discovery server, and separate services for inventory, notifications, orders, and products. The presented code is for the notification service. It runs a Spring Boot application and listens to a Kafka topic to handle notifications. When an order event is received, it prints and logs a message indicating a notification has been sent for that order number. Future scope includes sending email notifications.       |

</details>

<details closed><summary>Api-gateway</summary>

| File                                                                                                                       | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| ---                                                                                                                        | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [Dockerfile.layered](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/api-gateway/Dockerfile.layered) | The code defines a multi-staged Dockerfile for an API Gateway in a Spring-based microservices architecture. It utilizes Java 17 JRE from eclipse-temurin and works in layered mode to extract components of a Spring Boot jar file into separate image layers. It exposes the application on port 8080, and launches it via org.springframework.boot.loader.JarLauncher. The architecture includes separate services for inventory, notifications, orders, and products, alongside a discovery server. |
| [Dockerfile](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/api-gateway/Dockerfile)                 | The code describes a hierarchy for a Java Spring Microservices project, comprising several services including API Gateway, Discovery Server, and business services for inventory, notifications, orders, and products. Each service has its source code, some with Maven wrappers. The api-gateway service is Dockerized using a Dockerfile to create an image with OpenJDK 17, copying a JAR file into the image and setting it as the entrypoint.                                                    |

</details>

<details closed><summary>Apigateway</summary>

| File                                                                                                                                                                                | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| ---                                                                                                                                                                                 | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [APIGatewayApplication.java](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/api-gateway/src/main/java/com/coffeecoder/apigateway/APIGatewayApplication.java) | The provided tree structure and code represents a Java Spring microservices-based application. It includes an API Gateway for routing requests, a discovery server for service discovery, and separate microservices for managing inventory, orders, products, and notifications. Every microservice, apart from the gateway and discovery server, has a Maven wrapper for build automation. The gateway's Java code launches the application and enables service discovery. |

</details>

---

### 🔧 Installation

1. Clone the Java-Spring-Microservices repository:
```sh
git clone https://github.com/sameershanbhag/Java-Spring-Microservices
```

2. Change to the project directory:
```sh
cd Java-Spring-Microservices
```

3. Install the dependencies:
```sh
mvn clean install
```

### 🤖 Running Java-Spring-Microservices

```sh
java -jar target/myapp.jar
```

### 🧪 Tests
```sh
mvn test
```

---

## 🤝 Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Submit Pull Requests](https://github.com/sameershanbhag/Java-Spring-Microservices/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/sameershanbhag/Java-Spring-Microservices/discussions)**: Share your insights, provide feedback, or ask questions.
- **[Report Issues](https://github.com/sameershanbhag/Java-Spring-Microservices/issues)**: Submit bugs found or log feature requests for this project.

#### *Contributing Guidelines*

<details closed>
<summary>Click to expand</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.
   ```sh
   git clone <your-forked-repo-url>
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear and concise message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.

Once your PR is reviewed and approved, it will be merged into the main branch.

</details>

---

## 📄 License


This project is protected under the [MIT](https://choosealicense.com/licenses/mit/) License. For more details, refer to the [LICENSE](https://github.com/sameershanbhag/Java-Spring-Microservices/tree/master/LICENSE.txt) file.

---

## 👏 Acknowledgments

- Sameer Shanbhag
- [Programming Techie](https://www.youtube.com/@ProgrammingTechie)

[**Return**](#Top)

---

