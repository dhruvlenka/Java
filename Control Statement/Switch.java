public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String months = "";
        switch(month){
            case 1:months = "January";
            break;
            case 2:months = "Feburay";
            break;
            case 3:months = "March";
            break;
            case 4:months = "April";
            break;
            case 5:months = "May";
            break;
            case 6:months = "June";
            break;
            case 7:months = "July";
            break;
            case 8:months = "August";
            break;
            case 9:months = "September";
            break;
            case 10:months = "October";
            break;
            case 11:months = "November";
            break;
            case 12:months = "December";
            break;
            default:System.out.println("Entered month doesn't exist.");
        }
        System.out.println(months);
    }
}
