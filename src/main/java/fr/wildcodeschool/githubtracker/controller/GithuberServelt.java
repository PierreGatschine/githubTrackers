package fr.wildcodeschool.githubtracker.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.wildcodeschool.githubtracker.TestGithuber;
import fr.wildcodeschool.githubtracker.model.Githuber;

/**
 * GithuberServelt
 */
@WebServlet("/githuber")
public class GithuberServelt extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(TestGithuber.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		GithuberServelt.LOGGER.info("L'utilisateur à demandé la page Githubers.jsp");

		ArrayList<Githuber> listGithuber = new ArrayList<>();

		Githuber git1 = new Githuber("Titi", "titi@gmail.com", "titi", 1, "https://www.adresse1.com");
		Githuber git2 = new Githuber("Grosminet", "grosminet@gmail.com", "grosminet", 2, "https://www.adresse2.com");
		Githuber git3 = new Githuber("Sylvestre", "sylvestre@gmail.com", "sylvestre", 3, "https://www.adresse3.com");
		Githuber git4 = new Githuber("Hector", "hector@gmail.com", "hector", 4, "https://www.adresse4.com");
		Githuber git5 = new Githuber("Babbit", "babbit@gmail.com", "babbit", 5, "https://www.adresse5.com");
		Githuber git6 = new Githuber("Castello", "castello@gmail.com", "castello", 6, "https://www.adresse6.com");

		listGithuber.add(git1);
		listGithuber.add(git2);
		listGithuber.add(git3);
		listGithuber.add(git4);
		listGithuber.add(git5);
		listGithuber.add(git6);

		req.setAttribute("listGithuber", listGithuber);

		this.getServletContext().getRequestDispatcher("/WEB-INF/githuber.jsp").forward(req, resp);
	}

}