package baseClasses;

import java.util.Comparator;

public class MySortClass implements Comparator<String>{

	@Override
	public int compare(String compareList, String thisClassHandle) {
		
		return thisClassHandle.compareTo(compareList);
	}

}
