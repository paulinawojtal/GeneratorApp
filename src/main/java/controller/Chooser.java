package controller;

import model.Level;
import model.Member;

import java.util.List;
import java.util.Random;
import model.groups.*;
import model.AllMembersList;

public class Chooser {

    private Random rand = new Random();
    private Hero hero = new Hero();
    private Cosmonaut cosmonaut = new Cosmonaut();
    private HollywoodWife hollywoodWife = new HollywoodWife();
    private Gamer gamer = new Gamer();
    private List<Member> allMembersList = AllMembersList.getAllMembersList();


    public void reGroup() {

        int count = 0;
        int allCount = 0;
        Level level;

        do {
            int randNum = rand.nextInt(allMembersList.size());
            //System.out.println(randNum);

            Member randMemberChosen = allMembersList.get(randNum);

            if (!randMemberChosen.isAlreadyInGroup()) {
                level = randMemberChosen.getLevel();
                checkLevelAndAddToList(level, randMemberChosen);
                randMemberChosen.setAlreadyInGroup(true);
                count++;
            }

            allCount++;

            //System.out.println("iteration count: " + count);
            //System.out.println("All iteration count: " + allCount);
        }
        while (countNotInUse() != 0);
    }

    private int countNotInUse() {
        int count = 0;

        for (Member member : allMembersList) {
            if (!member.isAlreadyInGroup()) {
                count++;
            }
        }
        return count;
    }

    private void checkLevelAndAddToList(Level level, Member randMemberChosen) {
        switch (level) {
            case STARTER:
                if (hero.getLevelCount(Level.STARTER) == 0) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.STARTER) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.STARTER) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.STARTER) <= 1) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case JUNIOR:
                if (hero.getLevelCount(Level.JUNIOR) == 0) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.JUNIOR) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.JUNIOR) <= 1) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.JUNIOR) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case ORDINARY:
                if (hero.getLevelCount(Level.ORDINARY) <= 2) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.ORDINARY) <= 1) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.ORDINARY) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.ORDINARY) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case COMMANDO:
                if (cosmonaut.getLevelCount(Level.COMMANDO) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.COMMANDO) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.COMMANDO) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
        }
    }

    public void printGroups() {
        System.out.println("Hero group: ");
        hero.getHeroes().forEach(System.out::println);

        System.out.println();

        System.out.println("Cosmonaut group: ");
        cosmonaut.getCosmonauts().forEach(System.out::println);

        System.out.println();

        System.out.println("HollywoodWife group: ");
        hollywoodWife.getHollywoodWifes().forEach(System.out::println);

        System.out.println();

        System.out.println("Gamer group: ");
        gamer.getGamers().forEach(System.out::println);

        int checkerAmountOfAllMembersUsed = hero.getListSize() + cosmonaut.getListSize()
                + hollywoodWife.getListSize() + gamer.getListSize();

        System.out.println("amount in all groups: " + checkerAmountOfAllMembersUsed); // should be 20
    }

}
