# dio-santander-bootcamp-CloudRailway

```mermaid
classDiagram
    class User {
        -String name
    }

    class Account {
        -String number
        -String agency
        -Double balance
        -Double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" --> "1" Account
    User "1" --> "0..*" Feature
    User "1" --> "1" Card
    User "1" --> "0..*" News
