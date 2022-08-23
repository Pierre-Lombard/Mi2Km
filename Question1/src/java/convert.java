
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class convert {
    public Double distance;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        //Convert the distance into km
        this.distance = distance * 1.609;
    }
    
}
