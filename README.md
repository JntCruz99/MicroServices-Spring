
```mermaid

graph LR

subgraph Gateway
    subgraph Funcionário Service
        subgraph Eureka Server
            Gateway --> |Register| Eureka
            Funcionário --> |Discover| Eureka
            Folha --> |Discover| Eureka
        end
    end

    subgraph Folha Service
        Folha --> |Discover| Eureka
    end
end

classDef default fill:#FFF,stroke:#000,stroke-width:2px;
classDef service fill:#6DBE45,stroke:#000,stroke-width:2px;
classDef eureka fill:#1E90FF,stroke:#000,stroke-width:2px;
classDef gateway fill:#FFA500,stroke:#000,stroke-width:2px;

class Gateway gateway
class Funcionário service
class Folha service
class Eureka eureka
```
