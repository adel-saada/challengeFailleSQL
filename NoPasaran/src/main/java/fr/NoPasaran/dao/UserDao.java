package fr.NoPasaran.dao;

import fr.NoPasaran.entities.Utilisateur;
import fr.NoPasaran.exception.DAOException;

public interface UserDao {
    /**
     * <b>Objectif</b> : Vérifier identification utilisateur
     * 
     * @param admin
     *            (propriété : login et pass)
     * @return booleen
     * @throws DAOException
     */
    boolean estValideIdentification( Utilisateur utilisateur ) throws DAOException;

}
