// this class generated by class com.p6spy.engine.common.Subclasser

package com.p6spy.engine.subclass;

import com.p6spy.engine.spy.*;
import java.sql.*;
import javax.sql.*;
import oracle.jdbc.pool.*;


public class P6OracleDataSource extends oracle.jdbc.pool.OracleDataSource {

  public P6OracleDataSource () throws java.sql.SQLException {
    super();
  }
  public Connection getConnection() throws SQLException {
    return P6SpyDriverCore.wrapConnection(super.getConnection());
  };

  public Connection getConnection(String username, String password) throws SQLException {
    return P6SpyDriverCore.wrapConnection(super.getConnection(username, password));
  };

}
