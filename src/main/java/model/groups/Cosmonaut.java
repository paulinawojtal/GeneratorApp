package model.groups;

import model.Level;
import model.Member;
import model.Group;

import java.util.ArrayList;
import java.util.List;

public class Cosmonaut implements Group {

    private List<Member> cosmonauts = new ArrayList<Member>();

    // Getter
    public List<Member> getCosmonauts(){
        return cosmonauts;
    }

    // add new Junior
    @Override
    public void addMember(Member member) {
        getCosmonauts().add(member);
    }

    @Override
    public int getListSize(){
        return getCosmonauts().size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;

        for (int i = 0; i < getListSize(); i++) {
            if (getCosmonauts().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }

}
