package model;

public class User {

	private String name;
    private String pass;
    private int score;
    private boolean connected;

    public User() {
    	
    }

    public User(String userName, String passW) {
        this.name = userName;
        this.pass = passW;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getScore() {
        return score;
    }

    public void addScoreUser(int aScore) {
        this.score += aScore;
    }

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}
}
