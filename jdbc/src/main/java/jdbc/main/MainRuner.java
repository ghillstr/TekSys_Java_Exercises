package jdbc.main;

import java.sql.*;
import java.util.*;

public class MainRuner {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("enter an office code between 1-7:");
		String officeCodeInput = input.next();

		try {

			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
					"root");
			PreparedStatement ps = conn.prepareStatement("select * from employees where officeCode = ?");
			ps.setString(1, officeCodeInput);
			ResultSet results = ps.executeQuery();

			conn.close();

			while (results.next()) {
				System.out.print(results.getInt("employeeNumber") + " ");
				System.out.print(results.getString(2) + " ");
				System.out.print(results.getString(3) + " ");
				System.out.println(results.getString(6) + " ");
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		try {

			System.out.println("\n\n\n Question 1: \n\n\n");
			System.out.println("Enter country:");
			String countryInput = input.next();
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
					"root");
			PreparedStatement ps = conn
					.prepareStatement("select customername,country from customers where country = ?");
			ps.setString(1, countryInput);
			ResultSet results = ps.executeQuery();

			conn.close();

			while (results.next()) {
				System.out.print(results.getString("customername") + " ");
				System.out.println(results.getString("country") + " ");

			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		try {

			System.out.println("\n\n\n Question 2: \n\n\n");
			System.out.println("Enter State: ");
			String stateInput = input.next();
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
					"root");
			PreparedStatement ps = conn.prepareStatement(
					"select customername,state,creditLimit from customers where country = 'USA' AND state = ? AND creditlimit > 100000");
			ps.setString(1, stateInput);
			ResultSet results = ps.executeQuery();

			conn.close();

			while (results.next()) {
				System.out.print(results.getString("customername") + " ");
				System.out.print(results.getString("state") + " ");
				System.out.println(results.getString("creditLimit") + " ");

			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		try {

			System.out.println("\n\n\n Question 3: \n\n\n");
			System.out.println("Enter Price MIN: ");
			long minInput = input.nextLong();
			System.out.println("Enter Price MAX: ");
			long maxInput = input.nextLong();

			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
					"root");
			PreparedStatement ps = conn.prepareStatement(
					"select productCode, productName, buyPrice from products where buyPrice BETWEEN ? AND ?");
			ps.setLong(1, minInput);
			ps.setLong(2, maxInput);
			ResultSet results = ps.executeQuery();

			conn.close();

			while (results.next()) {
				System.out.print(results.getString(1) + " ");
				System.out.print(results.getString(2) + " ");
				System.out.println(results.getString(3) + " ");

			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		try {

			System.out.println("\n\n\n Question 4: \n\n\n");
			System.out.println("NULL(N) or NOT NULL(Y)?");
			String userInput = input.next();
			if (userInput.toLowerCase().equals("y")) {
				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
						"root");
				PreparedStatement ps = conn.prepareStatement(
						"select customerName, country, salesrepemployeenumber from customers where salesrepemployeenumber IS NOT NULL ORDER BY customerName");
				ResultSet results = ps.executeQuery();
				conn.close();
				while (results.next()) {
					System.out.print(results.getString(1) + " ");
					System.out.print(results.getString(2) + " ");
					System.out.println(results.getString(3) + " ");
				}
			} else {
				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root",
						"root");
				PreparedStatement ps = conn.prepareStatement(
						"select customerName, country, salesrepemployeenumber from customers where salesrepemployeenumber IS NULL ORDER BY customerName");
				ResultSet results = ps.executeQuery();
				conn.close();

				while (results.next()) {
					System.out.print(results.getString(1) + " ");
					System.out.print(results.getString(2) + " ");
					System.out.println(results.getString(3) + " ");

				}
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		input.close();

	}
}
