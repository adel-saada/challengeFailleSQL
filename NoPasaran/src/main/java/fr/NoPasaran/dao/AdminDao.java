package fr.NoPasaran.dao;

import fr.NoPasaran.entities.Utilisateur;
import fr.NoPasaran.exception.DAOException;

public interface AdminDao {

    /**
     * <b>Objectif</b> : Vérifier identification administrateur
     * 
     * @param admin
     *            (propriété : login et pass)
     * @return booleen
     * @throws DAOException
     */
    boolean estValideIdentification( Utilisateur utilisateur ) throws DAOException;

}