package fr.NoPasaran.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.NoPasaran.entities.Utilisateur;
import fr.NoPasaran.exception.DAOException;
import fr.NoPasaran.exception.DaoConfigurationException;
public class AdminDaoImpl implements AdminDao {

    @Override
    public boolean estValideIdentification( Utilisateur utilisateur ) throws DAOException {
    	
    	
        String URL = "jdbc:mysql://localhost:3306/nopasarandb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String USERNAME = "root";
        String PASSWORD = "motDePasseMySQL";
        
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch ( ClassNotFoundException e ) {
            throw new DaoConfigurationException( "Le driver est introuvable dans le classpath.", e );
        }
    	
        try ( Connection connection = DriverManager.getConnection( URL, USERNAME, PASSWORD ); ) {
            try ( Statement statement = connection.createStatement() ) {

            	String select_id_admin = "SELECT * FROM Administrateur WHERE nom='"+utilisateur.getNom()+"' AND motDePasse='"+utilisateur.getMotDePasse()+"'";

                try ( ResultSet resulSet = statement.executeQuery(select_id_admin) ) {
                    if ( resulSet.next() ) {
                        return true;
                    }
                    return false; 
                }
            }
        } catch ( SQLException e ) {
            throw new DAOException( e );
        }
    }
}