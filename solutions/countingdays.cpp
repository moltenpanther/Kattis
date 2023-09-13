#include "countingdays.h"

int timeOld = 0;
int timeNew = 0;
int day = 1;

void lookAtClock(int hours, int minutes) {
    timeNew = (hours * 60) + minutes;
    if(timeNew <= timeOld){
        day++;
    }
    timeOld = timeNew;
}

int getDay() {
    return day;
}

