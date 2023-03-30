# Validation TP1

## Démarrer

vous pouvez lancer le projet dans IntelliJ en ouvrant le fichier
`pom.xml`

## Fichiers

Le ficher `src/test/java/TP1Tests.java` est celui où vous placerez les
tests à écrire pour l'exercice. Il contient quelques
exemples de tests simples.

Le fichier `src/main/java/TP1.java` contient les méthodes à
tester. Vous pouvez modifier la méthode `main` pour utiliser le
débogueur. Les autres méthodes ne doivent pas être modifiées.


## Exercice: Défauts, erreurs et défaillances

Pour chacune des méthodes indexOfLastOccurrence, countOddElements,
et average :
1. déterminez le défaut logiciel dans la méthode (si vous ne trouvez pas
le défaut simplement en inspectant le code, écrivez des tests pour vous
aider)
2. écrivez un test qui n’exécute pas le défaut
3. écrivez un test qui exécute le défaut, mais ne provoque pas de dé-
faillance
4. écrivez un test qui provoque une défaillance
5. corrigez le défaut et vérifiez que tous les tests écrits précédemment
passent
