package fr.NoPasaran.dao;
import fr.NoPasaran.entities.Utilisateur;
import fr.NoPasaran.exception.DAOException;

public class UserDaoImpl implements UserDao {


    @Override
    public boolean estValideIdentification( Utilisateur utilisateur ) throws DAOException {
    	
    	
    	return false;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch ( ClassNotFoundException e ) {
//            throw new DaoConfigurationException( "Le driver est introuvable dans le classpath.", e );
//        }
//    	
//        try ( Connection connection = DriverManager.getConnection( URL, USERNAME, PASSWORD ); ) {
//            try ( Statement statement = connection.createStatement() ) {
//
//            	String select_id_admin = "SELECT * FROM Utilisateur WHERE nom='"+utilisateur.getNom()+"' AND motDePasse='"+utilisateur.getMotDePasse()+"'";
//
//                try ( ResultSet resulSet = statement.executeQuery(select_id_admin) ) {
//                    if ( resulSet.next() ) {
//                        return true;
//                    }
//                    return false;
//                }
//            }
//        } catch ( SQLException e ) {
//            throw new DAOException( e );
//        }
    }
}