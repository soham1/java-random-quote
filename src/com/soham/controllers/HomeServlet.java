package com.soham.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String[] quotes = { "Kids are like buckets of disease that live in your house. By Louis C. K.",
			"Acting is merely the art of keeping a large group of people from coughing. By Sir Ralph Richardson",
			"I know of only one bird - the parrot - that talks; and it can't fly very high. By Wilbur Wright",
			"For the most part, fear is nothing but an illusion. When you share it with someone else, it tends to disappear. By Marilyn C. Barrick",
			"You are the shuckiest shuck faced shuck in the world! By James Dashner",
			"Insane means fewer cameras! By Ally Carter",
			"Freedom is that instant between when someone tells you to do something and when you decide how to respond. By Dr. Jeffrey Borenstein",
			"Great spirits have always encountered violent opposition from mediocre minds. By Albert Einstein",
			"Fall seven times, stand up eight. A Japanese Proverb",
			"Those who stand for nothing fall for anything. By Alexander Hamilton" };
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextJSP = "/index.jsp";
		Random rand = new Random();
		int n = rand.nextInt(quotes.length);
		request.setAttribute("quote", quotes[n]);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);

	}

}
