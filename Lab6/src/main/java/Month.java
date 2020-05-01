
import java.util.Objects;

public class Month {

    int monthNumber;
    String monthName;

    public Month() {
        this.monthNumber = 1;
        this.monthName="january";
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;

        if (this.monthNumber <= 12 & this.monthNumber >= 1) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    public Month(String monthName) {
        this.monthName = monthName;
        if (this.monthName.equals("january")) {
            this.monthNumber = 1;
        }
        if (this.monthName.equals("february")) {
            this.monthNumber = 2;
        }
        if (this.monthName.equals("march")) {
            this.monthNumber = 3;
        }
        if (this.monthName.equals("april")) {
            this.monthNumber = 4;
        }
        if (this.monthName.equals("may")) {
            this.monthNumber = 5;
        }
        if (this.monthName.equals("june")) {
            this.monthNumber = 6;
        }
        if (this.monthName.equals("july")) {
            this.monthNumber = 7;
        }
        if (this.monthName.equals("august")) {
            this.monthNumber = 8;
        }
        if (this.monthName.equals(" september")) {
            this.monthNumber = 9;
        }
        if (this.monthName.equals("october")) {
            this.monthNumber = 10;
        }
        if (this.monthName.equals("november")) {
            this.monthNumber = 11;
        }
        if (this.monthName.equals("december")) {
            this.monthNumber = 12;
        }
        /*
        january
        february
        march
        april
        may
        june
        july
        august
        september
        october
        november
        december
         */

    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        if (this.monthNumber <= 12 & this.monthNumber >= 1) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    @Override
    public String toString() {
        return "Month{" + "monthNumber=" + monthNumber + ", monthName=" + monthName + '}';
    }

    @Override
    public boolean equals(Object obj) {

        Month incomingMonth = (Month) obj;

        if (incomingMonth.getMonthName() == this.getMonthName()  &&
            incomingMonth.getMonthNumber() == this.getMonthNumber()) 
		{
            return true;
        } 
		else {
            return false;
        }
	}
    public boolean graterThan(Object obj) {

        Month incomingMonth = (Month) obj;

        if (
            incomingMonth.getMonthNumber() <this.getMonthNumber()) 
		{
            return true;
        } 
		else {
            return false;
        }
	}
    public boolean lessThan(Object obj) {

        Month incomingMonth = (Month) obj;

        if (
            incomingMonth.getMonthNumber() > this.getMonthNumber()) 
		{
            return true;
        } 
		else {
            return false;
        }
	}

    }
