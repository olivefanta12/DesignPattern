package ex09;

import ex09.lib.DB;
import ex09.lib.Driver;
import ex09.lib.MariaDB;
import ex09.lib.OracleDB;

public class DBFactory {
    private static DBFactory instance = new DBFactory();
    private DBFactory(){}

    public static DBFactory getInstance() {
        return instance;
    }

    public DB createDB(Driver driver){
        if(driver.getProtocol().equals("maria")){
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        } else if (driver.getProtocol().equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        }else {
            throw new NullPointerException("db driver not fount exception");
        }
    }
}
