package com.company;

//imports
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.Scanner;

import static java.sql.DriverManager.getConnection;

public class universityDB {

    public static void main(String[] args) {

        Connection connection = null;

        //connection steam to connect to the SQLite database.

        //try catch exception handling, since we will be interracting with outside the JAVA program.
        try {
            //code that will make the connection.


            //path of our university database
            String url = "jdbc:sqlite:C:\\Users\\HAM\\Documents\\Databases\\universityDB.db";

            // accepts a connection string, and returns a connection instance "connection"
            //Path is given to establish a connection.
            connection = getConnection(url);
            System.out.println("Connection successfully established!");

            //statement to be able to run SQL statements
            Statement myStmnt = connection.createStatement();

            //String variable to QUERY SQL SYNTAX ON:
            String sqlStmnt;


            //resultSet returning selected SQL query statement and displaying it.
            ResultSet myRs;

            //Scanner taking user input.
            Scanner myScan = new Scanner(System.in);

            String selection = myScan.nextLine();
            boolean choosing = true;

            while(choosing){
                System.out.println("Welcome to the University Database \n You have the following options\n " +
                                "1:Get the average grade for a course.\n" +
                                "2:Get the average grade for a student." );

                int choice = myScan.nextInt();

                switch (choice){

                    case 1:
                        System.out.println("Type in the courseID, for the course you seek to calculate the average of")
                        String courseID = myScan.nextLine();
                        //passing the SQL statement
                        sqlStmnt = ""
                }





            }




        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (connection != null) {
                try {
                    //closing the connection
                    connection.close();
                } catch (SQLException e) {
                    //Catching an exception with a message
                    System.out.println("ERROR: Something went wrong ! " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    //Static methods

    //Method that gets average score for an individual student

    //Method gets average score for the Course
    static public void averageCourseScore(ResultSet myRs)
            throws SQLException {
        if (myRs == null) {
            System.out.println("Requested record not found!");
            while (myRs != null & myRs.next()) {
                String courseID = myRs.getString("courseID");
                float avgGrade = myRs.getFloat("AVG(Grade)");
                System.out.println("The average grade score for the " + courseID + " is " + avgGrade);


            }

        }
    }

    //Method gets average scare for the student.
    static public void averageStudentScor(ResultSet myRs)
            throws SQLException {
        if (myRs == null) {
            System.out.println("Record for the student, has not been found!");
            while (myRs != null & myRs.next()) {
                String studentID = myRs.getString("AttendingStudent");
                Float avgGrade = myRs.getFloat("(AVG(Grade)");
            }
        }
    }
/*
    static public void insertGrade(ResultSet myRs) {
        throws SQLException {
            if (myRs == null) {
                System.out.println("Requested record not found");
                while (myRs != null & myRs.next())
                    int studentGrade = myRs.getInt("(INSERT(Grade)");
                }
            }
        } */
    }


