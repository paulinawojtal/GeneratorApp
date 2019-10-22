package model;

import model.Level;
import model.Member;

public interface Group {

    // add new model.Member
    void addMember(Member member);

    // get size of the list
    int getListSize();

    // count number of members in list with specific level
    int getLevelCount(Level level);

}