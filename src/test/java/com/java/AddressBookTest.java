package com.java;


import junit.framework.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static com.java.JdbcConnection.jdbcConnection;

public class AddressBookTest {
    @Test

    public void retrievingDataByName() throws SQLException, AddressBookException {
        String query="Select * from addressbook where firstName ='Tom'";
        Assert.assertTrue(jdbcConnection(query));
    }

}
