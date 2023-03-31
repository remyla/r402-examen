# Validation TP2

## Démarrer

Vous pouvez lancer le projet dans IntelliJ en ouvrant le fichier
`pom.xml`

## Fichiers

Le ficher `src/main/java/Ensemble.java` donne un exemple de classe
avec sa spécification, mais sans implémentation (uniquement les
signatures des méthodes, et le strict minimum pour permettre la
compilation). L'objectif est de produire une classe similaire, à
écrire dans un autre fichier.

Le fichier `src/test/java/EnsembleTests.java` donne un exemple de
tests pour la classe ci-dessus. Dans un développement piloté par les
tests, on écrit les tests immédiatement après la spécification, et
_avant_ l'implémentation. Vous pouvez exécutez les tests pour vérifier
qu'ils échouent tous.



## Exercice

Spécifier une structure de données: une liste chaînée:
https://fr.wikipedia.org/wiki/Liste_cha%C3%AEn%C3%A9e).
Le but est d’écrire une spécification pour la classe qui modélise la
structure de données. Vous ne devez pas implémenter la structure de donnée
en question, mais uniquement définir les éléments nécessaires aux utilisateurs
de cette classe (signature des méthodes + documentation). Le fichier
Ensemble.java fournit un exemple d’une telle spécification.

### Rédigez la spécification :
1. Définissez l’ensemble des méthodes publiques de la classe (y compris
le ou les constructeurs), en spécifiant le type de retour, celui des
paramètres, et éventuellement les exceptions qu’une méthode peut
retourner (avec le mot-clé throws).
2. Spécifiez chaque méthode : décrivez ses paramètres et le résultat
qu’elle produit. Si le comportement de la méthode dépend d’éléments
autre que ses paramètres (par exemple l’état de la structure de don-
née, ou bien une variable globale), décrivez cette dépendance. De
même, si la méthode modifie l’état du système, décrivez ce compor-
tement.
3. Documentez aussi la classe avec une brève description de son rôle, et
de ses invariants éventuels.

### Écrire des tests d’après la spécification
En utilisant JUnit, écrivez une suite de test correspondant à la
spécification. Chaque méthode devra avoir au moins un test.
Si la spécification décrit plusieurs cas possibles pour une méthode, les tests
devront couvrir ces différents cas. Le fichier EnsembleTests.java fournit
un exemple d’une suite de test correspondant à la spécification de la classe
Ensemble.
Lancez les tests écrits pour vous assurer qu’ils échouent (cette étape sert
à valider le fait que les tests contrôlent effectivement quelque chose : un test
qui passe sans implémentation ne contrôle rien).