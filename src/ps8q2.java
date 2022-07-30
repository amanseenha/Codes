class cellphone
{
    String status;
    public void setStatus (String currentStatus)
    {
    status=currentStatus;
    }
    public String getStatus()
    {
        return status;
    }
}
public class ps8q2 {
    public static void main(String[] args) {
        cellphone Samsung = new cellphone();
        Samsung.setStatus("Ringing");
        System.out.println("Your CellPhone is: " + Samsung.getStatus());
        Samsung.setStatus("Vibrating");
        System.out.println("Your CellPhone is: " + Samsung.getStatus());
    }
}
