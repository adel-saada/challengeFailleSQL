# challengeFailleSQL
un site web java qui sert de challenge pour l'exploitation des failles SQL

techno : Spring boot | JQuery | Bootstrap | Tomcat | Maven

Ouverture faille MySQL : Utilisation de l'objet Statement au lieu de PrepareStatement  

Installation
1. Lancer le Script "nopasaran.sql" dans une base de donnée MySQL pour la création et le remplissage de la database.
2. Modifier l'username et le password MySQL inscrit dans le script "AdminDaoImpl.java" (présent dans le packetage "fr.NoPasaran.dao") 
3. Modifier eventuellement le nom de l'admin dans le script et dans le fichier "robots.txt"


Résolution
1. La page "/robots.txt" donne une indication sur le lien du formulaire "faillible" ainsi que le nom d'un admin du site web.
2. Exploitation d'une faille SQL sur la page /666 avec le nom adéquat de l'administrateur

Exemple  
      
      login : admin' # 
      
      password : saisi qui sera commenté quoi qu'il arrive..
  
