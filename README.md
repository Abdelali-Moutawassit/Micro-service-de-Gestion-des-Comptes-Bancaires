<h1 align="center">Welcome to Micro-service de Gestion des Comptes Bancaires 👋</h1>
<p>
  <a href="#" target="_blank">
    <img alt="License: Moutawassit Abdelali" src="https://img.shields.io/badge/License-Moutawassit Abdelali-yellow.svg" />
  </a>
  <a href="https://twitter.com/Abdelali-Moutawassit" target="_blank">
    <img alt="Twitter: Abdelali-Moutawassit" src="https://img.shields.io/twitter/follow/Abdelali-Moutawassit.svg?style=social" />
  </a>
</p>

> Le projet consiste à développer un micro-service avec Spring Boot pour gérer des comptes bancaires. Le micro-service permet de créer, lire, mettre à jour, et supprimer des comptes bancaires via une API REST. De plus, il expose une API GraphQL pour interagir avec les données de manière flexible.

## Étapes de Développement

Voici les étapes suivies pour développer le micro-service de gestion des comptes bancaires :

1. **Créer un projet Spring Boot** avec les dépendances : Web, Spring Data JPA, H2, Lombok.
2. **Créer l'entité JPA `Compte`** pour représenter les comptes bancaires.
3. **Créer l'interface `CompteRepository`** basée sur Spring Data pour la persistance des données.
4. **Tester la couche DAO** pour vérifier la connexion avec la base de données H2.
5. **Créer le Web Service Restful** permettant de gérer les comptes (CRUD).
6. **Tester le micro-service** en utilisant un client REST comme Postman.
7. **Générer la documentation Swagger** pour les API Rest.
8. **Exposer une API Restful** en utilisant Spring Data Rest avec des projections.
9. **Créer les DTOs et Mappers** pour transférer les données entre les couches.
10. **Créer la couche Service** pour gérer la logique métier.
11. **Créer un Web Service GraphQL** pour le micro-service afin de permettre des requêtes flexibles.




## Install

```sh
mvn spring-boot:run
```

## Author

👤 **Abdelali Moutawassit**

* Twitter: [@Abdelali-Moutawassit](https://twitter.com/Abdelali-Moutawassit)
* Github: [@Abdelali-Moutawassit](https://github.com/Abdelali-Moutawassit)
* LinkedIn: [@Moutawassit Abdelali](https://linkedin.com/in/Moutawassit Abdelali)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_