package inheritance;
import java.util.Date;

public class Client extends Person{
    private int clientID;
    private Date registrationDate;
    private boolean vip;
    private static int clientCounter;
    
    public Client (Date registrationDate, boolean vip, String name, char gender, int age, String address){
        
        super(name, age);
        this.clientID = + + Client.clientCounter;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getClientID() {
        return clientID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String detail() {
        return super.detail() + " Is VIP: " + this.vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("clientID=").append(this.clientID);
        sb.append(", registrationDate=").append(this.registrationDate);
        sb.append(", vip=").append(vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
