@authentification
Feature: Authentification - OrangeHRM
  ETQ utilisateur je souhaite m'authentifier

  @cnx-cas-passant
  Scenario: Tester l'interface de connection
    Given Je me connecte sur l'application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le password "admin123"
    And Je clique sur le boutton LOGIN
    Then Je me redirige vers la page home "Welcome"