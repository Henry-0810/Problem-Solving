package PS9;

public interface Game {
    public abstract void setRules(String[] rules);
    public abstract void setPlayersPerTeam(int team);
    public abstract String[] getRules();
    public abstract int getPlayersPerTeam();
}
