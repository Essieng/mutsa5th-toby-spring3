package com.example.tobyspring3.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
