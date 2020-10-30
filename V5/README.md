# jpaGestionEnsup

Client Restful : projet maven simple avec Jersey 1.19 qui interroge le serveur selon un url et récupère la donnée transmise

## Prérequis

- JDK 8
- Maven 3.6.3
- Le serveur web hébergeant le webservice du projet V1 doit être lancé et accessible

## Installation

1. Cloner le dépôt
2. Dans le fichier `V3\src\main\java\eu\ensup\presentation\Lanceur.java` modifier l'URL en remplaçant `127.0.0.1` par l'adresse du serveur web hébergeant le webservice.
3. A la racine du projet V4, ouvrir un invite de commande et taper l'instruction `mvn clean package` pour compiler le projet
4. Une fois compilé, exécuter le fichier `V3\target\demoWebServiceV2-0.0.1-SNAPSHOT.jar` pour accéder à l'application
