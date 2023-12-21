Feature: Gestion des accessoires pour un ordinateur

  Scenario: Ajouter un accessoire à un ordinateur
    Given un ordinateur existe avec le stockage 500, la RAM 16, le nom "MonPC", la marque "MarqueX", le processeur "ProcesseurY", et le système d'exploitation "OSZ"
    When j'ajoute un accessoire nommé "Clavier" de couleur "noir", de type "avec fil", et de prix 30.0 à l'ordinateur
    Then la liste d'accessoires de l'ordinateur devrait contenir "Clavier"

  Scenario: Supprimer un accessoire d'un ordinateur
    Given un ordinateur existe avec le stockage 500, la RAM 16, le nom "MonPC", la marque "MarqueX", le processeur "ProcesseurY", et le système d'exploitation "OSZ"
    And j'ai ajouté un accessoire nommé "Souris" de couleur "noir", de type "sans fil", et de prix 20.0 à l'ordinateur
    When je supprime l'accessoire nommé "Souris" de l'ordinateur
    Then la liste d'accessoires de l'ordinateur ne devrait pas contenir "Souris"

  Scenario: Calculer le prix total des accessoires d'un ordinateur
    Given un ordinateur existe avec le stockage 500, la RAM 32, le nom "Asus", la marque "MarqueX", le processeur "ProcesseurY", et le système d'exploitation "OSZ"
    And j'ai ajouté un accessoire nommé "Clavier" de couleur "noir", de type "avec fil", et de prix 30.0 à l'ordinateur
    And j'ai ajouté un accessoire nommé "Souris" de couleur "noir", de type "sans fil", et de prix 20.0 à l'ordinateur
    When je calcule le prix total des accessoires de l'ordinateur
    Then le prix total devrait être 50.0

