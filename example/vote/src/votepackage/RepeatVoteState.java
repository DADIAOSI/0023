package votepackage;

import java.util.*;

/**
 * 
 */
public class RepeatVoteState implements VoteState {

    /**
     * Default constructor
     */
    public RepeatVoteState() {
    }

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}