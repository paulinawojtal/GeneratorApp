package model.groups;

import model.Level;
import model.Member;
import model.Group;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Group {

    private List<Member> heroes = new ArrayList<>();

    // Getter
    public List<Member> getHeroes(){
        return heroes;
    }

    // add new model.groups.Hero
    @Override
    public void addMember(Member member) {
        getHeroes().add(member);
    }

    @Override
    public int getListSize(){
        return getHeroes().size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;

        for (int i = 0; i < getListSize(); i++) {
            if (getHeroes().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }
}
