package model.groups;

import model.Level;
import model.Member;
import model.Group;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Group {

    private List<Member> gamers = new ArrayList<Member>();

    // Getter
    public List<Member> getGamers(){
        return gamers;
    }

    // add gamer to list
    @Override
    public void addMember(Member member) {
        gamers.add(member);
    }

    // get size
    @Override
    public int getListSize(){
        return gamers.size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;

        for (int i = 0; i < getListSize(); i++) {
            if (getGamers().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }
}
