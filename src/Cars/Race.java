package Cars;

import java.util.List;


public class Race {
    public Integer length;
    public String route;
    public Integer prizePool;
    public List<Car> participants;

    public Race(){}

    public Race (int length, String route, int prizePool, List<Car> participants){
        setLength(length);
        setRoute(route);
        setPrizePool(prizePool);
        setParticipants(participants);
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return this.prizePool;
    }

    public void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public List<Car> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<Car> participants) {
        this.participants = participants;
    }


}
