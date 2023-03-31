# R4.02 - Examen Thibaut LAHAIE

## 1 Validation CM

Répondez aux 2 questions ci-dessous directement dans ce fichier.

### Question 1
Mettez dans l'ordre ces actions dans un dévelopement piloté par des tests (test-driven development)

a) écriture du corps de la fonction
b) écriture d'un test unitaire qui échoue
c) écriture de la spécification de la fonction
d) amélioration du corps de la fonction
e) écriture d'un autre test unitaire qui échoue

Réponse: b c a e d

### Question 2
Décrivez pour un logiciel ce qu'est:

* sa maintenance évolutive:
La maintenance évolutive d'un logiciel est la veille sur le logiciel étant mis en place afin de permettre l'ajout de nouvelles fonctionalités en fonctions des besoins clients. L'interet est de permettre a l'application de changer en fonction des nouveaux besoins


* sa maintenance corrective:
la maintenance corrective d'un logiciel est la veille réalisé sur un logiciel afin de corriger les éventuelles anomalies pouvant être détéctés par les différents acteurs et utilisateur agissant sur l'application. Cette veille permet a l'application de rester fonctionnelle sur la durée et de rapidement constater les bug et éventuels régréssions.



À quel moment peut-on écrire des nouveaux tests?

* pour la maintenance évolutive:
Les nouveaux tests peuvent être écrit au moment ou le développeur prend connaissance d'une nouvelle fonctionalité a mettre en place. Les tests échouerons au début du développement des nouvelles fonctionnalités et finiront par être validés une fois les fonctionnalités mis en place.



* pour la maintenance corrective:
Concernant la maintenance corrective, il est difficile de prévoir l'ensemble des cas pour lesquels des erreurs pourrait survenir, c'est pourquoi le développeur doit écrire un maximum de test au début du développement d'une fonctionnalité afin de suivre le fonctionnement des autres fonctionnalités. Il est donc nécessaire de créer de nouveau tests des lors qu'une anomalie ou régréssion est detecter, l'objectif est que celle-ci ne se reproduise plus a l'avenir.


---
