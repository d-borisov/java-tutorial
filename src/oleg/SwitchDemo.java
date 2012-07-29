package oleg;

import java.util.Calendar;

import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

class SwitchDemo {
  public static void main(String[] args) {
    final Calendar calendar = Calendar.getInstance();
    int month = calendar.get(MONTH);
    int year = calendar.get(YEAR);
    int numDays = 0;

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        numDays = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        numDays = 30;
        break;
      case 2:
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
          numDays = 29;
        else
          numDays = 28;
        break;
      default:
        System.out.println("Invalid month.");
        break;
    }
    System.out.println("Number of Days = " + numDays);
  }


}


class StringSwitchDemo {

  public static int getMonthNumber(String month) {

    if (month == null) {
      return 0;
    }

    switch (month.toLowerCase()) {
      case "january":
        return 1;
      case "february":
        return 2;
      case "march":
        return 3;
      case "april":
        return 4;
      case "may":
        return 5;
      case "june":
        return 6;
      case "july":
        return 7;
      case "august":
        return 8;
      case "september":
        return 9;
      case "october":
        return 10;
      case "november":
        return 11;
      case "december":
        return 12;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {

    String month = "August";

    int returnedMonthNumber =
        StringSwitchDemo.getMonthNumber(month);

    if (returnedMonthNumber == 0) {
      System.out.println("Invalid month");
    } else {
      System.out.println(returnedMonthNumber);
    }
  }
}