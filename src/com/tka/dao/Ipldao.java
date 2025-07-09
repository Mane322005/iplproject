package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.player;

public class Ipldao {

    public List<player> getallpalyer() {
        System.out.println("Welcome from Ipldao");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        List<player> allpalyer = new ArrayList<>();

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ipl";
        String username = "root";
        String password = "root";
        String sql = "SELECT * FROM player";

        try {
            Class.forName(path);
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int jn = resultSet.getInt("jn");
                String pname = resultSet.getString("pname"); // fixed column name
                int run = resultSet.getInt("run");
                int wickets = resultSet.getInt("wickets");
                String tname = resultSet.getString("tname");

                player p = new player(id, jn, pname, run, wickets, tname);
                allpalyer.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (statement != null) statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return allpalyer;
    }
    
    
    public boolean insertPlayer(player p) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ipl";
        String username = "root";
        String password = "root";
        String sql = "INSERT INTO player (id, jn, pname, run, wickets, tname) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Class.forName(path);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, p.getId());
            preparedStatement.setInt(2, p.getJn());
            preparedStatement.setString(3, p.getPname());
            preparedStatement.setInt(4, p.getRun());
            preparedStatement.setInt(5, p.getWickets());
            preparedStatement.setString(6, p.getTname());

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    //update palyer
    public boolean updatePlayer(player p) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ipl";
        String username = "root";
        String password = "root";
        String sql = "UPDATE player SET jn = ?, pname = ?, run = ?, wickets = ?, tname = ? WHERE id = ?";

        try {
            Class.forName(path);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, p.getJn());
            preparedStatement.setString(2, p.getPname());
            preparedStatement.setInt(3, p.getRun());
            preparedStatement.setInt(4, p.getWickets());
            preparedStatement.setString(5, p.getTname());
            preparedStatement.setInt(6, p.getId());  // WHERE clause

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    //delete palyer
    public boolean deletePlayerById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ipl";
        String username = "root";
        String password = "root";
        String sql = "DELETE FROM player WHERE id = ?";

        try {
            Class.forName(path);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();
            return rowsDeleted > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
   }

    

