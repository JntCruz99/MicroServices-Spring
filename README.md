
```mermaid
graph TD

subgraph Gateway
    Gateway --> |Proxy| FuncionárioService
    Gateway --> |Proxy| FolhaService
end

subgraph FuncionárioService
    FuncionárioService --> |Register| EurekaServer
    FuncionárioService --> |Data| Database
end

subgraph FolhaService
    FolhaService --> |Register| EurekaServer
    FolhaService --> |Data| Database
end

subgraph EurekaServer
    EurekaServer --> |Discovery| FuncionárioService
    EurekaServer --> |Discovery| FolhaService
end

subgraph Database
    Database --> FuncionárioService
    Database --> FolhaService
end

classDef default fill:#FFF,stroke:#000,stroke-width:2px;
classDef service fill:#6DBE45,stroke:#000,stroke-width:2px;
classDef eureka fill:#1E90FF,stroke:#000,stroke-width:2px;
classDef database fill:#FFA500,stroke:#000,stroke-width:2px;

class Gateway default
class FuncionárioService service
class FolhaService service
class EurekaServer eureka
class Database database

```
