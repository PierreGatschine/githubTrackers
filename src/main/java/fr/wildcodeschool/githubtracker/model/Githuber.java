package fr.wildcodeschool.githubtracker.model;

/**
 * Githuber
 */
public class Githuber {

	private String name;
	private String email;
	private String login;
	private int id;
	private String avatarUrl;

	public Githuber() {
	}

	public Githuber(String name, String email, String login, int id, String avatarUrl) {
		this.name = name;
		this.email = email;
		this.login = login;
		this.id = id;
		this.avatarUrl = avatarUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

}