# R4.02 - Examen

## 1 Validation CM

Répondez aux 2 questions ci-dessous directement dans ce fichier.

### Question 1
Mettez dans l'ordre ces actions dans un dévelopement piloté par des tests (test-driven development)

a) écriture du corps de la fonction  
b) écriture d'un test unitaire qui échoue  
c) écriture de la spécification de la fonction  
d) amélioration du corps de la fonction  
e) écriture d'un autre test unitaire qui échoue 

Réponse: c b a e d

### Question 2
Décrivez pour un logiciel ce qu'est:

* sa maintenance évolutive:

La maintenance évolutive d'un logiciel est sa capacité à être maintenu suite à
des évolutions de code. En qualité de logiciel, il est important d'avoir une 
bonne maintenance évolutive au niveau du logiciel développé. En effet, un 
logiciel qui ne disposerait pas d'une bonne maintenance évolutive verrait
le coût de la ligne de code augmenter de manière exponentielle à chaque évolution.
Cela rendrait le logiciel très couteux et complexe à améliorer.

* sa maintenance corrective:  

La maintenance corrective d'un logiciel est sa capactié à être maintenu suite à
la correction d'une anomalie. Un logiciel ne disposant pas d'une bonne 
maintenance corrective verrait le coût de chaque correctif augementer de manière
 exponentielle ce qui le rendrait très difficile à corriger. Cela empêcherait le 
 logiciel de durer dans le temps car s'il n'est pas possible d'y effectuer des
 correctifs, le logiciel serait notamment soumis à des failles qui seraient 
 longues à corriger.


À quel moment peut-on écrire des nouveaux tests?

* pour la maintenance évolutive:

Pour la maintenance évolutive, il est possible de faire à la fois des tests avant
de commencer le développement de l'évolution (test-driven developpement) mais aussi
après. En effet, le fait d'écrire les tests avant permet de définir clairement
les fonctionnalités qui seront ajoutés ainsi que les cas particuliers qu'il faudra tester.
Il reste cependant possible de rédiger les tests après le développement mais cela reste moins
avantageux car il faudra apporter de nouvelles modifications notamment pour les cas particuliers
qui seront testés.

* pour la maintenance corrective:

Pour la maintenance corrective, il faut écrire des tests avant de corriger 
l'anomalie. En effet, cela permettra de vérifier que l'on reproduit correctement
l'anomalie et que le test ne passe pas avant de la corriger pour vérifier si
ce même test passe.



---
