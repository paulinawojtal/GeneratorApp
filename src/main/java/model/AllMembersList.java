package model;

import model.Level;
import model.Member;

import java.util.Arrays;
import java.util.List;

public class AllMembersList {

    public static List<Member> getAllMembersList() {
        List<Member> allMembersList = Arrays.asList(new Member("starter1", Level.STARTER),
                new Member("starter2", Level.STARTER),
                new Member("starter3", Level.STARTER),
                new Member("starter4", Level.STARTER),
                new Member("starter5", Level.STARTER),
                new Member("junior1", Level.JUNIOR),
                new Member("junior2", Level.JUNIOR),
                new Member("junior3", Level.JUNIOR),
                new Member("junior4", Level.JUNIOR),
                new Member("junior5", Level.JUNIOR),
                new Member("ordinary1", Level.ORDINARY),
                new Member("ordinary2", Level.ORDINARY),
                new Member("ordinary3", Level.ORDINARY),
                new Member("ordinary4", Level.ORDINARY),
                new Member("ordinary5", Level.ORDINARY),
                new Member("ordinary6", Level.ORDINARY),
                new Member("ordinary7", Level.ORDINARY),
                new Member("commando1", Level.COMMANDO),
                new Member("commando2", Level.COMMANDO),
                new Member("commando3", Level.COMMANDO));

        return allMembersList;
    }

}
