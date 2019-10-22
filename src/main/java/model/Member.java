package model;

public class Member {

    private String name;
    private Level level;
    private boolean alreadyInGroup;

    public Member(String name, Level level){
        this.name = name;
        this.level = level;
        alreadyInGroup = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {

        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public boolean isAlreadyInGroup() {
        return alreadyInGroup;
    }

    public void setAlreadyInGroup(boolean alreadyInGroup) {
        this.alreadyInGroup = alreadyInGroup;
    }

    @Override
    public String toString() {
        return "Member: " + name + ", model.Level: " + level + ";";
    }
}
