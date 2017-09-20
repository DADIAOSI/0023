package test;
import votepackage.VoteManager;

public class Main {
   public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
