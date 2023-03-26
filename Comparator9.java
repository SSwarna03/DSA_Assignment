

// Write your Checker class here
class Checker implements Comparator<Player>{
    public int compare(Player pl1, Player pl2){
        if(pl1.score == pl2.score) {
            return pl1.name.compareTo(pl2.name);
        }
        return pl2.score - pl1.score;
    }
}