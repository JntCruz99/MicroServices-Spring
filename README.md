
```mermaid
graph TD;

subgraph Gateway
    subgraph Funcionário Service
        Funcionário --> Eureka
    end;

    subgraph Folha Service
        Folha --> Eureka
    end;

    Gateway -->|Proxy| Funcionário
    Gateway -->|Proxy| Folha
end;

subgraph Eureka Server
    Funcionário -->|Discover| Eureka
    Folha -->|Discover| Eureka
end;

Funcionário -->|Data| Banco de Dados
Folha -->|Data| Banco de Dados;

classDef default fill:#FFF,stroke:#000,stroke-width:2px;
classDef service fill:#6DBE45,stroke:#000,stroke-width:2px;
classDef eureka fill:#1E90FF,stroke:#000,stroke-width:2px;
classDef database fill:#FFA500,stroke:#000,stroke-width:2px;

class Gateway default;
class Funcionário Service service;
class Folha Service service;
class Eureka Server eureka;
class Banco de Dados database;


```
