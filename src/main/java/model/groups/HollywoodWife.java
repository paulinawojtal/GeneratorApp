package model.groups;

import model.Level;
import model.Member;
import model.Group;

import java.util.ArrayList;
import java.util.List;

public class HollywoodWife implements Group {

    private List<Member> hollywoodWifes = new ArrayList<Member>();

    // Getter
    public List<Member> getHollywoodWifes(){
        return hollywoodWifes;
    }

    // add new wife to list
    @Override
    public void addMember(Member member) {
        hollywoodWifes.add(member);
    }

    @Override
    public int getListSize(){
        return hollywoodWifes.size();
    }

    @Override
    public int getLevelCount(Level level) {
        int Count = 0;

        for (int i = 0; i < getListSize(); i++) {
            if (getHollywoodWifes().get(i).getLevel().equals(level)) {
                Count++;
            }
        }
        return Count;
    }

}
