package votepackage;

import java.util.*;

/**
 * 
 */
public interface VoteState {


    /**
     * @param user 
     * @param voteItem 
     * @param voteManager
     */
    public void vote(String user, String voteItem, VoteManager voteManager);

}