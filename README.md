# Master Microservices with Spring Boot, Docker & Kubernetes

A comprehensive microservices architecture project demonstrating best practices for building, containerizing, and orchestrating microservices using Spring Boot, Docker, and Kubernetes.

## Overview

This project showcases a modern microservices architecture that leverages:
- **Spring Boot** - For building robust, production-ready microservices
- **Docker** - For containerization and consistent deployment environments
- **Kubernetes** - For orchestration, scaling, and management of containerized applications

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java** 17 or higher
- **Maven** 3.6+ or **Gradle** 7.0+
- **Docker** 20.10+
- **Kubernetes** (Minikube, Docker Desktop, or a Kubernetes cluster)
- **kubectl** - Kubernetes command-line tool

## Architecture

This project follows microservices best practices including:
- Service discovery and registration
- API Gateway pattern
- Centralized configuration management
- Distributed tracing and monitoring
- Circuit breakers and resilience patterns
- Event-driven communication

## Technologies

- **Spring Boot** - Application framework
- **Spring Cloud** - Microservices tools and patterns
- **Docker** - Containerization
- **Kubernetes** - Container orchestration
- **Maven/Gradle** - Build automation

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/omeraltan/master-microservices-with-spring-boot-docker-kubernetes.git
cd master-microservices-with-spring-boot-docker-kubernetes
```

### Build the Project

```bash
# Using Maven
mvn clean install

# Using Gradle
./gradlew build
```

### Run with Docker

```bash
docker-compose up -d
```

### Deploy to Kubernetes

```bash
kubectl apply -f k8s/
```

## Project Structure

```
├── services/          # Microservices modules
├── api-gateway/      # API Gateway service
├── config-server/    # Configuration server
├── discovery-server/ # Service discovery
├── docker/           # Docker configurations
└── k8s/              # Kubernetes manifests
```

## Configuration

Configuration files are located in the `config-server` module. Environment-specific configurations can be found in:
- `application.yml` - Base configuration
- `application-dev.yml` - Development environment
- `application-prod.yml` - Production environment

## Testing

```bash
# Run unit tests
mvn test

# Run integration tests
mvn verify
```

## Monitoring & Observability

The project includes:
- Health check endpoints
- Metrics collection
- Distributed tracing
- Log aggregation

## Deployment

### Docker Deployment

```bash
docker-compose up -d
```

### Kubernetes Deployment

```bash
# Apply all Kubernetes manifests
kubectl apply -f k8s/

# Check deployment status
kubectl get pods
kubectl get services
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

**Ömer Altan**

- GitHub: [@omeraltan](https://github.com/omeraltan)

## Acknowledgments

- Spring Boot team for the excellent framework
- Kubernetes community for the powerful orchestration platform
- Docker for containerization technology

---

If you find this project helpful, please consider giving it a star!
