package votepackage;

import java.util.*;

/**
 * 
 */
public class BlackVoteState implements VoteState {

    /**
     * Default constructor
     */
    public BlackVoteState() {
    }

    /**
     * @param user 
     * @param voteItem 
     * @param voteManager
     */
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}