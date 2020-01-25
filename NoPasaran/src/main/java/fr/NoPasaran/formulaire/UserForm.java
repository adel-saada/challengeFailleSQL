package fr.NoPasaran.formulaire;

import java.util.HashMap;
import java.util.Map;

import fr.NoPasaran.dao.AdminDao;
import fr.NoPasaran.dao.AdminDaoImpl;
import fr.NoPasaran.dao.UserDao;
import fr.NoPasaran.dao.UserDaoImpl;
import fr.NoPasaran.entities.Utilisateur;

public class UserForm {

    public static final String  PARAM_LOGIN                = "login-username";
    public static final String  PARAM_PASS                 = "login-password";

    private static final String MSG_CONNEXION_VALIDE       = "Connexion validée";
    private static final String MSG_ERREUR_CONNEXION_ADMIN = "Erreur de connexion";

    private String              resultat;
    private Map<String, String> erreurs                    = new HashMap<String, String>();

    private UserDao				userDao ;
    
    public UserForm( UserDao userDao ) {
        this.userDao = userDao;
    }
    /**
     * <b>Objectif</b> : Vérifie si l'utilisateur saisie dans le formulaire
     * existe dans la BDD
     * 
     * @param request
     * @return booleen
     */
    public Utilisateur connecterUtilisateur(Utilisateur utilisateur) {

    	boolean estValide = userDao.estValideIdentification( utilisateur );
    	 
        if ( estValide ) {
            resultat = MSG_CONNEXION_VALIDE;
        } else {
            resultat = MSG_ERREUR_CONNEXION_ADMIN;
            setErreur( PARAM_LOGIN, "Login ou mot de passe invalide" );
        }
        return utilisateur;
    }

    /*-------------------GETTERS SETTERS -------------------*/

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
   
    

}