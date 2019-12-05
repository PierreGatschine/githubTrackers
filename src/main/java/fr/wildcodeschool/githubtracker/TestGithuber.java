package fr.wildcodeschool.githubtracker;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TestGithuber
 */
@WebServlet("/")
public class TestGithuber extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(TestGithuber.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TestGithuber.LOGGER.info("L'utilisateur à demandé la page index.jsp");

		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);

	}

}