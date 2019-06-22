import java.util.Date;

public class TimeHelper {
	String TimeHelper()
	{
        Date dt = new Date();
        @SuppressWarnings("deprecation")
		int hours = dt.getHours();
		String PartOfTheDay = null;
		if(hours>=4 && hours<=12){
			PartOfTheDay = "Morning";
		} else if(hours>12 && hours<=16){
			PartOfTheDay = "Afternoon";
		} else if(hours>16 && hours<=21){
			PartOfTheDay = "Evening";
		} else if(hours>21 && hours<=24){
			PartOfTheDay = "Night";
		} else if(hours>0 && hours<4){
			PartOfTheDay = "Night";
		}
		return PartOfTheDay;
	}
	
	
}
