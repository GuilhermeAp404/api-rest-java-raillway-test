# Api para teste com de deploy com Railway
Java API RESTful criada para um teste de deploy com Railway


## Diagrama de classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -float balance
        -float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -float limit
    }

    class News {
        -String icon
        -String descripition
    }

    User "1" --> "1" Account
    User "1" --> "1" Card
    User "1" --> "many" Feature
    User "1" --> "many" News
```
