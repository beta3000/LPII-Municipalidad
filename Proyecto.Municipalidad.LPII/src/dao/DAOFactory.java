package dao;

import interfaces.ComboDAO;
import interfaces.InformeDAO;
import interfaces.MemorandoDAO;
import interfaces.TallerMecanicoDAO;
import interfaces.UsuarioDAO;
import interfaces.VehiculoDAO;


public abstract class DAOFactory {
	// los posibles or�genes de datos
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    // Existir� un m�todo get por cada DAO que exista en el sistema
    // Ejemplo:
    //public abstract ArticuloDAO getArticuloDAO();
    // registramos nuestros daos
    public abstract VehiculoDAO getVehiculoDAO();
    public abstract TallerMecanicoDAO getTallerMecanicoDAO();
    public abstract ComboDAO getComboDAO();
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract MemorandoDAO getMemorandoDAO();
    public abstract InformeDAO getInformeDAO();

    
    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){
       	case MYSQL:
        	   return new MySqlDAOFactory();
        	case XML:
        	    //return new XmlDAOFactory();
        	case ORACLE:
        	    //return new OracleDAOFactory();
        	/*case DB2:
        	    return new Db2DAOFactory();
        	case SQLSERVER:
        	    return new SqlServerDAOFactory();
        	case XML:
        	    return new XmlDAOFactory();*/
        	default:
        	    return null;
        }
     }
}